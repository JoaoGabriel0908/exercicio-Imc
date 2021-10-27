package br.senai.sp.jandira.calculo;

public class CalculoImc {
	
	private double peso;
	private double altura;
	
	//PEGAR E ATRIBUIR PESO
	//PARSEDOUBLE É PARA CONVERTER DOUBLE EM STRING
	public void setPeso (String peso) {
		this.peso = Double.parseDouble(peso);
	}
	public double getPeso () {
		return peso;
	}
	//PEGAR E ATRIBUIR ALTURA
	public void setAltura (String altura) {
		this.altura = Double.parseDouble(altura);
	}
	public double getAltura () {
		return altura;
	}
	//RETORNAR VALOR
	public double calcularImc () 
	{
		return peso / (altura*altura);
	}
	//RETORNADO O VALOR EM STRING
	public String obterImcString() {
		return String.valueOf(calcularImc());

	}
	
	public String obterStatus () {
		if (calcularImc() < 18.5) {
			return "Abaixo do peso";
		} else if (calcularImc() >= 18.5 && calcularImc() <25) {
			return"Peso normal";
		} else if (calcularImc() >= 25 && calcularImc() < 30) {
			return"Sobrepeso";
		} else if (calcularImc() >= 30 && calcularImc() < 35) {
			return"Obesidade grau 1";
		} else if (calcularImc() >= 35 && calcularImc() < 40) {
			return"Obesidade grau 2";
		} else {
			return"Obesidade grau 3";
		
		}
	}
}
