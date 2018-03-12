package Compania;

import java.util.ArrayList;

public class GestFacturas {

	ArrayList<Factura> facturas;
	
	
	public Factura getFactura(String codigo) {
		for(Factura factura : facturas) {
			if(factura.codigo.equals(codigo)) {
				return factura;
			}
		}
		return null;
	}
	
	
}
