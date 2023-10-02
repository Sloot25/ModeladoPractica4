package Armas; 

public class DestructorPlanetas implements ArmasInterface{ 
  
  public DestructorPlanetas(){}

  @Override 
  public int getAtaque(){
    return 10;
  }

  @Override 
  public int getDefensa(){
    return 2; 
  }

  @Override 
  public int getVelocidad(){
    return -3;
  }

  @Override 
  public int getPrecio(){
    return 299; 
  }

  @Override 
  public int getPeso(){
    return 8;
  }
  
  @Override 
  public String getName(){
    return "Destructor de Planetas";
  }
}
