package Cabina; 

public class UnPiloto implements CabinaInterface{

  public UnPiloto(){}

  @Override
  public int getAtaque() {
    return 10;
  }

  @Override
  public int getDefensa() {
    return 10;
  }

  @Override
  public int getVelocidad() {
    return 10;
  }

  @Override 
  public String getName(){
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
