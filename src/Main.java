import Factory.Menu;
import Factory.NaveFactory;
public class Main {
  public static void main(String[] args) {
    NaveFactory factory = new NaveFactory();
    Menu menu = new Menu(factory);
    menu.mostrarMenu();

  }
}
