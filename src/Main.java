import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a Temperatura atual: ");
        int celsius = sc.nextInt();
        System.out.println("A temperatura atual é de: " + celsius + " Graus Celsius");
        double temperatura = (celsius * 1.8) + 32;
        System.out.printf("E de: " + temperatura + " Fahrenheit%n");

        //Conversão com uso de Casting

        int convertTemperatura;
        convertTemperatura = (int) (temperatura);
        System.out.println(convertTemperatura);

        sc.close();
    }
}