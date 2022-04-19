package mypackage;

public class StandNew {
    public static void main(String[] args) throws Exception {
        int rows = 10, noOfStars = 10, space = 1;
        boolean lineFlag = false;
        for (int i = 0; i < rows; i++) {
            for (int a = noOfStars; a > 0; a--) {
                if (lineFlag) {
                    for (int m = 1; m <= space; m++) {
                        System.out.print(" ");
                    }
                }
                lineFlag = true;
                System.out.print(" ");
                Thread.sleep(1000);
                System.out.print("*");
            }
            System.out.print("\n");
            noOfStars--;
            space++;
            lineFlag = false;


        }
        rows = 10;
        noOfStars = 2;
        space = 1;
        for (int i = rows; i >= 2; i--) {
            for (int a = 0; a < noOfStars; a++) {

                if (!lineFlag) {
                    for (int k = (rows - 1); k >= space; k--) {
                        System.out.print(" ");
                    }
                }

                lineFlag = true;
                System.out.print(" ");
                Thread.sleep(1000);
                System.out.print("*");

            }
            System.out.print("\n");
            noOfStars++;
            space++;
            lineFlag = false;
            Thread.sleep(1000);
            System.out.print("*");
        }
        System.out.print("\n");
        space++;
        noOfStars++;
        lineFlag = false;

    }
}