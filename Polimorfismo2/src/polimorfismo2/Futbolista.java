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
public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    
    //Redefinir los metodos polimorficos
    
    @Override
    public void Viajar(){
        System.out.println("viajar en clase hijo Futbolista(Polimorfico)");
    }
    
    @Override
    public void Concentrarse(){
        System.out.println("Concentrarse en clase hijo Futbolista(Polimorfico)");
    }
     
   ///////////////////////////////////////
    
   public void JugarPartido(){
       System.out.println("Jugar partido en Futbolista");
   }
   public void Entrenar(){
       System.out.println("Entrenar en futbolista");
   }
      
}
