package Blindaje; 

public class BlindajeSimple implements BlindajeInterface {
  
  public BlindajeSimple(){}

  @Override
  public int getAtaque(){
    return 0; 
  }

  @Override
  public int getDefensa(){
    return 3; 
  }

  @Override 
  public int getVelocidad(){
    return 2;
  }

  @Override 
  public int getPrecio(){
    return 99;
  }

  @Override 
  public int getPeso(){
    return 10;
  }

  @Override 
  public String getName(){
    return "Blindaje Simple";
  }
}
