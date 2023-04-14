package CLASES_COMPLETAS;

import java.util.List;


public class Lists {
	public static void main(String[] args) {

	// ES UNA COLECCION ORDENADA QUE PERMITE ELEMENTOS DUPLICADOS.
	//PERMITE: acceder por indice, busquedas, iterarlo, recoger un rango de objetos. 





	//----------CREAR E INICIALIZAR Lists-------------------------------------------------------
	
	//OBTENER UNA LISTA DE OBJETOS
	List ejemplo1 = List.of("a", "b", "c");

	List ejemplo2 = java.util.Arrays.asList( new String[] {"a", "b", "c"}); 
	// se pone java.util.Arrays para que use la clase adecuada y no la mia de ejemplo.  



	//----------FIN CREAR E INICIALIZAR Lists---------------------------------------------




	//----------METODOS Lists-------------------------------------------------------------
	/*
	Metodos hererados de java.util.Collection:
	add(element)      		--> Añade objeto a la coleccion.
	isEmpty()      	--> devuelve TRUE si esta vacia.
	iterator()      --> devuelve un ITERATOR, para recorrerlo.
	of(element)      		--> crea una lista no modificable de elementos predefinidos. 
	size()     		--> retorna el numero de elementos. 
	stream()   		--> permite manipular la coleccion con Stream API, buscarlo. 
	toArray()		--> transforma la coleccion en un array de objetos. 
	*/

	/*
	Metodos de List:
	get(int)      		--> devuelve el objeto de la posicion pasada.
	set(int, element)   --> inserta un objeto en la posicion indicada. 
	add(element)     	--> añade un objeto al final de la lista.
	add(int, element)   -->  añade un objeto a la posicion indicada. 
	remove(int)   -->elimina el objeto de la posicion indicada. 
	indexof(object)   --> retorna la primera posicion del objeto indicado
	lastIndexOf(object)   --> retorna la ultima posicion del objeto indicado
	listIterator()   --> retorna un ListIterator
	*/

//----------FIN METODOS Lists-------------------------------------------------------------



	}
}
