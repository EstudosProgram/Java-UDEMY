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
        System.out.printf("SALARY: U$ %.2f%n", salario);

        //Ex 5

        int numPeca, numPeca2;
        int qntPeca, qntPeca2;
        double precoUni, precoUni2;

        System.out.println("Digite o código da peça, a quantidade e o valor unitário");
        numPeca = sc.nextInt();
        qntPeca = sc.nextInt();
        precoUni = sc.nextDouble();

        System.out.println("Digite o código da peça, a quantidade e o valor unitário do segundo produto");

        numPeca2 = sc.nextInt();
        qntPeca2 = sc.nextInt();
        precoUni2 = sc.nextDouble();

        double precoAPagar = ((qntPeca * precoUni) + (qntPeca2 * precoUni2));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", precoAPagar);

        //Ex 6

        double a1, b1, c1;
        double pi = 3.14159;

        System.out.println("Digite o número de a, b e c:");
        a1 = sc.nextFloat();
        b1 = sc.nextFloat();
        c1 = sc.nextFloat();

        double triangulo = (a1 * c1) / 2;
        double circulo = Math.pow(c1, 2) * pi;
        double trapezio = ((a1 + b1) * c1) / 2;
        double quadrado = b1 * b1;
        double retangulo = a1 * b1;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f", retangulo);
    }
}
