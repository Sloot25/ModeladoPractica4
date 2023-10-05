/*
 * Interfaz que corresponde al tipo "Producto" del patron factory
 */
package Armas; 

public interface ArmasInterface{
  public int getAtaque();
  public int getDefensa();
  public int getVelocidad();
  public int getPeso();
  public int getPrecio();
  public String getName();
}
