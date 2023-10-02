package Cabina; 

public class UnPiloto implements CabinaInterface{

  public UnPiloto(){}

  @Override 
  public int getName(){
    return "Un Piloto";
  }

  @Override 
  public int getPrecio(){
    return 199;
  }

  @Override 
  public int getPeso(){
    return 20;
  }

}
