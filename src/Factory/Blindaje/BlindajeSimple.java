/*
 * Producto concreto de blindaje, seran instanciados en su respectiva fabrica
 */
package Factory.Blindaje; 

public class BlindajeSimple implements BlindajeInterface {
  
  public BlindajeSimple(){}
  /*
   * Metodos getters
   */
  @Override
  public int getAtaque(){
    return 0; 
  }

  @Override
  public int getDefensa(){
    return 10; 
  }

  @Override 
  public int getVelocidad(){
    return 10;
  }

  @Override 
  public int getPrecio(){
    return 99;
  }

  @Override 
  public int getPeso(){
    return 10;
  }

  @Override 
  public String getName(){
    return "Blindaje Simple";
  }
}
