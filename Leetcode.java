package JAVA.Leetcode;



public class Leetcode {
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int a:nums){
            int soluongchuso = tinhsochuso(a);
            if(soluongchuso % 2 == 0 ){
                count++;
            }
        }


        return count;
    }
    
    private static int tinhsochuso(int a) {
        int count =0;
        int temp = a;
        while (temp > 0) {
            count++;
            a=a/10;
            temp =a;
        }
        return count;


    }
    
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i=0;i<=n;){
            if(nums[i]==val)
            {for (int j = i; j < (n-1); j++) {
                    nums[j]=nums[j+1];
                }
                n--;
            }else{
                i++;
            }
        }
        
        return n;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;
            
            while (j >= 0) {
                if (i >= 0 && nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i];
                    k--;
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    k--;
                    j--;
                }
            }
    }
    public static int removeElement2(int[] nums, int val) {
        int k=0;
       for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= val){
                nums[k]=nums[i];
                k++;
            }
       }
        return k;

    }

    public static void main(String[] args) {
        int [] nums = {3,2,2,4,6,8,1};
        int [] nums2 = {2,5,6};
        System.out.println(removeElement2(nums, 2));
    }
}
