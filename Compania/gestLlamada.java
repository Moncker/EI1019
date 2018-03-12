package Compania;

import java.util.ArrayList;


public class gestLlamada {
	
	
	public ArrayList<Llamada> llamadas;
	
	public ArrayList<Llamada> getLlamadas(){
		
		return llamadas;
	}
	
	public void addLlamada(Llamada llamada) {
		llamadas.add(llamada);
	}
	

	
	

}
