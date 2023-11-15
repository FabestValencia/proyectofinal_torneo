package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Predicate;

public class Torneo{

        private final String nombre;
        private final byte numeroParticipantes;
        private final byte limiteEdad;
        private LocalDate fechaInicio; 
        private LocalDate fechaInicioInscripciones;
        private LocalDate fechaCierreInscripciones;        
        private final int valorInscripcion;
        private final TipoTorneo tipoTorneo;
        private final GeneroTorneo generoTorneo;
        private final Collection<Equipo> equipos;
        private final Collection<Juez> jueces;
       
        /*
         * Creacion del objeto torneo 
         */
        public Torneo(String nombre, LocalDate fechaInicio, LocalDate fechaInicioInscripciones,
                        LocalDate fechaCierreInscripciones, byte numeroParticipantes, byte limiteEdad,
                        int valorInscripcion, TipoTorneo tipoTorneo, GeneroTorneo generoTorneo) {

                assert nombre != null : "El nombre del torneo es requerido";
                setFechaInicio(fechaInicio);
                setFechaInicioInscripciones(fechaInicioInscripciones);
                assert fechaCierreInscripciones != null;
                assert numeroParticipantes >= (byte) 0 : "El numero de participantes no puede ser negativo";
                assert limiteEdad >= (byte)0 : "El limite de edad no puede ser negativo";
                assert valorInscripcion >= 0 : "El valor de la inscripcion no puede ser negativa";
                assert fechaInicio.isAfter(fechaInicioInscripciones) && fechaInicio.isAfter(fechaCierreInscripciones);
                assert fechaCierreInscripciones.isAfter(fechaInicioInscripciones);
                assert tipoTorneo != null : "El tipo de torneo es requerido";
                assert generoTorneo != null : "El genero de torneo es requerido";
                

                this.nombre = nombre;
                this.fechaInicio = fechaInicio;
                this.fechaInicioInscripciones = fechaInicioInscripciones;
                this.fechaCierreInscripciones = fechaCierreInscripciones;
                this.numeroParticipantes = numeroParticipantes;
                this.limiteEdad = limiteEdad;
                this.valorInscripcion = valorInscripcion;
                this.tipoTorneo = tipoTorneo;
                this.equipos = new LinkedList<>();
                this.generoTorneo = generoTorneo;
                this.jueces = new LinkedList<>();
        }

        /*
         * Metodo para obtener nombre
         */
        public String getNombre() {
                return nombre;
        }

        /*
         * Metodo para obtener fecha inicio
         */
        public LocalDate getFechaInicio() {
                return fechaInicio;
        }

        /*
         * Metodo para obtener fecha de inicio inscripciones 
         */
        public LocalDate getFechaInicioInscripciones() {
                return fechaInicioInscripciones;
        }

        /*
         * Metodo para obtener fecha cierre de inscripciones 
         */
        public LocalDate getFechaCierreInscripciones() {
                return fechaCierreInscripciones;
        }

        /*
         * Metodo para obtener numero de participantes 
         */
        public byte getNumeroParticipantes() {
                return numeroParticipantes;
        }

        /*
         * Metodo para obtener limite de edad
         */
        public byte getLimiteEdad() {
                return limiteEdad;
        }

        /*
         * Metodo para obtener valor de inscipcion 
         */
        public int getValorInscripcion() {
                return valorInscripcion;
        }

        /*
         * Metodo para fecha inicio
         */
        public void setFechaInicio(LocalDate fechaInicio) {
                assert fechaInicio != null : "La fecha de inicio del torneo es requerida";
                assert (fechaInicioInscripciones == null || fechaInicio.isAfter(fechaInicioInscripciones))&&
                (fechaCierreInscripciones == null || fechaInicio.isAfter(fechaCierreInscripciones));
                
                this.fechaInicio = fechaInicio;
        }

        /*
         * Metodo para cambiar fecha de inicio inscripciones
         */
        public void setFechaInicioInscripciones(LocalDate fechaInicioInscripciones) {
                assert fechaInicioInscripciones != null;

                this.fechaInicioInscripciones = fechaInicioInscripciones;
        }

        /*
         * Metodo para cambiar fecha de inscripiciones 
         */
        public void setFechaCierreInscripciones(LocalDate fechaCierreInscripciones) {
                this.fechaCierreInscripciones = fechaCierreInscripciones;
        }

        /*
         * Metodo para obtener tipo torneo 
         */
        public TipoTorneo getTipoTorneo() {
                return tipoTorneo;
        }

        /*
         * Metodo para obtener lista de equipos 
         */
        public Collection<Equipo> getEquipos() {
                return Collections.unmodifiableCollection(equipos);
        }

        /*
         * Metodo para obtener lista de jueces
         */
        public Collection<Juez> getJueces() {
                return Collections.unmodifiableCollection(jueces);
        }

        /*
         * Metodo para registrar equipo 
         */
        public void registrarEquipo(Equipo equipo){
                validarEquipoExistente(equipo);
                validarInscripcionesAbiertas();
                equipos.add(equipo);
        }

        /*
         * metodo para validar suscripcion 
         */
        private void validarInscripcionesAbiertas() {
                boolean inscripcionesAbiertas = fechaInicioInscripciones.isBefore(LocalDate.now())
                                                &&fechaCierreInscripciones.isAfter(LocalDate.now());

                assert inscripcionesAbiertas : "Las inscripciones no estan abiertas";
        }

        /*
         * Metodo para validar equipo existente
         */
        private void validarEquipoExistente(Equipo equipo) {
                boolean existeEquipo = buscarEquipoPorNombre(equipo.nombreEquipo()).isPresent();
                assert !existeEquipo : "El equipo ya esta registrado";

        }

        /*
         * Metodo para buscar equipo por nombre
         */
        public Optional<Equipo> buscarEquipoPorNombre(String nombreEquipo) {
                Predicate<Equipo> condicion = equipo -> equipo.nombreEquipo().equals(nombreEquipo);
                return equipos.stream().filter(condicion).findAny();
        }

        /*
         * Metodo para registrar jugador
         */
        public void registrarJugador(String nombreEquipo, Jugador jugador) {
                var equipo = buscarEquipoPorNombre(nombreEquipo);
                equipo.ifPresent((e) -> registrarJugador(e,jugador));

        }

        /*
         * Metodo para registrar un jugador directamente desde el torneo
         */
        public void registrarJugador(Equipo equipo, Jugador jugador) {
                assert !LocalDate.now().isAfter(fechaCierreInscripciones) : "No se puede registrar jugadores despues de la fecha de cierre";
                assert validarGeneroJugador(jugador) != false : "El genero del jugador no coincide con el genero del torneo";
                validarLimiteEdadJugador(jugador);
                validarJugadorExiste(jugador);
                equipo.registrarJugador(jugador);
        }


        /*
         * Valida si el genero del jugador concuerda con el genero del torneo
         */
        private boolean validarGeneroJugador(Jugador jugador) {

                boolean cumpleRequisito = false;
                String generoJugador = jugador.getGeneroJugador()+"";
                String aux = generoTorneo+"";

                switch (generoTorneo) {

                        case MASCULINO:
                        if(generoJugador.equals(aux)){
                                cumpleRequisito = true;
                        }
                                break;

                        case FEMENINO:
                        if(generoJugador.equals(aux)){
                                cumpleRequisito = true;
                        }
                                break;    
                        case MIXTO:
                        cumpleRequisito = true;
                                break;
                }

                return cumpleRequisito;
        }

        /*
         * Metodo para decir que ya se ha registrado este jugador
         */
        private void validarJugadorExiste(Jugador jugador) {
                boolean existeJugador = buscarJugador(jugador).isPresent();
                assert !existeJugador : "El jugador ya esta registrado";
        }

        /*
         * Metodo para buscar un jugador
         */
        private Optional<Jugador> buscarJugador(Jugador jugador) {
                return equipos.stream()
                .map(equipo -> equipo.buscarJugador(jugador))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findAny();
        }

        /*
         * Metodo para validar
         *  limite de edad de un jugador
         */
        private void validarLimiteEdadJugador(Jugador jugador) {
                var edadAInicioTorneo = jugador.calcularEdad(fechaInicio);
                assert limiteEdad == 0 || limiteEdad >= edadAInicioTorneo : "No se pueden registrar jugadores que excedan el limite de edad del torneo";
        }

        /*
         * Metodo para registrar juez
         */
        public void registrarJuez(Juez juez){
                assert !LocalDate.now().isAfter(fechaCierreInscripciones) : "No se puede registrar jueces despues de la fecha de cierre";
                validarJuezExistente(juez);
                jueces.add(juez);
        }

        /*
         * Metodo para validar un juez que ya existe
         */
        private void validarJuezExistente(Juez juez) {
                boolean existeJuez = buscarJuezPorLicencia(juez.getLicencia()).isPresent();
                assert !existeJuez : "El juez ya esta registrado";
        }

        /*
         * Metodo para buscar un juez por su licencia
         */
        public Optional<Juez> buscarJuezPorLicencia(String licencia) {
                Predicate<Juez> condicion = juez -> juez.getLicencia().equals(licencia);
                return jueces.stream().filter(condicion).findAny();
        }
        
        /*
         * Metodo para obtener genero torneo
         */
        public GeneroTorneo getGeneroTorneo() {
                return generoTorneo;
        }
    
}
