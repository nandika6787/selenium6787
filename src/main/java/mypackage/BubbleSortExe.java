package mypackage;

public class BubbleSortExe {
    static int[] bubblesort(int[]arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j< (n-i); j++){
                if(arr[j-1] > arr[j]){

                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[]args) {


        int[] arr = new int[10];
        arr[0]=10;
        arr[1]=5;
        arr[2]=3;
        arr[3]=12;
        arr[4]=8;
        arr[5]=7;
        arr[6]=30;
        arr[7]=16;
        arr[8]=48;
        arr[9]=71;




        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");


        }
        System.out.println("\n");

        int[] sortedarr = bubblesort(arr);
        System.out.println();
        for (int i = 0; i < sortedarr.length; i++) {
            System.out.print(sortedarr[i] + ",");
        }
    }

}
