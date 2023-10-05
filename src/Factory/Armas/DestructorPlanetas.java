/*
 * Producto concreto de armas, seran instanciados en su respectiva fabrica
 */

package Factory.Armas; 

public class DestructorPlanetas implements ArmasInterface{ 
  
  public DestructorPlanetas(){}
  /*
   * Metodos getters
   */
  @Override 
  public int getAtaque(){
    return 100;
  }

  @Override 
  public int getDefensa(){
    return 20; 
  }

  @Override 
  public int getVelocidad(){
    return -30;
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
