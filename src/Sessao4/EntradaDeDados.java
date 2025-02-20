package Sessao4;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String
        String nome, texto;
        //Int
        int inteiro;
        //Double
        double dobro;
        // Char
        char letra;

        nome = sc.next();
        //pois só o nextLine que quebra linha
        sc.nextLine();
        //Pega a linha inteira
        texto = sc.nextLine();
        inteiro = sc.nextInt();
        dobro = sc.nextDouble();
        letra = sc.next().charAt(0);

        System.out.println("Dados digitados: \n" + nome + "\n" + inteiro + "\n"  + dobro +"\n" + letra + "\n" + texto);


    }
}
