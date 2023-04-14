package CLASES_COMPLETAS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLists {

	
	public static void main(String[] args) {
		

		
		//----------CREAR E INICIALIZAR ArrayLists-------------------------------------------------------
		
		ArrayList listaObjetos = new ArrayList();
		listaObjetos.add("a");
		listaObjetos.add("b");

		ArrayList<String> listaStrings = new ArrayList<>();
		listaStrings.add("a");
		listaStrings.add("b");
		//----------FIN CREAR E INICIALIZAR ArrayLists---------------------------------------------



		//----------RECORRER ArrayLists-------------------------------------------------------------
		/*
		para leer el contenido del ArrayLists, se puede hacer un bucle FOR, 
		o con los metodos iterator(), y listIterator()
		*/

		//EJEMPLO MAS ACTUAL. con interfaz funcional, (lambdas) usando la funcion Consumer. 
		listaStrings.forEach( e -> System.out.println("contenido: " + e ));


		//EJEMPLO  FOR ACTUAL.
		for( String contenido : listaStrings ) {
			System.out.println("contenido:" + contenido);
		}

		//EJEMPLO  CON stream API.
		listaStrings.forEach(x -> System.out.println("contenido:" + x));

		//EJEMPLO CON FOR. para ArrayList
		for (int i = 0; i< listaObjetos.size(); i++){
			String contenido = (String) listaObjetos.get(i);
			System.out.println("contenido:" + contenido);
		}
		//EJEMPLO CON FOR. para ArrayList<String>
		for (int i = 0; i< listaStrings.size(); i++){
			String contenido =  listaStrings.get(i); //lista de Strings. ya esta marcada como String, no necesita cast.
			System.out.println("contenido:" + contenido);
		}
		//EJEMPLO CON ITERATOR.
		Iterator<String> itr = listaStrings.iterator();
		while (itr.hasNext()) {
			String contenido = itr.next();
			System.out.println("contenido:" + contenido);
		}

		//EJEMPLO CON ListIterator.
		ListIterator<String> litr = listaStrings.listIterator();
		while (litr.hasNext()) {
			String contenido = litr.next();
			System.out.println("contenido:" + contenido);
		}
		//----------FIN RECORRER ArrayLists-------------------------------------------------------------




		//----------METODOS ArrayLists-------------------------------------------------------------

		/*
		add()
		remove()
		set()
		isEmpty()
		size()
		clear()
		contains()
		equals()
		*/


		boolean test;
		int intTest;
		
		//	add()
		listaObjetos.add("Pelicula");
		listaObjetos.add(Boolean.TRUE);
		System.out.println("ADD - Lista de objetos (ArrayList): " + listaObjetos );

		
		listaStrings.add("Pelicula");
		listaStrings.add("Corto");
		System.out.println("ADD - Lista de Strings (ArrayList<String>): " + listaStrings );
		
		//	remove()
		listaStrings.remove("Corto");
		System.out.println("REMOVE - elimininamos Corto de la lista de Strings: " + listaStrings );
		
		//	set()
		listaStrings.set(0, "amarillo");
		System.out.println("SET - seteamos amarillo en el espacio 0 la lista de Strings: " + listaStrings ); //se setea en un espacio ya existente
		
		//	isEmpty()
		test = listaStrings.isEmpty();
		System.out.println("ISEMPTY - comprobamos lista de Strings: " + test );
		
		//	size()
		intTest = listaStrings.size();
		System.out.println("SIZE - tamaño de la lista de Strings: " + intTest );
		
		//	clear()
		listaStrings.clear();
		System.out.println("CLEAR - vaciamos lista de Strings: " + listaStrings );
	
		//	contains()
		listaStrings.add("rojo");
		listaStrings.add("azul");
		listaStrings.add("verde");
		listaStrings.add("blanco");
		test = listaStrings.contains("verde");
		System.out.println("CONTAINS - comprobamos si lista de Strings tiene verde: " + test );
		
		//	equals()
		ArrayList<String> listaStrings2 = listaStrings;
		test = listaStrings.equals(listaStrings2);
		System.out.println("EQUALS - comprobamos dos ArrayLists iguales: " + test );
		
		listaStrings = new ArrayList<>();
		test = listaStrings.equals(listaStrings2);
		System.out.println("EQUALS - comprobamos dos ArrayLists diferentes: " + test );
		
		//SORT 
		Collections.sort(listaStrings2);
		
		//clone()
		ArrayList<String> original = new ArrayList<>();
        original.add(new String("hola"));
        ArrayList<String> clonado = (ArrayList<String>) original.clone();
        String test1 = clonado.get(0);	
        //aqui obtiene el hola. porque apuntan al mismo objeto los dos arraylist.
        //si modificas uno se modifican los dos objetos

		//----------FIN METODOS ArrayLists------------------------------------------------------------------
	}
}
