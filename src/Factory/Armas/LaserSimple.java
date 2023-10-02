package Armas; 

public class LaserSimple implements ArmasInterface{ 

  public LaserSimple(){}

  @Override 
  public int getAtaque(){
    return 3;
  }
  
  @Override 
  public int getDefensa(){
    return 1; 
  }

  @Override
  public int getVelocidad(){
    return 1;
  }

  @Override 
  public int getPrecio(){
    return 99;
  }

  @Override 
  public int getPeso(){
    return 1;
  }

  @Override 
  public String getNombre(){
    return "Laser Simple";
  }
} 
