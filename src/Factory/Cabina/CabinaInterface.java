/*
 * Interfaz que corresponde al tipo "Producto" del patron factory
 */
package Cabina; 

public interface CabinaInterface{
  public int getAtaque(); 
  public int getDefensa(); 
  public int getVelocidad();
  public int getPrecio();
  public int getPeso();
  public String getName();
}
