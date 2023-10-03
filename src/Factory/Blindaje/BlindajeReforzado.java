package Blindaje; 

public class BlindajeReforzado implements BlindajeInterface{

  public BlindajeReforzado(){}

  @Override 
  public int getAtaque(){
    return 0;
  }

  @Override 
  public int getDefensa(){
    return 30;
  }

  @Override 
  public int getVelocidad(){
    return -10; 
  }

  @Override 
  public int getPrecio(){
    return 299;
  }

  @Override 
  public int getPeso(){
    return 50;
  }

  @Override 
  public String getName(){
    return "Blindaje Reforzado";
  }
}
