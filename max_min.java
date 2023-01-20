import java.util.Arrays;

public class max_min {
    public static void main(String[] args) {

        int number = 10;
        int[] arr = new int[number];

        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = (int) (Math.random() * number);
        }
        

        int min = arr[0];
        int max = arr[0];
        

        for ( int i = 0; i < arr.length; i++ ) {
            if (max < arr[i]) 
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
            /*avg += arr[i]/arr.length; для double */
        }
        Arrays.sort(arr, 0, number);
        int avg = arr[arr.length / 2];

        int avg1 = (max + min)/ 2;
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
        System.out.println(avg1);
        System.out.println(Arrays.toString(arr));
    }
}