/*Instanciando data-hora em Java*/
package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

	public static void main(String[] args) {

		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Data local do momento atual
		LocalDate d01 = LocalDate.now();
		//Data e hora local do momento atual
		LocalDateTime d02 = LocalDateTime.now();
		//Data e hora global do momento atual usando GMT
		Instant d03 = Instant.now();
		
		//Informando uma data local no padrao ISO 8601
		LocalDate d04 = LocalDate.parse("2022-07-20");
		//Informando uma data e hora local no padrao ISO 8601
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		//Informando uma data e hora global no padrao ISO 8601 com GMT padrao
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		//Informando uma data e hora global no padrao ISO 8601 com GMT-3
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		//Informando uma data/hora utilizando outro padrão, formatando com o DateTimeFormatter
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		//Informando um dia/mês/ano isoladamente
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		//Informando um dia/mês/ano/hora/minuto isoladamente
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
	}

}
