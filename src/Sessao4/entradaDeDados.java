package Sessao4;

import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String
        String nome;
        nome = sc.next();

        //Int
        int inteiro;
        inteiro = sc.nextInt();

        //Double
        double dobro;
        dobro = sc.nextDouble();

        // Char
        char letra;
        letra = sc.next().charAt(0);

        System.out.println("Dados digitados: \n" + nome + "\n" + inteiro + "\n"  + dobro +"\n" + letra);
    }
}
