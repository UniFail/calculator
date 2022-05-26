public class Main {
    public static void main(String[] args) {
        int[] mas1 = new int[3];
        mas1[0] = 1;
        mas1[1] = 2;
        mas1[2] = 3;
        for (int i = 0; i < mas1.length; i++) {
            if (i == 0)
                System.out.print(mas1[i]);
            else
                System.out.print("," + mas1[i]);
        }


        System.out.println("\n");
        double mas2[] = {1.57, 7.654, 9.986};
        for (int j = 0; j < mas2.length; j++) {
            if (j == 0)
                System.out.print(mas2[j]);
            else {
                System.out.print("," + mas2[j]);
            }

        }
        System.out.println("\n");
        int mas3[] = {1, 2, 3, 4, 5, 6};
        for (int ij = 0; ij < mas3.length; ij++) {
            if (ij == 0)
                System.out.print(mas3[ij]);
            else
                System.out.print("," + mas3[ij]);

        }
        System.out.println("\n");
    }
}