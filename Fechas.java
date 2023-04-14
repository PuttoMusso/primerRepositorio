package ApisDeJava;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Fechas {
	
	public static void main(String[] args) {
	
		//LOCALDATE		FECHAS
		LocalDate.now();	//2021-01-08
		
		LocalDate fecha1 = LocalDate.of(2021, Month.JANUARY, 8);
		LocalDate fecha2 = LocalDate.of(2021, 1, 8);
		
		
		//LOCALTIME		HORAS
		LocalTime.now();	//13:58:01.153204200
		
		LocalTime hora1 = LocalTime.of(14, 15, 30, 200);	//HORA: 14:15:30.000000200
		LocalTime hora2 = LocalTime.of(14, 15, 30);			//HORA: 14:15:30
		LocalTime hora3 = LocalTime.of(14, 15);				//HORA: 14:15

		
		//LOCALDATETIME		FECHA + HORA
		LocalDateTime.now();	//2021-01-08T13:58:01.153204200

		LocalDateTime fechaHora1 = LocalDateTime.of(2021, Month.JANUARY, 8, 14, 15, 30, 200);
		LocalDateTime fechaHora2 = LocalDateTime.of(2021, Month.JANUARY, 8, 14, 15, 30);
		LocalDateTime fechaHora3 = LocalDateTime.of(2021, Month.JANUARY, 8, 14, 15);
		
		LocalDateTime fechaHoraCombinada = LocalDateTime.of(fecha1,hora1 );
		
		
		//CALCULOS DE FECHAS		FECHAS SON INMUTABLES: RECORDAR ESTO: SIEMPRE CRAR OBJETO NUEVO.
		// TODO LO SIGUIENTE VALE PARA LocalDateTime
		//--------------------MODIFICAR FECHAS-----------------------
		LocalDate fecha3 = LocalDate.of(2021, 1, 1);	//2021-01-01
		LocalDate fecha4 = fecha3.plusDays(2);		//2021-01-01
		LocalDate fecha5 = fecha3.plusWeeks(2);		//2021-01-15
		LocalDate fecha6 = fecha3.plusMonths(2);	//2021-03-01
		LocalDate fecha7 = fecha3.plusYears(2);		//2023-01-01
		LocalDate fecha8 = fecha3.minusDays(2);		//2020-12-30
		LocalDate fecha9 = fecha3.minusWeeks(2);	//2020-12-18
		LocalDate fecha10 = fecha3.minusMonths(2);	//2020-11-01
		LocalDate fecha11 = fecha3.minusYears(2);	//2019-01-01
		//--------------------MODIFICAR HORAS-----------------------
		LocalTime hora4 = LocalTime.of(14, 15, 30, 200);	//HORA: 14:15:30.000000200
		LocalTime hora5 = hora4.plusHours(2);		//HORA: 16:15:30.000000200
		LocalTime hora6 = hora4.plusMinutes(2);		//HORA: 14:17:30.000000200
		LocalTime hora7 = hora4.plusSeconds(2);		//HORA: 14:15:32.000000200
		LocalTime hora8 = hora4.plusNanos(2);		//HORA: 14:15:30.000000202
		LocalTime hora9 = hora4.minusHours(2);		//HORA: 12:15:30.000000200
		LocalTime hora10 = hora4.minusMinutes(2);	//HORA: 14:13:30.000000200
		LocalTime hora11 = hora4.minusSeconds(2);	//HORA: 14:15:28.000000200
		LocalTime hora12 = hora4.minusNanos(2);		//HORA: 14:15:30.000000198
		
		
		//PERIODOS
		
		LocalDate fechaInicio 	= LocalDate.of(2021, 1, 1);
		LocalDate fechaFIN 		= LocalDate.of(2023, 1, 1);
		
		boolean ComprobarSiEsAntes = fechaInicio.isBefore(fechaFIN);
		boolean ComprobarSiEsDespues = fechaInicio.isAfter(fechaFIN);
		boolean ComprobarSiEsIgual = fechaInicio.isEqual(fechaFIN);
		//HAY MUCHOS MAS METODOS, SOLO PONER fechaInicio. Y ECLIPSE LOS MUESTRA.

		//PASAR A LONG EL NUMERO DE DIAS DESDE 1 enero 1970 hasta la fecha. 
		LocalDate fechaLong = LocalDate.of(2021, 1, 8);
		LocalDateTime fechaHoraLong = LocalDateTime.of(2021, 1, 8, 14, 15);
		Long longFecha = fechaLong.toEpochDay();
		//Long longFechaHora = fechaHoraLong.toEpochSecond(null);  REVISAR ESTO
		
		
		//PERIODOS DE TIEMPO
		//Se pueden crear periodos para luego sumar o restar a fechas. 
		Period anual = Period.ofYears(1);
		Period trimestral = Period.ofMonths(3);
		Period tresSemanas = Period.ofWeeks(3);
		Period dosDias = Period.ofDays(2);
		Period unAñoYunaSemana = Period.of(1, 0, 7);
		
		LocalDateTime fechaHora4 = fechaHora1.plus(unAñoYunaSemana);	//2022-01-15T14:15:30.000000200
		LocalDateTime fechaHora5 = fechaHora1.minus(tresSemanas);		//2020-12-18T14:15:30.000000200

		//FORMATEO DE FECHAS Y HORAS
		
		System.out.println(fecha1.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(hora1.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(fechaHora1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		//formateo del examen:
		DateTimeFormatter corto = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);		//14:15
		DateTimeFormatter medio = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);	//14:15:30
		DateTimeFormatter personalizado = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");	//enero 08, 2021, 02:15
		DateTimeFormatter personalizado2 = DateTimeFormatter.ofPattern("hh:mm, dd-MMMM-yyyy"); 	//02:15, 08-enero-2021
		
		System.out.println("formateo de hora CORTO: " + corto.format(fechaHora1));
		System.out.println("formateo de hora MEDIO: " + medio.format(fechaHora1));
		System.out.println("formateo de hora PERSONALIZADO: " + personalizado.format(fechaHora1));
		System.out.println("formateo de hora PERSONALIZADO2: " + personalizado2.format(fechaHora1));
		
		
		//PASAR STRING A FECHAS.
		DateTimeFormatter patronBasico = DateTimeFormatter.ofPattern("MM dd yyyy");	
		LocalDate fechaBasica = LocalDate.parse("01 02 2015", patronBasico);			//2015-01-02	
		LocalTime horaBasica = LocalTime.parse("11:22"); //usa el patron por defecto.	//11:22
		System.out.println(fechaBasica);
		System.out.println(horaBasica);
	}
}
