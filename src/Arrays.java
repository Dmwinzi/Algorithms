public class Arrays {

    void insert1Darray(int [] nums){
        int count = 1;

        for (int i = 0;i< nums.length;i++){
             nums[i] = count;
             count++;
        }

        for (int i = 0;i< nums.length;i++){
            System.out.println(nums[i]);
        }

    }

    void insert2Darray(int [][]  nums){
        int count = 1;
        for (int i = 0;i< nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums[i][j]  = count;
                count++;
            }
        }

        for (int i = 0;i< nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.println(nums[i][j]+" ");
            }
            System.out.println();
        }


    }

    public int searcharray(int [] nums,int key) {

        for (int i=0;i < nums.length;i++){
            if (nums[i]==key){
               return i;
            }
        }
        return -1;
    }

}
