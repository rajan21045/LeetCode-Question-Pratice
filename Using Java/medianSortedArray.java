import java.util.Arrays;
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,merged,0,nums1.length);
        System.arraycopy(nums2,0,merged,nums1.length,nums2.length);

        Arrays.sort(merged);
        int result = merged.length;
        if(result % 2 != 0){
            return merged[result/2];
        }
        else{
            return (merged[result/2-1] +merged[result/2])/2.0;
        }
    }
    public static void main(String[] args)
    {
        int nums1[]={1,3};
        int nums2[] = {2};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is "+result);
    }
}