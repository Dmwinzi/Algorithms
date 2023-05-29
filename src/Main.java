public class Main {
    public static void main(String[] args) {

        int []  numbers  = {1,2,3,4,5,6};

       sumofarray(numbers);
       donothing(numbers);


    }


    public static int sumofarray(int [] nums){
        int initial  = 0; //o(1)

        for (int i = 0; i< nums.length;i++){ //o(1)
            initial += i;  //o(1)
        }

        return initial;  //o(1)

        //Total time taken  = o(1) + o(1) + o(1)  + n * o(1)  + o(1)  =  o(1) + n * o(1)

    }

   public static int donothing(int [] numbers){
        int initial  = 0;  //o(1)

        return initial;  //o(1)

       // Total time taken  T = o(1) + o(1)  whis is equal to 0(1) {constant time}
   }

}