/*
 * Producto concreto de sistema de propulsion, seran instanciados en su respectiva fabrica
 */
package SistemaDePropulsion; 

public class ViajeIntercontinental implements SistemaDePropulsionInterface{
  
  public ViajeIntercontinental(){}

  /*
   * Metodos getters
   */
  @Override
  public int getAtaque() {
    return 0;
  }

  @Override
  public int getDefensa() {
    return 20;
  }

  public int getVelocidad(){
    return 10;
  }

  public String getName(){
    return "Viaje Intercontinental";
  }


  public int getPrecio(){
    return 199; 
  }

  @Override
  public int getPeso() {
    return 10;
  }
}
