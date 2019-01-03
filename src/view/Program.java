package view;

import java.util.Locale;
import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

import org.omg.PortableServer.ServantLocator;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		CurrencyConverter current = new CurrencyConverter();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quanto vai converter?");
		double  valor = sc.nextDouble();
		double result = current.converter(valor);


		System.out.printf("O valor convertido é %.2f", result);

		sc.close();
	}

}
