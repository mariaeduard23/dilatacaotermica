package application;

import java.util.Scanner;

import util.Calculate;

public class Program {
	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tipo de material:");
		String tipoMaterial = sc.next();
		
		System.out.println("Informe o comprimento inicial:");
		Integer size = sc.nextInt();
		
		System.out.println("Informe a temperatura minima:");
		Integer tempMin = sc.nextInt();
		
		System.out.println("Informe a temperatura maxima:");
		Integer tempMax = sc.nextInt();
		
		if("vidro".equals(tipoMaterial)) {
			System.out.println(Calculate.calcularDilatacaoVidro(tempMin, tempMax, size));
		}
		
		if("aço".equals(tipoMaterial)) {
			System.out.println(Calculate.calcularDilatacaoAco(tempMin, tempMax, size));
		}else if("concreto".equals(tipoMaterial)) {
			System.out.println(Calculate.calcularDilatacaoAco(tempMin, tempMax, size));
		}else if("cobre".equals(tipoMaterial)) {
			System.out.println(Calculate.calcularDilatacaoAco(tempMin, tempMax, size));
		}else if("aluminio".equals(tipoMaterial)) {
			System.out.println(Calculate.calcularDilatacaoAco(tempMin, tempMax, size));
		}else if("zinco".equals(tipoMaterial)) {
			System.out.println(Calculate.calcularDilatacaoAco(tempMin, tempMax, size));
		}else if("ferro".equals(tipoMaterial)) {
			System.out.println(Calculate.calcularDilatacaoAco(tempMin, tempMax, size));
		}else {
			System.out.println("Nenhuma instrucao definida.");
			
		}
		sc.close();
	}
		
}
