/*
 * Clase fabrica del tipo Armas 
 */
package Armas; 

public class ArmasFactory {

  public ArmasFactory(){}
  /*
   * Metodo fabrica que define que clase de armas se va a instanciar 
   * 
   * @param arma: String con el que se identificara la clase de arma
   * 
   * @return armasInterface: instancia de la clase seleccionada
   */
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
