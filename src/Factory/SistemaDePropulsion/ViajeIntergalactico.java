/*
 * Producto concreto de sistema de propulsion, seran instanciados en su respectiva fabrica
 */
package SistemaDePropulsion; 

public class ViajeIntergalactico implements SistemaDePropulsionInterface{

  public ViajeIntergalactico(){}

  /*
   * Metodos getters
   */
  @Override
  public int getAtaque() {
    return 0;
  }

  @Override
  public int getDefensa() {
    return 100;
  }

  @Override
  public String getName(){
    return "Viaje Intergalactico";
  }

  @Override
  public int getVelocidad(){
    return 100;
  }

  @Override
  public int getPrecio(){
    return 599;
  }

  @Override
  public int getPeso(){
    return 50;
  }
}
