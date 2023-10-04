package SistemaDePropulsion; 

public class ViajeIntercontinental implements SistemaDePropulsionInterface{
  
  public ViajeIntercontinental(){}

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
