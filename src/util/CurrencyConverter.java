package util;

import javax.naming.spi.DirStateFactory.Result;

public class CurrencyConverter {

	double cotacao = 3.10;
	double result;
	double valorConvertido;
	double  porcentagem = 6.0/100;

	public  double converter( double valor) {

		valorConvertido = valor * cotacao;
		return   valorConvertido + (porcentagem * valorConvertido);

	}



}
