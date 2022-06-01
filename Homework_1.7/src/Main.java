import java.io.UnsupportedEncodingException;


public class Main {
    public static void main(String[] args) {
    String firstName = "иванов";
    String middleName = "семён";
    String lastName = "семёнович";
    //1 Task
    String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Full name: " + fullName);
    //2 Task
    String firstNameUp = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
    String middleNameUp = middleName.substring(0, 1).toUpperCase() + middleName.substring(1).toLowerCase();
    String lastNameUp = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
    String fullNameUpperCase = firstNameUp + " " + middleNameUp + " " + lastNameUp;
        System.out.println("Full name uppercase: " + fullNameUpperCase);
        //3 Task
        fullNameUpperCase = fullNameUpperCase.replace("ё","е");
        System.out.println("Full name is correctly: " + fullNameUpperCase);


    }
}