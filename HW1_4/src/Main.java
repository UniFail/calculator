public class Main {
        public static void main(String[] args) {
            //first task
            int i = 1;
            while (i <= 10)
                System.out.print(i++ + " ");
            System.out.println("\n");
            for (int j = 10; j != 0; j--)
                System.out.print(j + " ");
            System.out.println("\n");

            //second task

            int firstFriday = 5;
            for (; firstFriday <= 31; firstFriday = firstFriday + 7) {
                System.out.println("Friday " + firstFriday + "th");
            }

            //third task
            int firstYear =  1822;
            int finishYear = 2059;
            for (int comet = firstYear; comet <= finishYear; comet = comet + 79) {
                System.out.println("In " + comet + " year");
            }

    }
}