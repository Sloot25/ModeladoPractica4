package Factory.Armas; 

public class LaserSimple implements ArmasInterface{ 

  public LaserSimple(){}

  @Override 
  public int getAtaque(){
    return 30;
  }
  
  @Override 
  public int getDefensa(){
    return 10; 
  }

  @Override
  public int getVelocidad(){
    return 10;
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
  public String getName(){
    return "Laser Simple";
  }
} 
