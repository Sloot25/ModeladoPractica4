/*
 * En esta clase se crea el menu de usuario que será mandando a llamar
 * en el Main
 */
package Factory;

import java.util.Scanner;


public class Menu {
  NaveFactory factory;
  int presupuesto;
  Scanner in;
  public Menu(NaveFactory factory){
    this.factory = factory;
    this.presupuesto = 0;
    in = new Scanner(System.in);
  } 
  /*
   * Metodos para mostrar las opciones de usuarios
   * 
   * @return String con las opciones que tiene el usuario para escoger
   */
  private String getArmas(){
    return "Selecciona un arma: " + '\n' +
    "1. Laser simple" + '\n' +
    "2. Misiles de plasma" + '\n' +
    "3. Laser destructor de planetas";
  }
  private String getBlindaje(){
    return "Selecciona un blindaje: " + '\n' +
    "1. Blindaje Simple" + '\n' + 
    "2. Blindaje reforzado" + '\n' + 
    "3. Blindaje Fortaleza";
  }
  private String getCabina(){
    return "Selecciona una cabina: " + '\n' + 
    "1. 1 piloto " + '\n' + 
    "2. Tripulacion Pequena " + '\n' +
    "3. Ejercito ";
  }

  private String getSistema(){
    return "Selecciona un sistema de propulsion: " + '\n' + 
    "1. Viaje intercontinental " + '\n' + 
    "2. Viaje interplanetario " + '\n' + 
    "3. Viaje intergalactico" ;
  }

  /*
   *  Metodo que le pide al usuario un presupuesto
   */
  private void escogerPresupuesto(){
    System.out.println("Ingresa tu presupuesto: ");
    int bandera = this.presupuesto;
    while(this.presupuesto == bandera){
      try{
        this.presupuesto = in.nextInt();
      }catch(Exception e){
        System.err.println("Ingresa un presupuesto");
      }
    }
  }

  /*
   *  Metodo que le pide al usuario escoger entre las opciones de escoger arma
   * sistema de propulsion, cabina y blindaje. Utiliza los metodos getters 
   * de arriba para brindar las opciones.
   * 
   * @return nave: objeto de tipo Nave con los atributos seleccionados
   */
  private Nave crearNave(){
    String armas, cabina, blindaje, sistema; 
    armas = sistema = cabina = blindaje = null;
    int opcion= 0;
    while(opcion != 1 && opcion != 2 && opcion != 3){
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
      }catch(Exception e){
        System.err.println("Ese no es un numero");
      }
    }
    opcion = 0;
    while(opcion != 1 && opcion != 2 && opcion != 3){
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
      }catch(Exception e){
        System.err.println("Ese no es un numero");
      }
    }
    opcion = 0; 
    while (opcion != 1 && opcion != 2 && opcion != 3) {
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
      } catch(Exception ex){
        System.err.println("Ese no es un numero");
      }
    }
    opcion = 0;
    while (opcion != 1 && opcion != 2 && opcion != 3) {
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
      }catch(Exception ex){
        System.err.println("Ese no es un numero");
      }
    }
    return factory.construirNave(cabina, blindaje, sistema, armas);
  }

  /*
   * Metodo que sera usado en el main para mostrar el menu
   */
  public void mostrarMenu(){
    System.out.println("***************************************************");
		System.out.println("*                                                 *");
		System.out.println("*    SISTEMA DE DISEÑO DE NAVES DEL IMPERIO       *");
		System.out.println("*                                                 *");
		System.out.println("***************************************************\n");
    escogerPresupuesto();
    Nave nave = crearNave();
    revisarPresupuesto(nave);
  }

  /*
   * Metodo que se ejecuta una vez terminada de escoger las partes de la nave personalizada. 
   * En caso de que si haya alcanzado el presupuesto, finaliza el programa. En caso de que
   * no, le muestra el catalogo de naves predisenadas al usuario
   * 
   * @param nave:  Nave creada por el usuario
   */
  private void revisarPresupuesto(Nave nave){
    if(nave.getPrecio() > this.presupuesto){
      int opcion = 0; 
      System.out.println("El costo de tu nave sobrepasa tu presupuesto. Escoge una de las siguientes opciones: ");
      while(opcion != 1 && opcion != 2 ){
        try{
          System.out.println("1. Diseniar otra nave");
          System.out.println("2. Ver nuestro catalogo");
          System.out.println("3. Salir");
          opcion = in.nextInt();
          System.out.println("Ingresa alguna de las opciones");
          switch (opcion) {
            case 1:
              nave = crearNave();
              revisarPresupuesto(nave);
              return;
            case 2: 
              nave = mostrarDefault();
              return;
            case 3:
              return;
            default:
              System.out.println("ELige algunas de las opciones");
              break;
          }
        } catch(NumberFormatException ex){
          System.err.println("Ingresa un numero");
        }
      }
    }else{
      System.out.println("Tu nave esta lista para recoger. Revisa sus caracteristicas:");
      System.out.println(nave);
      System.out.println("Paga en la caja: " + nave.getPrecio());
    }   
  }

  /*
   *  Metodo para mostrar las naves predisenadas
   * 
   * @return: informacion de la nave predisenada
   */
  private Nave mostrarDefault(){
    int opcion = 0;
    Nave nave = null;
    System.out.println("Escoge una opcion de nuestro catalogo: ");
        System.out.println("1. Nave individual de combate");
        System.out.println("2. Nave militar de transporte");
        System.out.println("3. Base espacial de guerra");
        System.out.println("4. Salir del menu");
    while(opcion != 1 && opcion != 2 && opcion != 3  && opcion != 4){
      try{
        opcion = in.nextInt();
        switch (opcion) {
          case 1:
            nave = factory.construirNave("UnPiloto","BlindajeReforzado","ViajeInterplanetario","LaserSimple");
            System.out.println("Los detalles de la nave:\n");
            System.out.println(nave);
            if(nave.getPrecio() > this.presupuesto){
              System.out.println("Presupuesto insuficiente. Escoge otra opcion:");
              System.out.println("1. Nave individual de combate");
              System.out.println("2. Nave militar de transporte");
              System.out.println("3. Base espacial de guerra");
              System.out.println("4. Salir del catalogo");
              opcion = 0;
              continue;
            }else{
              break;
            }
          case 2: 
            nave = factory.construirNave("TripulacionPequena", "BlindajeReforzado", "ViajeIntercontinental", "MisilesPlasma");
            System.out.println("Los detalles de la nave:\n");
            System.out.println(nave);
            if(nave.getPrecio() > this.presupuesto){
              System.out.println("Presupuesto insuficiente. Escoge otra opcion:");
              System.out.println("1. Nave individual de combate");
              System.out.println("2. Nave militar de transporte");
              System.out.println("3. Base espacial de guerra");
              System.out.println("4. Salir del catalogo");
              opcion = 0;
              continue;
            }else{
              break;
            }
          case 3: 
            nave = factory.construirNave("Ejercito", "BlindajeReforzado", "ViajeIntergalactico", "DestructorPlanetas");
            System.out.println("Los detalles de la nave:\n");
            System.out.println(nave);
            if(nave.getPrecio() > this.presupuesto){
              System.out.println("Presupuesto insuficiente. Escoge otra opcion:");
              System.out.println("1. Nave individual de combate");
              System.out.println("2. Nave militar de transporte");
              System.out.println("3. Base espacial de guerra");
              System.out.println("4. Salir del catalogo");
              opcion = 0;
              continue;
            }else{
              break;
            }
          case 4:
            System.out.println("Saliendo del menu...");
            break;  
          default:
            System.out.println("Ingresa alguna de las opciones");
            break;
        }
      } catch(Exception ex){
        System.err.println("Ingresa un numero");
      }
    }
    return nave;
  }
  
}