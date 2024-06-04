package AulaCondicionais;
import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nota = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		float nota1 = nota.nextFloat();
	
		System.out.println("Digite a segunda nota");
		float nota2  = nota.nextFloat();

		System.out.println("Digite a terceira nota");
		float nota3  = nota.nextFloat();
		
		System.out.println("Digite a quarta nota");
		float nota4  = nota.nextFloat();

		float media = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		if(media >= 6){
			System.out.println("Aluno Aprovado");
		}
		else if(media == 5){
			System.out.println("Aluno está de recuperação");
		}
		else {
			System.out.println("Aluno reprovado");
		};
		
		
	}

}
