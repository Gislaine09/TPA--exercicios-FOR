package idAltPeso;
import java.util.Scanner;

public class idAltPeso {
		public static void main(String args[]) {
			Scanner in = new Scanner(System.in);
			int i=1, C50=0,idade,C10=0, C40=0;
			double altura, peso=0, media, h=0, porcentagem, maior,menor,pesoMaior, pesoMenor;
			System.out.println("Digite a idade da 1 pessoa:");
			idade=in.nextInt();
			System.out.println("Digite a  altura da 1 pessoa:");
			altura=in.nextDouble();
			System.out.println("Digite o peso da 1 pessoa");
			peso=in.nextDouble();
			maior=idade;
			menor=idade;
			pesoMaior=peso;
			pesoMenor=peso;
			if(idade>50) {
				C50=C50+1;
				System.out.println("Aqui a quantidade de pessoas com idade superior a 50 anos:"+C50);
			}
			   if(idade>10  && idade<20)  {
			   C10=C10+1;
			   System.out.println("Aqui a quantidade de idade das pessoas entre 10 e 20 anos:"+C10);
			   h=h+altura;
			   media=h/C10;
			   System.out.println("Aqui a media das alturas das pessoas que tem entre 10 e 20 anos:"+media);
			 }
			    if(peso<40) {
					C40=C40+1;
					System.out.println("Aqui a quantidade de pessoas com peso inferior a 40 kg:"+C40);
					porcentagem=100*C40/25;
					System.out.println("Aqui a porcentagem das pessoas que tem peso  a 40 kg:"+porcentagem);
		           }
			         
			for(i=2;i<=25;i++) {
				System.out.println("Digite a idade da "+i+" pessoa:");
				idade=in.nextInt();	
				System.out.println("Digite a altura da "+i+" pessoa:");
				altura=in.nextDouble();
				System.out.println("Digite o peso da "+i+" pessoa:");
				peso=in.nextDouble();
				if(idade>50) {
					C50=C50+1;
					System.out.println("Aqui a quantidade de pessoas com idade superior a 50 anos:"+C50);
				}
				   if(idade>10  && idade<20)  {
				   C10=C10+1;
				   System.out.println("Aqui a quantidade de idade das pessoas entre 10 e 20 anos:"+C10);
				   h=h+altura;
				   media=h/C10;
				   System.out.println("Aqui a media das alturas das pessoas que tem entre 10 e 20 anos:"+media);
				 }
				         if(peso<40) {
							C40=C40+1;
							System.out.println("Aqui a quantidade de pessoas com peso inferior a 40 kg:"+C40);
							porcentagem=100*C40/25;
							System.out.println("Aqui a porcentagem das pessoas que tem peso  a 40 kg:"+porcentagem);
			           }
				         
				        if (idade>maior) {
				        maior=idade;
				        pesoMaior=peso;
				        
				        }else
				        
				        if(idade<menor) {
				        menor=idade;
				        pesoMenor=peso;
				         }
				       
				         }
			            System.out.println (" ");
			            System.out.println("Aqui a idade da pessoa mais velha:" +maior);
			            System.out.println("Aqui o peso dessa pessoa:"+pesoMaior);
				    System.out.println("aqui a idade da pessoa mais nova:" +menor);
				    System.out.println("Aqui o peso dessa pessoa:"+pesoMenor);
	}
		       
			
	}
			








