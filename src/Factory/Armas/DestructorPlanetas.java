package Armas; 

public class DestructorPlanetas implements ArmasInterface{ 
  
  public DestructorPlanetas(){}

  @Override 
  public int getAtaque(){
    return 100;
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
