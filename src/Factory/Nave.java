import Cabina.CabinaInterface;
import Blindaje.BlindajeInterface;
import SistemaDePropulsion.SistemaDePropulsionInterface; 
import Armas.ArmasInterface;

package Factory;

public class Nave {
  private CabinaInterface cabina; 
  private BlindajeInterface blindaje; 
  private SistemaDePropulsion sistema; 
  private ArmasInterface armas; 
  
  public Nave(CabinaInterface cabina, BlindajeInterface blindaje, SistemaDePropulsionInterface sistema, ArmasInterface armas){
    this.cabina = cabina; 
    this.blindaje = blindaje;
    this.sistema = sistema; 
    this.armas = armas;
  }

  public int getVelocidad(){
    return sistema.getVelocidad();
  }
  public int getPeso(){
    return cabina.getPeso() + blindaje.getPeso() + sistema.getPeso() + armas.getPeso();
  }
  public int getPrecio(){
    return cabina.getPrecio() + blindaje.getPrecio() + sistema.getPrecio() + armas.getPrecio();
  }
  public int getAtaque(){
    return armas.getAtaque();
  }
  public int getDefensa(){
    return blindaje.getDefensa();
  }
  public String toString(){
    return "Nave" + '\n' 
    + "Blindaje: " + blindaje.getName() + '\n' 
    + "Cabina: " + cabina.getName() + '\n' 
    + "Sistema de propulsion: " + sistema.getName() + '\n' 
    + "Armas: " + armas.getName() + '\n'
  }
}
