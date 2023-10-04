package Armas; 

public class ArmasFactory {
  public ArmasInterface construirArmas(String arma){
    ArmasInterface armasInterface = null; 
    if(arma.equals("DestructorPlanetas"))
      armasInterface = new DestructorPlanetas();
    if(arma.equals("MisilesPlasma"))
      armasInterface = new MisilesPlasma();
    if(arma.equals("LaserSimple"))
      armasInterface = new LaserSimple();
    return armasInterface; 
  }
}
