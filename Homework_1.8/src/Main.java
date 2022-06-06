import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void PrintSeparators(){
        System.out.println("==================================");
    }

    //Task 1
    public static void CheckLeap(int infoYear){
       if (infoYear % 4 == 0 || infoYear % 100 == 0 || infoYear % 400 == 0){
           System.out.println(infoYear + " - leap year ");
       }
       else {
           System.out.println(infoYear + " - not a leap year ");
       }
    }

    //Task 2
    public static void CheckOS(int year, byte OS){
    int currentYear = LocalDate.now().getYear();
        if (year < currentYear && OS == 0){
            System.out.println("Download the lite-version for IOS");
    }
        else if (year == currentYear && OS == 0){
            System.out.println("Download the version for IOS");
        }

        if (year < currentYear && OS == 1){
            System.out.println("Download the lite-version for Android");
        }
        else if (year == currentYear && OS == 1) {
            System.out.println("Download the version for Android");
        }
    }

    public static void main(String[] args) {
        //Task 1
        PrintSeparators();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        CheckLeap(year);
        PrintSeparators();

        //Task 2
        int yearOfRelease = 2022;
        byte typeOS = 1;
        CheckOS(yearOfRelease,typeOS);
        PrintSeparators();

        //Task 3

    }
}