package Compania;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

	public static void menuConsola() {
		System.out.println("BIENVENIDO AL MENÚ"
				+ "versión 1.0  pantalla EDITION"); 
		System.out.println("¿Qué deseas hacer?"
				+ "Para editar, elija la opción"
				+ "Para Clientes, pulse A"
				+ "Para Llamadas, pulse B"
				+ "Para Facturas, pulse C"
	);
				
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
				
		switch(cadena.toUpperCase()) { //por si el usuario usa minúsculas usando upperCase
		case ("A"):
			System.out.println("Modo Clientes"
					+ "¿Qué desea hacer?"
					+ "Para Dar de alta a un cliente, pulse A"
					+ "Para Borrar un cliente, Pulse B"
					+ "Para Cambiar la tarifa de un cliente, pulse B"
					+ "Para recuperar los datos de un cliente, pulse C"
					+ "Para recuperar el listado de todos los cliente, pulse D"
					);
		sc = new Scanner(System.in);
		String subcadenaA = sc.nextLine();
		switch(cadena.toUpperCase()) {
		
		case ("A"): //Dar de ALTA
			//creamos un nuevo cliente y preguntamos los datos
			Cliente nuevoCliente = null;

			System.out.println("Por favor, introduce el nombre");
			sc = new Scanner(System.in);
			String nombre = sc.nextLine();
			nuevoCliente.setNombre(nombre);
			System.out.println("Por favor, introduce el NIF");
			sc = new Scanner(System.in);
			String nif = sc.nextLine();
			nuevoCliente.setNIF(nif);
			System.out.println("Por favor, introduce la dirección");
			sc = new Scanner(System.in);
			String direccion = sc.nextLine();
			System.out.println("Por favor, introduce el correo electrónico");
			sc = new Scanner(System.in);
			String correoElec = sc.nextLine();
			nuevoCliente.setCorreoElec(correoElec);
			System.out.println("Por favor, introduce la tarifa");
			sc = new Scanner(System.in);
			String laTarifa2 = sc.nextLine();
			double laTarifa = Double.parseDouble(laTarifa2);
			Tarifa tarifa = new Tarifa(laTarifa);
			nuevoCliente.setTarifa(tarifa);
			ArrayList<Factura> facturas;
			
			
			
		case ("B"):
			System.out.println("por favor, introduzca el NIF del cliente");
			Scanner cl = new Scanner(System.in);
			String DNI = cl.nextLine();
			
			Cliente persona = gestClient.searchClient(DNI);
			gestClient.deleteClient( persona);
			
		case ("C"):
			
			System.out.println("por favor, introduzca el NIF del cliente");
			cl = new Scanner(System.in);
			String n = cl.nextLine();
			persona = gestClient.searchClient(n);
			System.out.println("por favor, introduzca la tarifa del cliente");
			cl = new Scanner(System.in);
			Double tarifa2 = cl.nextDouble();
			Tarifa tarifaFinal = new Tarifa(tarifa2);
			gestClient.changeTarifa(persona, tarifaFinal);
			
		case ("D"):
			System.out.println("por favor, introduzca el NIF del cliente");
			cl = new Scanner(System.in);
			 nif = cl.nextLine();
			
			 persona = gestClient.searchClient(nif);

			
		case ("E"):
			System.out.println("ERROR");
		
		}
					
			
		case ("B"):
			System.out.println("MODO LLAMADAS"
					+ "Para dar de alta una llamda, Pulse A"
					+ "para listar todas las llamadas, Pulse B");
			
		sc = new Scanner(System.in);
		String subcadenaB = sc.nextLine();
		switch(cadena.toUpperCase()) {
		case ("A"):
			
			Llamada laLlamada = new Llamada();
			gestLlamada.llamadas.add(laLlamada);
			
			
			
		case ("B"):	
			
			System.out.println("por favor, introduzca el NIF del cliente");
		Scanner cl = new Scanner(System.in);
		String DNI = cl.nextLine();
		Cliente persona = gestClient.searchClient(DNI);
		for(Factura factura : persona.getConjuntoFacturas()) {
			gestLlamada dejavu = factura.llamadas;
			ArrayList<Llamada> perone = dejavu.getLlamadas();
			for (Llamada llamadillas : perone) {
				System.out.println("Llamada a :" + llamadillas.numTelefono 
						+ "Duración : " + llamadillas.duracion);
			}
		}
		
			
		
		default:
			System.out.println("Error");
		}
			
			
		case ("C"):
			
			System.out.println("MODO Facturas"
					+ "Para emitir una factura, Pulse A"
					+ "para recuperar los datos de una factura, Pulse B"
					+ "Para recuperar TODAS las facturas, pulse C");
			
		sc = new Scanner(System.in);
		String subcadenaC = sc.nextLine();
		switch(cadena.toUpperCase()) {
		case ("A"):
			
			
			
		case ("B"):	
			System.out.println("Por Favor, dime el Codigo de la Factura");
			Scanner codigo2 = new Scanner(System.in);
			String codigo = sc.nextLine();
			
			
			System.out.println("FACTURA :");
			
			
		case ("C"):
		
			System.out.println("Por Favor, dime el NIF");
			Scanner facturas = new Scanner(System.in);
			String clientela = sc.nextLine();
			
			Cliente persona =  gestClient.searchClient(clientela);
			
			/* Debemos de emitir una factura, pero no sabemos muy bien como
			 * por lo que la idea es imprimr por pantalla el total a pagar
			 * así como el nombr
			 */
			System.out.println("Cliente :" + persona.getNombre());
			double precio = Factura.calculaImporte(persona);
			System.out.println("TOTAL A PAGAR =>" + precio);
			
			
			
		default:
			System.out.println("Error");
		}
			
		default:
			System.out.println("ERROR, NO HAS ELEGIDO NINGUNA OPCIÓN");
		}
	}
	
}
