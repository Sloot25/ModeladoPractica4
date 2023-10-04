import java.util.Scanner;

package Factory;

public class Menu {
  NaveFactory factory;
  int presupuesto;
  public Menu(NaveFactory factory){
    this.factory = factory;
    this.presupuesto = 0;
  } 

  private String getArmas(){
    return "Selecciona un arma: " + '\n' +
    "1. Laser simple" + '\n' +
    "2. Misiles de plasma" + '\n' +
    "3. Laser destructor de planetas" + '\n';
  }
  private String getBlindaje(){
    return "Selecciona un blindaje: " + '\n' +
    "1. Blindaje Simple" + '\n' + 
    "2. Blindaje reforzado" + '\n' + 
    "3. Blindaje Fortaleza" + '\n';
  }
  private String getCabina(){
    return "Selecciona una cabina: " + '\n' + 
    "1. 1 piloto " + '\n' + 
    "2. Tripulacion Pequena " + '\n' +
    "3. Ejercito " + '\n';
  }

  private String getSistema(){
    return "Selecciona un sistema de propulsion: " + '\n' + 
    "1. Viaje intercontinental " + '\n' + 
    "2. Viaje interplanetario " + '\n' + 
    "3. Viaje intergalactico" + '\n';
  }

  private Nave crearNave(){
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa tu presupuesto: ");
    while(this.presupuesto == 0){
      try {
        this.presupuesto = in.nextInt();
      } catch (Exception e) {
        System.err.println("Ingresa un presupuesto");
      }
    }
    String armas, cabina, blindaje, sistema; 
    armas = sistema = cabina = blindaje = null;
    int opcion= 0;
    while(opcion != 1 || opcion != 2 || opcion != 3){
      try{
        System.out.println(getArmas());
        opcion = in.nextInt();
        switch (opcion) {
          case 1:
            armas = "LaserSimple";
            break;
          case 2: 
            armas = "MisilesPlasma";
            break;
          case 3: 
            armas = "DestructorPlanetas";
            break;
          default:
            System.out.println("Selecciona alguna de nuestras opciones");
            break;
        }
      }catch(NumberFormatException e){
        System.err.println("Ese no es un numero");
      }
    }
    opcion = 0;
    while(opcion != 1 || opcion != 2 ||opcion != 3){
      try{
        System.out.println(getSistema());
        opcion = in.nextInt(); 
        switch (opcion) {
          case 1:
            sistema = "ViajeIntercontinental";
            break;
          case 2: 
            sistema = "ViajeInterplanetario";
            break;
          case 3: 
            sistema = "ViajeIntergalactico";
            break;
          default:
            System.out.println("Selecciona alguna de nuestras opciones");
            break;
        }
      }catch(NumberFormatException e){
        System.err.println("Ese no es un numero");
      }
    }
    opcion = 0; 
    while (opcion != 1 || opcion != 2 || opcion != 3) {
      try{
        System.out.println(getCabina());
        opcion = in.nextInt();
        switch (opcion) {
          case 1:
            cabina = "UnPiloto";
            break;
          case 2: 
            cabina = "TripulacionPequena";
            break; 
          case 3: 
            cabina = "Ejercito";
            break;
          default:
            System.out.println("Selecciona alguna de nuestras opciones");
            break;
        }
      } catch(NumberFormatException ex){
        System.err.println("Ese no es un numero");
      }
    }
    opcion = 0;
    while (opcion != 1 || opcion != 2 || opcion != 3) {
      try{
      System.out.println(getBlindaje());
      opcion = in.nextInt();
      switch (opcion) {
        case 1:
          blindaje = "BlindajeSimple";
          break;
        case 2: 
          blindaje = "BlindajeReforzado";
          break; 
        case 3: 
          blindaje = "BlindajeFortaleza";
          break;
        default:
          System.out.println("Selecciona alguna de nuestras opciones");
          break;
      }
      }catch(NumberFormatException ex){
        System.err.println("Ese no es un numero");
      }
    }
    return factory.construirNave(cabina, blindaje, sistema, armas);
  }

  public void mostrarMenu(){
    Nave nave = construirNave();
  }

}
