import java.util.Scanner;

package Factory;

public class Menu {
  NaveFactory factory;
  public Menu(NaveFactory factory){
    this.factory = factory;
  } 

  private void imprimirMenu(){
    System.out.println("");
  }
}
