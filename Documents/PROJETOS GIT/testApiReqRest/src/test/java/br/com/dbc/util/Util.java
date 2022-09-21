package br.com.dbc.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Util {
	
	public static String removerPontoTraco(String texto) {
		
		if (texto.contains(".")) {
			texto = texto.replace(".", "");
		}
		if (texto.contains("-")) {
			texto = texto.replace("-", "");
		}
		if (texto.contains("/")) {
			texto = texto.replace("/", "");
		}
		
		return texto;
		
	}
	
	private static String geradorValoresDecimalFormatados(Double valorInicial, Double valorFinal) {
		   Double valor = Util.geradorNumerosAleatoriosPorIntervalo(valorInicial, valorFinal);
	       DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
	       decimalFormat.setRoundingMode(RoundingMode.DOWN);
	       System.out.println( decimalFormat.format(valor) );
	       return decimalFormat.format(valor).replace(",", ".");
	}
	
	public static Integer geradorNumerosAleatoriosPorIntervalo(Integer numInicial, Integer numFinal) {
    	ThreadLocalRandom tlr = ThreadLocalRandom.current();
		return tlr.nextInt(numInicial, numFinal);
	}
	
	public static Double geradorNumerosAleatoriosPorIntervalo(Double numInicial, Double numFinal) {
    	ThreadLocalRandom tlr = ThreadLocalRandom.current();
		return tlr.nextDouble(numInicial, numFinal);
	}
	
	public static String geradorValorAleatorio(Integer tamanho) {
		UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "").substring(0, tamanho);
	}
}
