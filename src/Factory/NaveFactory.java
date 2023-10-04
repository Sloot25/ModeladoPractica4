import Armas.ArmasFactory; 
import Armas.ArmasInterface; 
import Blindaje.BlindajeFactory; 
import Blindaje.BlindajeInterface; 
import Cabina.CabinaFactory;
import Cabina.CabinaInterface;
import SistemaDePropulsion.SistemaDePropulsionInterface; 
import SistemaDePropulsion.SistemaDePropulsionFactory;

public class NaveFactory {
  public NaveFactory(){}
  
  public Nave construirNave(String cabina, String blindaje, String sistema, String armas){
    SistemaDePropulsionInterface sistemaDePropulsion = (new SistemaDePropulsionFactory()).construirSistemaPropulsion(sistema);
    BlindajeInterface blindajeInterface = (new BlindajeFactory()).construirBlindaje(blindaje);
    CabinaInterface cabinaInterface = (new CabinaFactory()).construirCabina(cabina);
    ArmasInterface armasInterface = (new ArmasFactory()).construirArmas(armas);

    return new Nave(cabinaInterface, blindajeInterface, sistemaDePropulsion, armasInterface);
  }

}
