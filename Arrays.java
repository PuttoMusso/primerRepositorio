package CLASES_COMPLETAS;

//import java.util.Arrays;

public class Arrays {
	
	
	public static void main(String[] args) {

		//Array es un objeto, y es una lista de referencias a objeto, no una lista de objetos. 
		

		//----------CREAR E INICIALIZAR ARRAYS-------------------------------------------------------
		String[] argsString = new String[3];	//array de String
		int[] argsInt = new int[3];				//array de int
	
		int argsCorchetes[] = new int[4];				//corchetes pueden ir antes y despues del nombre. 
		
		int[] argsInicializado = new int[] {42,55,69};		//inicializar un array
		
		argsInicializado[1] = 22;
		
		int[] args1, args2;		//dos arrays tipo int
		int args3[], args4;		//un array tipo int + un int.
		
		int[][] args1_2d;		//array 2D
		int args2_2d[][] ;		//array 2D
		int[] args3_2d[];		//array 2D
		
		int[] args_2d[],args_3d[][];		//array 2D + array3D
		
		int[][] argsInicializado_2D = { {1,2}, {3,4,5}, {6,7} };
		/* descripcion grafica argsInicializado_2D
		index->	0	1	2
		0->		1	2
		1->		3	4	5
		2->		6	7
		*/

		//----------FIN CREAR E INICIALIZAR ARRAYS---------------------------------------------


		//----------METODOS ARRAYS-------------------------------------------------------------
		
		//	SORT  --> ordena el array
		
		//	SEARCH  -->  busca en el array,devuelve su situacion en el array, da negativo si no esta..
		//SOLO FUNCIONA SI SE HA HECHO SORT ANTES (IMPORTANTISIMO)


		//-------------------------------
		//	SORT 			// se pone java util. porque mi clase se llama Arrays(igual que Arrays.sort) y se confunde el programa con cual usar. 
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
		java.util.Arrays.sort(arr);
		
		//	SEARCH		SOLO FUNCIONA SI SE HA HECHO SORT ANTES (IMPORTANTISIMO)
		java.util.Arrays.binarySearch(arr, 21);	//devuelve su situacion en el array, da negativo si no esta. 
		//Arrays.binarySearch(arr, 21);
	

		//----------FIN METODOS ARRAYS------------------------------------------------------------------


	}
}
