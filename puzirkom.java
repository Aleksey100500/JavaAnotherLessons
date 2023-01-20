public class puzirkom {
    public static void main(String[] args) {

        int number = 10;
        int[] array = new int[number];

        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (int) (Math.random() * number);
        }

        for ( int i = 0; i < array.length; i++ ) {
            for ( int j = 0; j < array.length - i - 1; j++ ) {
                int temp = array[j];
                if (array[j] < array[j + 1]) { 
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }   
    }
    
}
