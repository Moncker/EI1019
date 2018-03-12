package Compania;

import java.util.ArrayList;
import java.util.List;

public class gestClient {

    private List<Cliente> conjClientes;

    public gestClient() {

    }

    public gestClient(gestClient otroGestionador) {
        conjClientes = otroGestionador.conjClientes;
    }


    /**
     * addClient -> Dar de alta un nuevo cliente
     * -> En definitiva, colocar un nuevo Objeto Cliente en conjClientes
     */


    public void addClient(Cliente cliente) {
        conjClientes.add(cliente);
    }

    /**
     * deleteClient -> Borrar un cliente
     */

    public boolean deleteClient(Cliente cliente) {

        if (conjClientes.contains(cliente))
            return true;

        return false;

    }

    /**
     * changeTarifa -> Cambiar la tarifa de un cliente
     */


    public void changeTarifa( Cliente cliente, Tarifa tarifa ){
        cliente.setTarifa(tarifa);
    }



    /**
     * searchClient -> Buscar Cliente por NIF
     */

    public Cliente searchClient ( String nif ) {

        for (Cliente cli : conjClientes)
            if (cli.getNIF() == nif)
                return cli;
        return null;
    }

    public ArrayList<Factura> getFacturas(Cliente cliente){
    	
    	
    	
    	return cliente.getConjuntoFacturas();
		  	
    }
    
    
    
    
    

}














