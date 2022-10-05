//// public class Solution {
//
//            public static int singleNumber(int[] nums) {
//
//                int[] array = {2, 2, 3, 3, 1};
//                for (int i = 0; i < array.length; i++) {
//                    int counter = 0;
//                    for (int g = 0; g < array.length; g++) {
//                        if (array[i] == array[g]) {
//                            counter += 1;
//                        }
//                    }
//                    if (counter == 1)
//                        System.out.println(array[i]);
//
//                }
//            }
//}