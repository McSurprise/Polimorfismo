/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

/**
 *
 * @author LAB
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int anioExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(String titulacion, int anioExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anioExperiencia = anioExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnioExperiencia() {
        return anioExperiencia;
    }

    public void setAnioExperiencia(int anioExperiencia) {
        this.anioExperiencia = anioExperiencia;
    }
    
     //Redefinir los metodos polimorficos
    
    @Override
    public void Viajar(){
        System.out.println("viajar en clase hijo Masajista(Polimorfico)");
    }
    
    @Override
    public void Concentrarse(){
        System.out.println("Concentrarse en clase hijo Masajista(Polimorfico)");
    }
     
   ///////////////////////////////////////
    
   public void DarMasaje(){
       System.out.println("Dar masaje en masajista");
   }
    
}
