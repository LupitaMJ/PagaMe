
package pagame.domain;

import java.time.LocalDate;

public class Deuda {
    private int  id;
    private float  monto;
    private LocalDate  fecha;
    private int  idDeudor;

public Deuda(int id, float monto, LocalDate fecha, int idDeudor){

}

    public float getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIdDeudor() {
        return idDeudor;
    }
}