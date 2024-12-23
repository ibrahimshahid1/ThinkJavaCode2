package e3;
import java.util.Scanner;
public class hourstoseconds {
    public static void main(String[] args) {
        int seconds;
        int convertedTime;
        Scanner number = new Scanner(System.in);
        System.out.println("input seconds");
        seconds = number.nextInt();
        convertedTime = seconds/3600;
        System.out.println("Converted Time is" + " " +  convertedTime + " " + "hours");
    }
}
