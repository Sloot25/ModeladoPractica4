package Cabina;

public class Ejercito implements CabinaInterface{
  public Ejercito(){}

  @Override
  public String getName(){
    return "Ejercito";
  }

  @Override 
  public int getPeso(){
    return 100;
  }

  @Override 
  public int getPrecio(){
    return 999;
  }

}
