
package Factory;

import Factory.Armas.ArmasFactory; 
import Factory.Armas.ArmasInterface; 
import Factory.Blindaje.BlindajeFactory; 
import Factory.Blindaje.BlindajeInterface; 
import Factory.Cabina.CabinaFactory;
import Factory.Cabina.CabinaInterface;
import Factory.SistemaDePropulsion.SistemaDePropulsionInterface; 
import Factory.SistemaDePropulsion.SistemaDePropulsionFactory;

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
