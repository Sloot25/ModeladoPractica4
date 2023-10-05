/*
 * Clase fabrica del tipo Blindaje 
 */
package Blindaje; 

public class BlindajeFactory{
  
  public BlindajeFactory(){}
   /*
   * Metodo fabrica que define que clase de blindaje se va a instanciar 
   * 
   * @param blindaje: String con el que se identificara la clase de blindaje
   * 
   * @return blindajeInterface: instancia de la clase seleccionada
   */
  public BlindajeInterface construirBlindaje(String blindaje){
    BlindajeInterface blindajeInterface = null; 
    if(blindaje.equals("BlindajeSimple"))
      blindajeInterface = new BlindajeSimple();
    else if(blindaje.equals("BlindajeReforzado"))
      blindajeInterface = new BlindajeReforzado();
    else if(blindaje.equals("BlindajeFortaleza"))
      blindajeInterface = new BlindajeFortaleza();
    return blindajeInterface;
  }
}
