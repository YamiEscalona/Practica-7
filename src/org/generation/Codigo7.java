package org.generation;

public class Codigo7 {
	
	public static void main(String[] args) {
		
		// Se modifico el nombre y se le agrego System.in
		Scanner scanner = new Scanner(System.in);
		
		//Se cambia Byte, Double a String, String y se modifico el nombre 
	    HashMap<String, String> capitales = new HashMap<>();
	    capitales.put("Canadá", "Ottawa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "Ciudad de México");// Se cambio México DF a Ciudad de México
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa Rica", "San José");
	    capitales.put("El Salvador", "San Salvador"); // Se agrego San Salvador
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Ciudad de Panamá"); // Se cambio Panamá a Ciudad de Panamá
	    
	   // Se cambio Sting a String y c por pais
	    String pais = "";
	   
	    do {
	    	// Se cambio el in por out y el nombre de scanner
	    	System.out.print("Escribe el nombre de un país y te diré su capital: ");
	    	pais = scanner.nextLine();
	      
	      if (!c.equal("salir")) {
	        if (ca.containsValue(c)) {
	          System.print("La capital de " + c);
	          System.out.println(" es " + ca.put(c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          ca.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } wile (!c.equals("salir");
	  }

	}
	   