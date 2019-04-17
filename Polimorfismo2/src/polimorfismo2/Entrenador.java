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
public class Entrenador extends SeleccionFutbol{
    
    private int idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
   
    //Redefinir los metodos polimorficos
    
    @Override
    public void Viajar(){
        System.out.println("viajar en clase hijo Entrenador(Polimorfico)");
    }
    
    @Override
    public void Concentrarse(){
        System.out.println("Concentrarse en clase hijo Entrenador(Polimorfico)");
    }
    
   ///////////////////////////////////////
    
   public void DirigirPartido(){
       System.out.println("Dirigir partido en Entrenador");
   }
   public void DirigirEntrenamiento(){
       System.out.println("Dirigir entrenamiento en Entrenador");
   }
}
