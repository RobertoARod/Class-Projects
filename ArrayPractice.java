public class ArrayPractice{

    public static void main(String[] args) {

        // Initialize int, char, and double arays with values seen on the examples in the instructions doc.
        char[] characters= {'e','v','i','l','x','s','t','o','p','s','x','d','e','s','s','e','r','t','s'};
        char [] reversed = reverseCharArray(characters);
        double[] doubleSum ={100.50, 200.25, 333.33, 400.11, 200.37};
        int[] minMax = {-3, 72, 39, -94, 5};
        String maxMin = "min";
      

        // Print results of Method #1 (Print char array)
        printCharArray(characters);

        // Print results of Method #2 (Reverse char array and print it)
        System.out.println(reversed);

        // Print results of Method #3 (Add all numbers from double array and print sum)
        System.out.println(sumDoubleArray(doubleSum));

        
        // Print results of Method #4 using find = "min". (Find minimum of integer array)
        System.out.println(findMinMax(minMax, maxMin));

        // Print results of Method #4 using find = "max". (Find maximim of integer array)
        maxMin = "max";
        System.out.println(findMinMax(minMax, maxMin));
       
    }


    // Method #1 (Replace all x's with '_' and print all elements)
    public static void printCharArray(char[] array) {
        for(int i = 0; i<array.length; i++){
            if (array[i]=='x'){
                array[i] = '_';
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }


    // Method #2 (Reverse char array and return new reversed char array)
    public static char[] reverseCharArray(char[] array) {
        char [] reverseCharArray = new char[array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0; i--){
            reverseCharArray[j]=array[i];
            j++;

        }
        return reverseCharArray;
    }


     //Method #3 (Add all elements of doubleArray and return sum)
    public static double sumDoubleArray(double[] array) {
        double sum = 0;
        for(int i=0; i <array.length; i++){
            sum += array[i];
        }
       return sum; 
    }

    
    // Method #4 (Find the min/max of given array)
    public static int findMinMax(int[] array, String find) {
        int min = 100000;
        int max = -100000;
        for(int i=0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        if(find.equals("max"))
        {
            return max;
        }
        if(find.equals("min"))
        {
            return min;
        }
        return 0;
    }
}