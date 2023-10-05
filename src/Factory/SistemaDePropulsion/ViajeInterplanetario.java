/*
 * Producto concreto de sistema de propulsion, seran instanciados en su respectiva fabrica
 */
package Factory.SistemaDePropulsion; 

public class ViajeInterplanetario implements SistemaDePropulsionInterface{

  public ViajeInterplanetario(){}
  /*
   * Metodos getters
   */
  public String getName(){
    return "Viaje Interplanetario";
  }

  public int getVelocidad(){
    return 60;
  }

  public int getPrecio(){
    return 399;
  }

  @Override
  public int getAtaque() {
    return 0;
  }

  @Override
  public int getDefensa() {
    return 10;
  }

  @Override
  public int getPeso() {
    return 30;
  }
  
}
