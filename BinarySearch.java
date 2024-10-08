public class BinarySearch {
    public int search(int[] nums, int target) {
        for (int i= 0;i<nums.length ;i++){
            if (nums[i] == target) return i;
        }
        System.gc();
        return -1;
    }

    public int bs(int[] nums, int target){
        int start = 0;
        int end = nums.length -1;
        while (start <= end){
            int mid = ( start + end) /2;
            if(nums[mid] == target) return mid;
            if(nums[mid]  < target){
                start = mid +1;
            }
            if(nums[mid] > target){
                end = mid -1;
            }
        }
        return -1;
    }
}
