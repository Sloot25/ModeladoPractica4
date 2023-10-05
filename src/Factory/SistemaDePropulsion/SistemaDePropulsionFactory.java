/*
 * Clase fabrica del tipo Sistema de propulsion 
 */
 
package Factory.SistemaDePropulsion; 

public class SistemaDePropulsionFactory {
  public SistemaDePropulsionFactory(){}

  /*
   * Metodo fabrica que define que clase de Sistema de propulsion se va a instanciar 
   * 
   * @param sistema: String con el que se identificara la clase de sistema de propulsion
   * 
   * @return sistemaDePropulsion: instancia de la clase seleccionada
   */
  public SistemaDePropulsionInterface construirSistemaPropulsion(String sistema){
    SistemaDePropulsionInterface sistemaDePropulsion = null; 
    if(sistema.equals("ViajeIntercontinental"))
      sistemaDePropulsion = new ViajeIntercontinental();
    else if(sistema.equals("ViajeInterplanetario"))
      sistemaDePropulsion = new ViajeInterplanetario();
    else if(sistema.equals("ViajeIntergalactico"))
      sistemaDePropulsion = new ViajeIntergalactico();
    return sistemaDePropulsion;
  }


}
