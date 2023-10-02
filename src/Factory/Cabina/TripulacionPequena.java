package Cabina; 

public class TripulacionPequena implements CabinaInterface{

  public TripulacionPequena(){}

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
