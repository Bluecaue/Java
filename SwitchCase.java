package AulaCondicionais;
import java.util.Scanner;


public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 7: ");
		int numero_dia = nota.nextInt();
		
		String nome_dia;
		
		switch(numero_dia) {
		case 1: nome_dia = "Domingo";break;
		case 2: nome_dia = "Segunda-feira";break;
		case 3: nome_dia = "Terça-feira";break;
		case 4: nome_dia = "Quarta-feira";break;
		case 5: nome_dia = "Quinta-feira";break;
		case 6: nome_dia = "Sexta-feira";break;
		case 7: nome_dia = "Sabado";break;
		default: nome_dia = "Numero_inválido";
		}
		System.out.println(nome_dia);
	}

}
