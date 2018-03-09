package Compania;

import java.util.List;

public class Factura {

    int codigo;
    Tarifa tarAplicada;
    OurCalendar fechaEmisión;
    OurCalendar periodoFac[];
    List<Llamada> llamadas; // Importe  -> suma de todas las llamadas por la tarifa

    public Factura() {
    }

    public Factura(Factura otraFactura) {
        this.codigo = otraFactura.codigo;
        this.tarAplicada = otraFactura.tarAplicada;
        this.fechaEmisión = otraFactura.fechaEmisión;
        this.periodoFac = otraFactura.periodoFac;
        this.llamadas = otraFactura.llamadas;
    }
}
