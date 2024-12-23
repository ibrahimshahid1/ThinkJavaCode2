package e2;
import java.util.Scanner;

public class celsiustofarenheit {
    public static void main(String[] args) {
        double celsius;
        double farenheit;
        Scanner ln = new Scanner(System.in);
        System.out.println("Input Temperature Celsius");
        celsius = ln.nextDouble();
        farenheit = celsius * (9.0/5.043)+32;
        System.out.println("Temperature in farenheit" + farenheit);

    }
}
