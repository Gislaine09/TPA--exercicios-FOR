import java.util.Scanner;

public class FaixaEtariaa {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, C1=0, C2=0, C3=0, C4=0, C5=0;
		int idade, porcentagem,soma;
		for(i=1;i<=15;i++) {
		System.out.println("Digite a idade da "+i+" pessoa:");
		idade=in.nextInt();	
		if (idade<=15) {
			soma=(C1=C1+1);
			System.out.println("Aqui a quantidade de pessoas na 1a faixa etaria: " +soma);
		}else {
		if (idade<=30) {
			soma=(C2=C2+1);
			System.out.println("Aqui a quantidade de pessoas na 2a faixa etaria: " +soma);
		}else {
		if (idade<=45) {
			soma=(C3=C3+1);
			System.out.println("Aqui a quantidade de pessoas na 3a faixa etaria: " +soma);
		}else {
		if (idade<=60) {
			soma=(C4=C4+1);
			System.out.println("Aqui a quantidade de pessoas na 4a faixa etaria: " +soma);
		}else {
		if (idade>=61) {
			soma=(C5=C5+1);
			System.out.println("Aqui a quantidade de pessoas na 5a faixa etaria: " +soma);
		}
		}
		}
		}
		}
		}
		System.out.println("  ");
		porcentagem=(100*C1/15);
		System.out.println("Aqui a porcentagem do tanto de pessoas na 1a faixa etária:"+porcentagem);
		porcentagem=(100*C2/15);
		System.out.println("Aqui a porcentagem do tanto de pessoas na 2a faixa etária:"+porcentagem);
	    porcentagem=(100*C3/15);
		System.out.println("Aqui a porcentagem do tanto de pessoas na 3a faixa etária:"+porcentagem);
		porcentagem=(100*C4/15);
		System.out.println("Aqui a porcentagem do tanto de pessoas na 4a faixa etária:"+porcentagem);
		porcentagem=(100*C5/15);
		System.out.println("Aqui a porcentagem do tanto de pessoas na 5a faixa etária:"+porcentagem);
		}
        
}			
		
		

	
		




