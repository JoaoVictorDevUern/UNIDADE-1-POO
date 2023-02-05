package Questão1B;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;


public class questaoB {

	public static void main(String[] args) throws ParseException {
		
		String mes;
		SimpleDateFormat primeiroformato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Digite uma data desejada: ");
		
		try (Scanner data = new Scanner(System.in)) {
			mes = data.next();
		}
		
		Date mesdoano = primeiroformato.parse(mes);
		
		SimpleDateFormat Segundoformato = new SimpleDateFormat("\n MMMM dd/yyyy");
		String NovaData = Segundoformato.format(mesdoano);
		System.out.println(NovaData);

	}
}


