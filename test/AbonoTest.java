
import java.time.LocalDate;
import pagame.domain.Abono;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adiga
 */
public class AbonoTest {
    public static void main(String ... args){
        Abono abono =new Abono(1, 30, LocalDate.of(2022,10,30), 1, 1);
        System.out.println("Abono id" + abono.getId());
        System.out.println("Abono cantidad" + abono.getCantidad());
         System.out.println("Abono fecha" + abono.getFecha());
          System.out.println("Abono id cobrador" + abono.getIdCobrador());
           System.out.println("Abono id deudor" + abono.getIdDeudor());
    }
}
