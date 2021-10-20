package br.senai.sp.jandira.calculo;

public class CalculoImc {
	
	public double peso;
	public double altura;
	public String status;
	public double imc;

	public void multiplicar () 
	{
		imc = altura * altura/peso;
		System.out.println(status);

		obter ();

	}
	public void obter ()
	{
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc == 18.5 && imc <24.9) {
			System.out.println("Peso normal");
		} else if (imc == 25 && imc < 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc == 30 && imc < 34.9) {
			System.out.println("Obesidade grau 1");
		} else if (imc == 35 && imc < 39.9) {
			System.out.println("Obesidade grau 2");
		} else if (imc >= 40) {
			System.out.println("Obesidade grau 3 ou mórbida");
		}
	}

}

