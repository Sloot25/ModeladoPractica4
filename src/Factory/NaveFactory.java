/*
 * Clase encargada de construir la nave
 */
package Factory;

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
  
  /*
   * Metodo que manda a llamar las fabricas usando los argumentos que recibe
   * para construir un objeto de tipo Nave
   * 
   * @param cabina: string que indica que clase de cabina se va a instanciar
   *        blindaje: string que indica que clase de blindaje se va a instanciar
   *        sistema: string que indica que clase de sistema de propulsion se va a instanciar
   *        armas:  string que indica que clase de arma se va a instanciar
   * 
   * @return nave: Objeto de tipo Nave que reune los atributos provenientes de las clases que recibe
   */
  public Nave construirNave(String cabina, String blindaje, String sistema, String armas){
    SistemaDePropulsionInterface sistemaDePropulsion = (new SistemaDePropulsionFactory()).construirSistemaPropulsion(sistema);
    BlindajeInterface blindajeInterface = (new BlindajeFactory()).construirBlindaje(blindaje);
    CabinaInterface cabinaInterface = (new CabinaFactory()).construirCabina(cabina);
    ArmasInterface armasInterface = (new ArmasFactory()).construirArmas(armas);

    return new Nave(cabinaInterface, blindajeInterface, sistemaDePropulsion, armasInterface);
  }

}
