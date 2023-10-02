package SistemaDePropulsion; 

public class ViajeIntergalactico implements SistemaDePropulsionInterface{

  public ViajeIntergalactico(){}

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
}
