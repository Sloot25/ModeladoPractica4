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
    return cabina.getVelocidad() + blindaje.getVelocidad() + sistema.getVelocidad() + armas.getVelocidad();
  }
  public int getPeso(){
    return cabina.getPeso() + blindaje.getPeso() + sistema.getPeso() + armas.getPeso();
  }
  public int getPrecio(){
    return cabina.getPrecio() + blindaje.getPrecio() + sistema.getPrecio() + armas.getPrecio();
  }
  public int getAtaque(){
    return cabina.getAtaque() + blindaje.getAtaque() + sistema.getAtaque() + armas.getAtaque(); 
  }
  public int getDefensa(){
    return cabina.getDefensa() + blindaje.getDefensa() + sistema.getDefensa() + armas.getDefensa();
  }
  public String toString(){
    return "Nave" + '\n' 
    + "Blindaje: " + blindaje.getName() + '\n' 
    + "Cabina: " + cabina.getName() + '\n' 
    + "Sistema de propulsion: " + sistema.getName() + '\n' 
    + "Armas: " + armas.getName() + '\n'
  }
}
