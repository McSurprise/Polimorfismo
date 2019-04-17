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
public class Entrenador {
    private int id;
    private int edad;
    private String nombre;
    private String apellidos;
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, int edad, String nombre, String apellidos, String idFederacion) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idFederacion = idFederacion;
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

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    /////////////////////////////////
    
    public void Concentrarse(){
        System.out.println("concentrarse en clase entrenador");
    }
    public void Viajar(){
        System.out.println("viajar en clase entrenador");
    }
    public void DirigirPartido(){
        System.out.println("dirigir partido en clsae entrenador");
    }
    public void DirigirEntrenamiento(){
        System.out.println("Dirigir entrenamiento en clase entrendador");
    }
}
