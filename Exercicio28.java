package Exercicio28;
import java.util.Scanner;
import java.util.PriorityQueue;
public class Exercicio28{
	
    public static void main(String[] args) {
    	Scanner LerS= new Scanner (System.in);
    	PriorityQueue <Integer> pq1 = new PriorityQueue <Integer>();    	
    	int variavel;
		System.out.println("Que variáveis quer introduzir?: ");
		variavel = LerS.nextInt();
    	pq1.add(variavel);
    	int variavel1;
    	System.out.println("Que variáveis quer introduzir?: ");
    	variavel1 = LerS.nextInt();
    	pq1.add(variavel1);
    	int variavel2;
    	System.out.println("Que variáveis quer introduzir?: ");
    	variavel2 = LerS.nextInt();
    	pq1.add(variavel2);
    	int variavel3;
    	System.out.println("Que variáveis quer introduzir?: ");
    	variavel3 = LerS.nextInt();
    	pq1.add(variavel3);
    	int variavel4;
    	System.out.println("Que variáveis quer introduzir?: ");
    	variavel4 = LerS.nextInt();
    	pq1.add(variavel4);
    	int variavel5;
    	System.out.println("Que variáveis quer introduzir?: ");
    	variavel5 = LerS.nextInt();
    	pq1.add(variavel5);
    	System.out.println("Fila Original"+pq1);
    	System.out.println("O primeiro elemento da fila: "+pq1.element());

    }
}