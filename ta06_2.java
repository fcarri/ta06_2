package project6;

import java.util.Scanner;
import java.util.Random;

public class ta06_2 {
	public static void main(String args[]){
		
		int nombre1, nombre2, no;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("nombre1: ");
		nombre1 = sc.nextInt();
		
		System.out.print("nombre2: ");
		nombre2 = sc.nextInt();
		
		System.out.print("quants?: ");
		no = sc.nextInt();
		
		System.out.println("nombres: ");
		for(int n=1;n<=no;n++) {
			
			System.out.print(" "+nAleatori(nombre1,nombre2));	
		}
		
		
		sc.close();
		
	}
	
	public static int nAleatori(int nombre1, int nombre2) {				
				 
        Random rand = new Random();
        
        if (nombre1 > nombre2) {
        	
        	int n1 = nombre1;
        	nombre1 = nombre2;
        	nombre2 = n1;        	
        }
  
        //nombre aleatori entre 0 i nombre2. Després se li suma nombre1
        int nombreAleatori = rand.nextInt(nombre2 - nombre1) + nombre1;
     		
		return nombreAleatori;
	}
}
