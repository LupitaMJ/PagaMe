/*
 *pagaMe proyecto proyecto desarrollado por TI-701 itess (2019-2023)
 *Visite el sitio https://www.pagame.com.mx

 */
package pagame.domain;
import java.time.LocalDate;
// 
/**
 *
 * @author adiga
 */
public class Abono {
    private int id;
    private float cantidad;
    private LocalDate fecha;
    private int idDeudor;
    private int idCobrador;
    
    public Abono (int id, float cantidad, LocalDate fecha, int idDeudor, int idCobrador)  {
        this.id        =id;
        this.cantidad  =cantidad; 
        this.fecha     =fecha;
        this.idDeudor  =idDeudor;
        this.idCobrador=idCobrador;



        
    }  
    public int getId() {
        return id;
    }
    public float getCantidad() {
        return cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdDeudor() {
        return idDeudor;
    }

    public int getIdCobrador() {
        return idCobrador;
    }
    
}
