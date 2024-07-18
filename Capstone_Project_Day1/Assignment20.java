public class Assignment20{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 9, 3, 4};
        int[] arr2 = {1, 2, 9};
        int[] arr3 = {1, 2, 3, 4};

        System.out.println(contains9(arr1)); 
        System.out.println(contains9(arr2)); 
        System.out.println(contains9(arr3)); 
    }

    public static boolean contains9(int[] nums) {
        // Iterate up to the first 4 elements or the length of the array if it's less than 4
        for (int i = 0; i < Math.min(nums.length, 4); i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }
}
