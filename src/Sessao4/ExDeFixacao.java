package Sessao4;

public class ExDeFixacao {



    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f", product1, price1);
        System.out.printf("\n%s, wich price is $ %.2f\n", product2, price2);
        System.out.printf("\nRecord: %d years old, code %d and gender: %s\n", age, code, gender);
        System.out.printf("\nMeasure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);


    }



}
