package Blindaje; 

public class BlindajeFortaleza implements BlindajeInterface {
  
  public BlindajeFortaleza(){}

  @Override 
  public int getAtaque(){
    return 0;
  }

  @Override
  public int getDefensa(){
    return 15;
  }

  @Override 
  public int getName(){
    return "Blindaje Fortaleza";
  }

  @Override 
  public int getPrecio(){
    return 199;
  }

}
