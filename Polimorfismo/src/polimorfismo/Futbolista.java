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
public class Futbolista {
    private int id;
    private int edad;
    private int dorsal;
    private String nombre;
    private String apellido;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, int edad, int dorsal, String nombre, String apellido, String demarcacion) {
        this.id = id;
        this.edad = edad;
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.demarcacion = demarcacion;
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

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void Concentrarse(){
        System.out.println("Concentrarse en clase futbolista");
    }
    public void Viajar(){
        System.out.println("Viajar en clase futbolista");
    }
    public void JugarPartido(){
        System.out.println("Jugar partido en clase futbolista");
    }
    public void Entrenar(){
        System.out.println("Entrenar en clase futbolista");
    }
}
