package mypackage;

public class BubbleSortTest {
    static int[] bubblesort(int[]arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j< (n-i); j++){
                if(arr[j-1] > arr[j]){

                    temp =arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
    public static void main(String[]args) {

    int[] arr = new int [5];
    arr[0]=5;
    arr[1]=12;
    arr[2]=4;
    arr[3]=7;
    arr[4]=92;
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
