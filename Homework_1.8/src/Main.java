import java.util.Scanner;

public class Main {

    public static void CheckLeap(int infoYear){
       if (infoYear % 4 == 0 || infoYear % 100 == 0 || infoYear % 400 == 0){
           System.out.println(infoYear + " - leap year ");
       }
       else {
           System.out.println(infoYear + " - not a leap year ");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        CheckLeap(year);


    }
}