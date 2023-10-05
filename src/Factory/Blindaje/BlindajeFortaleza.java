/*
 * Producto concreto de blindaje, seran instanciados en su respectiva fabrica
 */
package Factory.Blindaje; 

public class BlindajeFortaleza implements BlindajeInterface {
  
  public BlindajeFortaleza(){}

  /*
   * Metodos getters
   */
  @Override 
  public int getAtaque(){
    return 0;
  }

  @Override
  public int getDefensa(){
    return 100;
  }

  @Override
  public int getVelocidad() {
    return -30;
  }

  @Override 
  public String getName(){
    return "Blindaje Fortaleza";
  }

  @Override 
  public int getPrecio(){
    return 199;
  }

  @Override 
  public int getPeso(){
    return 100;
  }


}
