package Factory.Cabina; 

public class CabinaFactory {
  
  public CabinaFactory(){}

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
