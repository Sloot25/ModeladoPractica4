package SistemaDePropulsion; 

public class ViajeIntercontinental implements SistemaDePropulsionInterface{
  
  public ViajeIntercontinental(){}

  public String getName(){
    return "Viaje Intercontinental";
  }

  public int getVelocidad(){
    return 30;
  }
  public int getPrecio(){
    return 199; 
  }
}
