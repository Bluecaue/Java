package AulaCondicionais;
import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nota = new Scanner(System.in);

		System.out.println("Digite sua altura");
		float altura = nota.nextFloat();
	
		System.out.println("Digite seu peso");
		float peso  = nota.nextFloat();
		
		float imc = (peso / (altura * altura));
	
		
		if(imc <= 18.5){
			System.out.println("Abaixo do Peso");
		}
		else if(imc >= 18.5 && imc <= 24.99){
			System.out.println("Peso Normal");
		}
		else if(imc >= 25 && imc <= 29.99){
			System.out.println("Sobrepeso");
		}
		else if(imc >= 30 && imc <=34.99){
			System.out.println("Obesidade 1");
		}
		else if(imc >= 35 && imc <= 39.99){
			System.out.println("Obesidade 2");
		}else if(imc >= 40){
			System.out.println("Obesidade 3");
		}
	}
		
		
		

}
