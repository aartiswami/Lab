public class MaxArray {

        public static void main(String[] args) {
            // Define a 1D array
            int[] array = {15, 28, 3, 47, 9, 56, 12};
    
            // Initialize max with the first element of the array
            int max = array[0];
    
            // Iterate through the array to find the maximum element
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
    
            // Print the maximum element
            System.out.println("The maximum element in the array is: " + max);
        }
    }
    

