package mypackage;

public class Phuchkatand {
    public static void main(String[] args) throws InterruptedException{

        int rows = 10, space = 1, noOFStars = 10;

        boolean lineFlag = false;

        for (int i = 0; i < rows; i++) {
            for (int m = noOFStars; m > 0; m--) {
                if (!lineFlag) {
                    for (int k = 1; k <= space; k++) {
                        System.out.print(" ");

                    }
                }

                lineFlag = true;
                System.out.print(" ");
                Thread.sleep(1000);
                System.out.print("*");

            }
            System.out.print("\n");
            noOFStars--;
            space++;
            lineFlag = false;
        }
        //end of first part
        //starting of second part
        rows = 10;
        noOFStars = 2;
        space = 1;


        for (int i = rows; i >= 2; i--) {

            for (int m = 0; m < noOFStars; m++) {

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
            noOFStars++;
            space++;
            lineFlag = false;
                /*} else {
                    System.out.print(" ");

                }*/


        }//end of stand



    }
}



