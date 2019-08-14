/* Modelo */
package cine.modelo;

import static cine.controlador.Controlador.cnt_Ids;
import cine.vista.FormRegistroPelicula;
import java.util.ArrayList;

public class Modelo {
    private ArrayList<Actor> actores;
    private ArrayList<Calificacion> calificaciones;
    private ArrayList<Cine> cines;
    private ArrayList<Entrada> entradas;
    private ArrayList<Genero> generos;
    private ArrayList<HorarioFuncion> horariosFunciones;
    private ArrayList<PaisDeOrigen> paisesDeOrigen;
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Personaje> personajes;
    private ArrayList<Programacion> programaciones;
    private ArrayList<Rol> roles;
    private ArrayList<Sala> salas;
    private ArrayList<Sexo> sexos;

    public Modelo() {
        this.actores = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
        this.cines = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.generos = new ArrayList<>();
        this.horariosFunciones = new ArrayList<>();
        this.paisesDeOrigen = new ArrayList<>();
        this.peliculas = new ArrayList<>();
        this.personajes = new ArrayList<>();
        this.programaciones = new ArrayList<>();
        this.roles = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.sexos = new ArrayList<>();

    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros() {
        this.generos.add(new Genero("Acción"));
        this.generos.add(new Genero("Belica"));
        this.generos.add(new Genero("Comedia"));
        this.generos.add(new Genero("Drama"));
        this.generos.add(new Genero("Suspenso"));
        this.generos.add(new Genero("Terror)"));
    }

    public ArrayList<PaisDeOrigen> getPaisesDeOrigen() {
        return paisesDeOrigen;
    }

    public void setPaisesDeOrigen() {
        this.paisesDeOrigen.add(new PaisDeOrigen("Español", "Argentina"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Inglés", "Australia"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Inglés", "Estados Unidos"));
        this.paisesDeOrigen.add(new PaisDeOrigen("Francés", "Francia"));
    }

    public ArrayList<Sexo> getSexos() {
        return sexos;
    }

    public void setSexos() {
        this.sexos.add(new Sexo("Masculino"));
        this.sexos.add(new Sexo("Femenino"));
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void guardarPeliculas(FormRegistroPelicula vista, int id) {
        Pelicula pelicula = new Pelicula();
        pelicula.setId(id);
        pelicula.vista(vista.getTxtNombrePelicula().getText());
        pelicula.setDuracion(Integer.parseInt(vista.getTxtDuracionMinutos()
                .getText()));
        pelicula.setTituloOriginal(vista.getTxtTituloOriginal().getText());
        pelicula.setAnioEstreno((int) vista.getCmbAnioEstreno().getSelectedItem());
        boolean disponibilidad = ((vista.getRadioBtnDisponibleSi().isSelected()));
        pelicula.setDisponible(disponibilidad);
        this.getPeliculas().add(pelicula);
        // System.out.println(this.getPeliculas().toString());
    }
}