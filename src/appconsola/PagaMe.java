
package appconsola;

import pagame.domain.*;
import java.util.Scanner;


public class PagaMe {
    //Datos clase pagame
    
    Deudor deudor[] = new Deudor [100];
    int numDeudor =0;
    
    public static void main(String[] args) {
         PagaMe pagame = new PagaMe();
        
         int opcion = pagame.menuPrincipal();
         switch (opcion){
             case 1: pagame.mostrarDeudores(); break;
             case 2: pagame.mostrarDeudores(); break;
             case 0: return;
         }
        
    }
    public PagaMe(){
        init();

  }
    public int menuPrincipal(){
    System.out.println("----------PagaMe-----");
    
    
    System.out.println("1. Crear Deudor.");
    System.out.println("2.   Ver Deudores. ");
    System.out.println("0.  Salir");
    
     System.out.println();
     System.out.println("Introducir opcion: ");
     
     
     //leer opccion
     Scanner sc = new Scanner(System.in);
     
     // entrada de una cadena
     String opcion = sc.nextLine();
     
      //System.out.println("Tu opcion es:" + opcion);
    
    return Integer.parseInt(opcion);
    
    }
  public void creadorDeudor(){
      System.out.println("--PagaMe: Crear Deudor----");
  }
   public void mostrarDeudores(){
       System.out.println("--PagaMe: Mostrar Deudores----");
    for(int i =0;i<numDeudor; i++){
        
        
          System.out.println("Deudor id:" + deudor [i].getId());
          System.out.println("Deudor nombre:" + deudor[i].getNombre());
          System.out.println("Deudor direccion:" + deudor[i].getDireccion());
          System.out.println("Deudor cantidad:" + deudor[i].getSaldo());
          System.out.println();
    }
    
   }
   public void init(){
       
       deudor[numDeudor] =new Deudor(1, "Juan Perez", "Calle falsa 112", - 4000.1f);
        numDeudor++;
       deudor [numDeudor++] =new Deudor(1, "Maria Lopez","Calle falsa 3");
       
       }
   }