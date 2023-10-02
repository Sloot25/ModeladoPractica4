package SistemaDePropulsion; 

public class ViajeInterplanetario implements SistemaDePropulsionInterface{

  public ViajeInterplanetario(){}

  public String getName(){
    return "Viaje Interplanetario";
  }

  public int getVelocidad(){
    return 60;
  }

  public int getPrecio(){
    return 399;
  }
  
}
