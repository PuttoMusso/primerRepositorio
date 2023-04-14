package ApisDeJava;

public class Strings {
	/*
	charAt()
	concat()
	equals()
	equalsIgnoreCase()
	indexOf()
	length()
	replace()
	substring()
	toUpperCase()
	toLowerCase()
	contains()
	startsWith()
	endsWith()
	trim()
	*/
	
	public static void main(String[] args) {
		String a="Objetivos",aa="objetIvos", b="del", c="examen", d="cubiertos", g="capitulo", h="--\tcon esp acios--";
		int intTest; char charTest; String stringTest; boolean booleanTest;
		
		//	charAt()
		charTest = a.charAt(3);
		System.out.println("CHARAT - charAt(3) de " + a + " es: " + charTest);
		
		//	concat()
		stringTest = a.concat(b);
		System.out.println("CONCAT - " + a + ".concat(" + b + ") es " + stringTest);
				
		//	equals()
		booleanTest = a.equals(aa);
		System.out.println("EQUALS - " +  a + ".equals(" + aa + ") es: " + booleanTest);
		stringTest = a;
		booleanTest = a.equals(stringTest);
		System.out.println("EQUALS - " +  a + ".equals(" + stringTest + ") es: " + booleanTest);
		
		//	equalsIgnoreCase()
		booleanTest = a.equalsIgnoreCase(aa);
		System.out.println("EQUALSIGNORECASE - " +  a + ".equalsIgnoreCase(" + aa + ") es: " + booleanTest);
		
		//	indexOf()  devuelve el dato de la primera coincidencia.
		intTest = d.indexOf("e");
		System.out.println("INDEXOF - indexOf('e') de " + d + " es " + intTest);
		intTest = d.indexOf("e",2);
		System.out.println("INDEXOF - indexOf('e',2) de " + d + " es " + intTest + "   MAL; REVISAR!!!");
		
		//	length()
		intTest = g.length();
		System.out.println("LENGTH - length() de " + g + " es: " + intTest);
		
		//	replace()
		stringTest = c.replace("e","A");
		System.out.println("REPLACE - replace('e','A') de " + c + " es: " + stringTest);
		
		//	substring()
		stringTest = c.substring(3);
		System.out.println("SUBSTRING - substring(3) de " + c + " es: " + stringTest);
		stringTest = c.substring(1,4);
		System.out.println("SUBSTRING - substring(1,4) de " + c + " es: " + stringTest);
		
		//toUpperCase()
		stringTest = a.toUpperCase();
		System.out.println("TOUPPERCASE - toUpperCase() de " + a + " es: " + stringTest);
		
		//	toLowerCase()
		stringTest = a.toLowerCase();
		System.out.println("TOLOWERCASE - toLowerCase() de " + a + " es: " + stringTest);
		
		//	contains()
		booleanTest = g.contains("t");
		System.out.println("CONTAINS - " +  g + ".contains('t') es: " + booleanTest);
		
		//	startsWith()
		booleanTest = g.startsWith("c");
		System.out.println("STARSWITH - " +  g + ".starsWith('c') es: " + booleanTest);
			
		//	endsWith()
		booleanTest = g.endsWith("o");
		System.out.println("ENDSWITH - " +  g + ".endsWith('o') es: " + booleanTest);

		//	trim()
		System.out.println("TRIM - a " + h + " le pasamos trim() y da:" + h.trim() + "   MAL; REVISAR!!!");
	}
}
