package Sessao4;

import java.util.Locale;
import java.util.Scanner;

public class ExExtras {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Ex 1

        int numero1;
        int numero2;

        System.out.println("Digite o primeiro número:");
        numero1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        numero2 = sc.nextInt();

        int resultado = numero1 + numero2;
        System.out.printf("SOMA = %d%n", resultado);

        //Ex 2

        double numraiz;

        System.out.println("Digite um número para a raiz quadrada:");
        numraiz = sc.nextDouble();

        double area = 3.14159 * Math.pow(numraiz, 2);

        System.out.printf("A = %.4f%n", area);

        //Ex 3

        int a,b,c,d;

        System.out.println("Digite 4 números inteiros:");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

       int diferenca = ((a * b) - (c * d));

       System.out.printf("DIFERENÇA = %d%n", diferenca);

       //Ex 4

        int numFuncionario;
        int horasWorked;
        double rendaPorHora = 5.50;

        System.out.println("Digite seu número: ");
        numFuncionario = sc.nextInt();

        System.out.println("Digite suas horas trabalhadas: ");
        horasWorked = sc.nextInt();

        double salario = horasWorked * rendaPorHora;

        System.out.printf("NUMBER: %d %n", numFuncionario);
        System.out.printf("SALARY: U$ %.2f", salario);

        //Ex 5

        //Ex 6
    }
}
