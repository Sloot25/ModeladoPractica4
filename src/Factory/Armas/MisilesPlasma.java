package Armas; 

public class MisilesPlasma implements ArmasInterface{

  public MisilesPlasma(){}

  @Override 
  public int getAtaque(){
    return 5; 
  }

  @Override 
  public int getVelocidad(){
    return 0; 
  }

  @Override
  public int getDefensa(){
    return 2;
  }

  @Override
  public int getPrecio(){
    return 199;
  }

  @Override 
  public int getPeso(){
    return 4;
  }

  @Override 
  public String getNombre(){
    return "Misiles de Plasma";
  }
}