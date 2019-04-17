/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author LAB
 */
public class Masajista {

    private int id;
    private int edad;
    private int aniosExperiencia;
    private String nombre;
    private String apellidos;
    private String titulacion;

    public Masajista() {
    }

    public Masajista(int id, int edad, int aniosExperiencia, String nombre, String apellidos, String titulacion) {
        this.id = id;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.titulacion = titulacion;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    ////////////////////////////////////////////
    
    public void Concentrarse(){
        System.out.println("Concentrarse en clase masajista");
    }
    public void Viajar(){
        System.out.println("Viajar en clase masajista");
    }
    public void DarMasaje(){
        System.out.println("Dar masaje en clase masajista");
    }
}
