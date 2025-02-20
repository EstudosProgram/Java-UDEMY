package Sessao4;

public class FuncoesMatematicas {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B;

        //Faz a raiz quadrada
        A = Math.sqrt(y);
        B = Math.sqrt(25);
        System.out.println("Raiz quadrada de " + y + " = " + A);
        System.out.println("Raiz quadrada de " + 25 + " = " + B);

        //Eleva o primeiro número ao quadrado/any do outro número
        A = Math.pow(y,x);
        B = Math.pow(5,2);
        System.out.println(y +" elevado a "+ x + " = " + A);
        System.out.println(5 + " elevado a " + 2 + " = " + B);

        //Valor absoluto, ou seja, positivo
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + "é: " + A);
        System.out.println("Valor absoluto de " + y + "é: " + B);


    }
}
