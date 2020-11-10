package Replit_test;

public class Jair_Replit_123 {
    public static void main(String[] args) {
        int totalTreeSize = 0;
        for (int i = 1; i <= 10; i++) {
            int growth = 1;
            if (i > 3) {
                growth = 2;
            }
            totalTreeSize += growth;
            System.out.println("year " + i + " - growth " + growth + " cm");
            System.out.println("tree size: " + totalTreeSize + " cm");
        }
    }
}
