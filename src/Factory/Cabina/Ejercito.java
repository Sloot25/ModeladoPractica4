/*
 * Producto concreto de cabina, seran instanciados en su respectiva fabrica
 */
package Factory.Cabina;

public class Ejercito implements CabinaInterface{
  public Ejercito(){}
  /*
   * Metodos getters
   */
  @Override
  public int getAtaque() {
    return 50;
  }

  @Override
  public int getDefensa() {
    return 20;
  }

  @Override
  public int getVelocidad() {
    return -10;
  }

  @Override
  public String getName(){
    return "Ejercito";
  }

  @Override 
  public int getPeso(){
    return 100;
  }

  @Override 
  public int getPrecio(){
    return 999;
  }

}
