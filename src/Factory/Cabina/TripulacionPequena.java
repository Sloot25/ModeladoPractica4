package Cabina; 

public class TripulacionPequena implements CabinaInterface{

  public TripulacionPequena(){}

  @Override
  public int getAtaque() {
    return 20;
  }

  @Override
  public int getDefensa() {
    return 10;
  }

  @Override
  public int getVelocidad() {
    return 0;
  }

  @Override
  public String getName(){
    return "Tripulacion Pequena";
  }
  
  @Override 
  public int getPeso(){
    return 60; 
  }

  @Override 
  public int getPrecio(){
    return 399;
  }

}
