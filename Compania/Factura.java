package Compania;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    String codigo;
    Tarifa tarAplicada;
    OurCalendar fechaEmisión;
    OurCalendar periodoFac[];
    gestLlamada llamadas; // Importe  -> suma de todas las llamadas por la tarifa

    public Factura() {
    }

    public Factura(Factura otraFactura) {
        this.codigo = otraFactura.codigo;
        this.tarAplicada = otraFactura.tarAplicada;
        this.fechaEmisión = otraFactura.fechaEmisión;
        this.periodoFac = otraFactura.periodoFac;
        this.llamadas = otraFactura.llamadas;
    }
    
    
    public double calculaImporte(Cliente cliente) {
    	double importe = 0.0;
    	double tiempo =0.0;
    	ArrayList<Factura> facturas = cliente.getConjuntoFacturas();
    		for(Factura factura : facturas) {
    			double time = getTiempo(factura);
    			tiempo +=time;
    		}
    	double tarifa = cliente.getTarifa().getPrize();
    	importe = tarifa * tiempo;
    	return importe;
    }
    
    
    public double getTiempo(Factura factura) {
    	gestLlamada llamada = factura.llamadas;
    	double tiempo=0.0;
    	ArrayList<Llamada> llamadas = llamada.getLlamadas();
    	for(Llamada laLlamada : llamadas) { //"hoy he sentido la llamadaa" 
    		tiempo+=laLlamada.duracion;
    	}
    	
    	
		return tiempo;
      }
}
