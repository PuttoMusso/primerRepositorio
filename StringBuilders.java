package ApisDeJava;

public class StringBuilders {
	/*
	charAt()
	indexOf()
	length()
	substring()
	append()
	insert()
	delete()
	deleteCharAt()
	reverse()
	toString()
	*/
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("animales");
		char chTest;
		int intTest;
		String stringTest;
		
		//	charAt()
		chTest = sb.charAt(4);
		System.out.println("CHARAT - charAt(4) de " + sb + " es: " + chTest);
		
		//	indexOf()  				devuelve el dato de la primera coincidencia.
		intTest = sb.indexOf("e");
		System.out.println("INDEXOF - indexOf('e') de " + sb + " es " + intTest);
		
		//	length()
		intTest = sb.length();
		System.out.println("LENGTH - length() de " + sb + " es: " + intTest);
		
		//	substring()
		stringTest = sb.substring(3);
		System.out.println("SUBSTRING - substring(3) de " + sb + " es: " + stringTest);
		
		//	append()
		stringTest = "holaMundo";
		System.out.println("APPEND - " + sb + ".append('holaMundo') da: " + sb.append(stringTest));
		
		//	insert()
		sb = new StringBuilder("animales");;
		System.out.println("INSERT - " + sb + ".insert(2,'-') da: " + sb.insert(2,'-'));
		
		//	delete()
		sb = new StringBuilder("animales");
		System.out.println("DELETE - " + sb + ".delete(2,4) da: " + sb.delete(2,4));
		
		//	deleteCharAt()
		sb = new StringBuilder("animales");
		System.out.println("DELETECHARTAT - " + sb + ".deleteCharAt(2) da: " + sb.deleteCharAt(2));


		//	reverse()
		sb = new StringBuilder("animales");
		System.out.println("REVERSE - " + sb + ".reverse() da: " + sb.reverse());
		
		
		// toString()
		sb = new StringBuilder("animales");
		stringTest = sb.toString();
		System.out.println("TOSTRING - " + sb + ".toString() da: " + stringTest);
		
	}
}
