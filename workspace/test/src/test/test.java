package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		System.out.println("\n****BIENVENIDO AL CLIENTE DE TRACTORES BERRIO****");
	int opt = 0;
	while (opt != 3) {
		
		System.out.println("Seleccione su tipo de usuario:");
		System.out.println("\t1. Debugger");
		System.out.println("\t2. Usuario");
		System.out.println("\t3. Salir del Cliente");
	
		
		opt = Integer.parseInt(sc.nextLine());
		
		switch(opt){
		case 1:	RamaDebugger();
				break;
		case 2: //RamaUser();
				break;
		case 3: sc.close();
				break;
		default: System.out.println("Introduzca una opcion valida");
				break;
		}

	}
	}
	
	public static void RamaDebugger() throws Exception {
		System.out.println("-Ha seleccionado Debugger");
		boolean result = false;
		int opt = 0;
		
		while (true) {
			
			System.out.println(">Seleccione una funcion para probar");
			System.out.println("\t1.  Notificacion a traves de Twitter");
			System.out.println("\t2.  Cambio de divisas");
			System.out.println("\t3.  Ver usuarios");
			System.out.println("\t4.  Ver stock");
			System.out.println("\t5.  A�adir usuario");
			System.out.println("\t6.  A�adir elemento");
			System.out.println("\t7.  Borrar usuario");
			System.out.println("\t8.  Borrar elemento");
			System.out.println("\t9.  Reestablecer BD usuarios");
			System.out.println("\t10. Reestablecer BD stock");
			System.out.println("\t11. Volver al menu principal");

			opt = Integer.parseInt(sc.nextLine());
			
			switch (opt) {
			case 1:
				System.out
						.println("-Ha seleccionado notificacion a traves de Twitter");
				break;

			case 2:
				System.out.println("-Ha seleccionado cambio de divisas");
				break;

			case 3:
				System.out.println("-Ha seleccionado ver usuarios");
				break;

			case 4:
				System.out.println("-Ha seleccionado ver stock");
				break;

			case 5:
				System.out.println("-Ha seleccionado a�adir usuario");
				break;

			case 6:
				System.out.println("-Ha seleccionado a�adir elemento");
				break;

			case 7:
				System.out.println("-Ha seleccionado borrar usuario");
				break;

			case 8:
				System.out.println("-Ha seleccionado borrar elemento");
				break;

			case 9:
				System.out
						.println("-Ha seleccionado reestablecer BD de usuarios");
				break;

			case 10:
				System.out.println("-Ha seleccionado reestablecer BD de stock");
				break;

			case 11:
				return;

			default:
				System.out.println("-Opcion incorrecta");
				break;
			}

		}
	}
}
