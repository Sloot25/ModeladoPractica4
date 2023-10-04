package Blindaje; 

public class BlindajeSimple implements BlindajeInterface {
  
  public BlindajeSimple(){}

  @Override
  public int getDefensa(){
    return 10; 
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
