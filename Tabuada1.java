package tabuada1;

import java.util.Scanner;

public class Tabuada1 {
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int  i, r,j;
			for(j=1; j<=10; j++){
				for(i=1;i<=10;i++) {
					r = i*j;
			System.out.println(i+"x" +j+ " = " +r);
				}
			System.out.println(" ");
			in.close();

}
			
}

}
