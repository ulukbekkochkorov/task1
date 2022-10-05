public class Main {
    public static void main(String[] args) {
        int[] array = {2, 2,7,3, 3, 1,1};
        System.out.println(singleNumber(array));
    }
            public static int singleNumber(int[] nums) {

                
                for (int i = 0; i < nums.length; i++) {
                    int counter = 0;
                    for (int g = 0; g < nums.length; g++) {
                        if (nums[i] == nums[g]) {
                            counter += 1;
                        }
                    }
                    if (counter == 1)
                       return nums[i];

                }
                return 0;
            }
}

