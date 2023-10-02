package SistemaDePropulsion; 

public class SistemaDePropulsionFactory {
  public SistemaDePropulsionFactory(){}

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
