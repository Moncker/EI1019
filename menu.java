package Compania;

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
			//creamos un nuevo cliente
			Cliente usuario = new Cliente();
			gestClient.addClient(usuario);
			
			
		case ("B"):
			System.out.println("por favor, introduzca el NIF del cliente");
		Scanner cl = new Scanner(System.in);
		String nif = cl.nextLine();
		
		Cliente persona = gestClient.searchClient(nif);
			gestClient.deleteClient( persona);
			
		case ("C"):
			
			System.out.println("por favor, introduzca el NIF del cliente");
		Scanner cl = new Scanner(System.in);
		String nif = cl.nextLine();
		Cliente persona = gestClient.searchClient(nif);
		
		gestClient.changeTarifa(persona, Tarifa);
			
		case ("D"):
			System.out.println("por favor, introduzca el NIF del cliente");
			Scanner cl = new Scanner(System.in);
			String nif = cl.nextLine();
			
			Cliente persona = gestClient.searchClient(nif);

			
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
			
			
			
			
		case ("B"):			
		
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
			
		case ("C"):
		
		default:
			System.out.println("Error");
		}
			
		default:
			System.out.println("ERROR, NO HAS ELEGIDO NINGUNA OPCIÓN");
		}
	}
	
}
