package Blindaje; 

public class BlindajeFactory{
  
  public BlindajeFactory(){}

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
