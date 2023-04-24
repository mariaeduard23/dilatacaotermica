package util;

import java.lang.Math;

import java.math.BigDecimal;

public class Calculate {

	static final int CONVERSAO = 100;
	static final double EXPOENTE = Math.pow(10, -6);
	static final int MULTIPLICADOR_VIDRO = 3;
	static final int MULTIPLICADOR_ACO = 11;
	static final int MULTIPLICADOR_CONCRETO = 12;
	static final int MULTIPLICADOR_COBRE = 17;
	static final int MULTIPLICADOR_ALUMIN = 22;
	static final int MULTIPLICADOR_ZINCO = 26;
	static final double MULTIPLICADOR_FERRO = 1.2;
	
	public static BigDecimal calcularDilatacaoVidro(Integer tempMin, Integer tempMax, Integer size) {
		int variacaoTemp = (tempMax - tempMin);
		BigDecimal resultTamanhoVariacao = BigDecimal.valueOf(variacaoTemp * size);
		return resultTamanhoVariacao
			.multiply(BigDecimal.valueOf(MULTIPLICADOR_VIDRO))
			.multiply(BigDecimal.valueOf(EXPOENTE))
			.multiply(BigDecimal.valueOf(CONVERSAO));		
}

	public static BigDecimal calcularDilatacaoAco(Integer tempMin, Integer tempMax, Integer size) {
	int variacaoTemp = (tempMax - tempMin);
	BigDecimal resultTamanhoVariacao = BigDecimal.valueOf(variacaoTemp * size);
	return resultTamanhoVariacao
			.multiply(BigDecimal.valueOf(MULTIPLICADOR_ACO))
			.multiply(BigDecimal.valueOf(EXPOENTE))
			.multiply(BigDecimal.valueOf(CONVERSAO));		
}
	
	public static BigDecimal calcularDilatacaoConcreto(Integer tempMin, Integer tempMax, Integer size) {
		int variacaoTemp = (tempMax - tempMin);
		BigDecimal resultTamanhoVariacao = BigDecimal.valueOf(variacaoTemp * size);
		return resultTamanhoVariacao
				.multiply(BigDecimal.valueOf(MULTIPLICADOR_CONCRETO))
				.multiply(BigDecimal.valueOf(EXPOENTE))
				.multiply(BigDecimal.valueOf(CONVERSAO));		
	}
	
	public static BigDecimal calcularDilatacaoCobre(Integer tempMin, Integer tempMax, Integer size) {
		int variacaoTemp = (tempMax - tempMin);
		BigDecimal resultTamanhoVariacao = BigDecimal.valueOf(variacaoTemp * size);
		return resultTamanhoVariacao
				.multiply(BigDecimal.valueOf(MULTIPLICADOR_COBRE))
				.multiply(BigDecimal.valueOf(EXPOENTE))
				.multiply(BigDecimal.valueOf(CONVERSAO));
	
}
	
	public static BigDecimal calcularDilatacaoAluminio(Integer tempMin, Integer tempMax, Integer size) {
		int variacaoTemp = (tempMax - tempMin);
		BigDecimal resultTamanhoVariacao = BigDecimal.valueOf(variacaoTemp * size);
		return resultTamanhoVariacao
				.multiply(BigDecimal.valueOf(MULTIPLICADOR_ALUMIN))
				.multiply(BigDecimal.valueOf(EXPOENTE))
				.multiply(BigDecimal.valueOf(CONVERSAO));
	}
	
	public static BigDecimal calcularDilatacaoZinco(Integer tempMin, Integer tempMax, Integer size) {
		int variacaoTemp = (tempMax - tempMin);
		BigDecimal resultTamanhoVariacao = BigDecimal.valueOf(variacaoTemp * size);
		return resultTamanhoVariacao
				.multiply(BigDecimal.valueOf(MULTIPLICADOR_ZINCO))
				.multiply(BigDecimal.valueOf(EXPOENTE))
				.multiply(BigDecimal.valueOf(CONVERSAO));		
	}
	
	public static BigDecimal calcularDilatacaoFerro(Integer tempMin, Integer tempMax, Integer size) {
		int variacaoTemp = (tempMax - tempMin);
		BigDecimal resultTamanhoVariacao = BigDecimal.valueOf(variacaoTemp * size);
		return resultTamanhoVariacao
				.multiply(BigDecimal.valueOf(MULTIPLICADOR_FERRO))
				.multiply(BigDecimal.valueOf(EXPOENTE))
				.multiply(BigDecimal.valueOf(CONVERSAO));		
	}
}
