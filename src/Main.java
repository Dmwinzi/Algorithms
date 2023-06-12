public class Main {
    public static void main(String[] args) {

        int []  numbers  = {1,2,3,4,5,6};
        int [][]  nums  = {{1,2,3},{4,5}};
        int [] [] num2d  = new int[3][4];

        System.out.println(sumofarray(numbers));
        System.out.println(donothing(numbers));
        System.out.println(sumof2darr(nums));

        //Arrays Data structure
        Arrays  arr  = new Arrays();

        arr.insert1Darray(numbers);
        arr.insert2Darray(num2d);
        var indexval = arr.searcharray(numbers,4);

        if (indexval == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index  " +indexval);
        }

    }


    public static int sumofarray(int [] nums){
        int initial  = 0; //o(1)

        for (int i = 0; i< nums.length;i++){ //o(1)
            initial += i;  //o(1)
        }

        return initial;  //o(1)

        //Total time taken  = o(1) + o(1) + o(1)  + n * o(1)  + o(1)  =  o(1) + n * o(1)
        // o(n)  linear time

    }

   public static int donothing(int [] numbers){
        int initial  = 0;  //o(1)

        return initial;  //o(1)

       // Total time taken  T = o(1) + o(1)  whis is equal to 0(1) {constant time}
   }


   public static int sumof2darr (int [][] array){

        int initial  = 0; // o(1)

        for (int i = 0;i<array.length;i++){   //o(1)
            for (int j =0; j<array[i].length;j++){ // o(1)
                initial += array[i][j]; // o(1)
            }
        }
        return initial; //o(1)

       //Time taken  = o(1) + n ^ 2 * o(1) + o(1)
       //o(1)  + n ^ 2 * o(1)
       // o(n^2) {quadratice time}
   }



}