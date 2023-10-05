/*
 * Producto concreto de armas, seran instanciados en su respectiva fabrica
 */
package Armas; 

public class MisilesPlasma implements ArmasInterface{

  public MisilesPlasma(){}
  /*
   * Metodos getters
   */
  @Override 
  public int getAtaque(){
    return 50; 
  }

  @Override 
  public int getVelocidad(){
    return 0; 
  }

  @Override
  public int getDefensa(){
    return 20;
  }

  @Override
  public int getPrecio(){
    return 199;
  }

  @Override 
  public int getPeso(){
    return 4;
  }

  @Override 
  public String getName(){
    return "Misiles de Plasma";
  }
}
