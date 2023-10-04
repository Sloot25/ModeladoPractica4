package Armas; 

public class MisilesPlasma implements ArmasInterface{

  public MisilesPlasma(){}

  @Override 
  public int getAtaque(){
    return 50; 
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
  public String getName(){
    return "Misiles de Plasma";
  }
}
