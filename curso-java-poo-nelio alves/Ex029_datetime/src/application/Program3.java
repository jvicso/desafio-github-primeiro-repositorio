/*Convertendo data-hora global para local*/
package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		//Converte o Instant para uma data local considerando o fuso horário padrão do sistema
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		//Converte o Instant para uma data local considerando o fuso horário do local que for escolhido
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		//Converte o Instant para uma data-hora local considerando o fuso horário padrão do sistema
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		//Converte o Instant para uma data-hora local considerando o fuso horário do local que for escolhido
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		//Obter o apenas o dia de uma data local
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		//Obter o apenas o mês de uma data local
		System.out.println("d04 mês = " + d04.getMonthValue());
		//Obter o apenas o ano de uma data local
		System.out.println("d04 ano = " + d04.getYear());
		
		//Obter o apenas a hora de uma data-hora local
		System.out.println("d05 hora = " + d05.getHour());
		//Obter o apenas o minuto de uma data-hora local
		System.out.println("d05 minuto = " + d05.getMinute());
		
		
		
		
		
		
		
	}

}
