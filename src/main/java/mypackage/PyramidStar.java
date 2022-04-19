package mypackage;

public class PyramidStar {
    public static void main(String[]args){
        int rows = 10,space = 10;

        for (int i =1; i <=rows; i++){

            for (int j = 0; j < i; j++) {
                if(j==0){ //first spaces
                    for(int k=0;k<space;k++){
                        System.out.print(" ");
                    }
                }
                if(j>0){ //subsequent spaces
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            space--;
            System.out.print("\n");

        }
        // end of first part
        //starting second part


        space = 2;
        rows--;
        for (int i= rows; i>= rows; i --){
            for (int j =0; j <i; j++){
                if (j==0){
                    for (int k=1; k<=space;k++){
                        System.out.print(" ");

                    }

                }else {
                    System.out.print(" ");
                }

                System.out.print("*");
                /*if (j<0){
                    System.out.print(" ");

                }*/

            }
            System.out.print("\n");
            space++;
            rows--;
            if(rows == 0){
                break;
            }


        }





    }
}
