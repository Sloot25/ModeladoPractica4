/*
 * Clase fabrica del tipo Cabina 
 */
package Factory.Cabina; 

public class CabinaFactory {
  
  public CabinaFactory(){}
  /*
   * Metodo fabrica que define que clase de cabina se va a instanciar 
   * 
   * @param cabina: String con el que se identificara la clase de cabina
   * 
   * @return cabinaInterface: instancia de la clase seleccionada
   */
  public CabinaInterface construirCabina(String cabina){
    CabinaInterface cabinaInterface = null; 
    if(cabina.equals("UnPiloto"))
      cabinaInterface = new UnPiloto();
    else if(cabina.equals("TripulacionPequena"))
      cabinaInterface = new TripulacionPequena();
    else if(cabina.equals("Ejercito"))
      cabinaInterface = new Ejercito();
    return cabinaInterface;
  }
}
