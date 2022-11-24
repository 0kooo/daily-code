package Text1;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        QuickSort(nums, 0, nums.length - 1);
        return nums[k - 1];
    }

    /*public void QuickSort(int[] nums, int i, int j){
        int start = i;
        int end = j;
        if(start > end){
            return;
        }

        int baseNum = nums[i];
        while(start != end){
            while(true){
                if(start >= end || baseNum < nums[end]){
                    break;
                }
                end--;
            }while(true){
                if(start >= end || baseNum > nums[start]){
                    break;
                }
                start++;
            }
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        int temp = nums[i];
        nums[i] = nums[start];
        nums[start] = temp;

        QuickSOrt(nums, i, start - 1);
        QuickSOrt(nums, start + 1, j);
    }*/

    public void QuickSort(int[] nums, int i, int j){
        if(i > j){
            return;
        }
        int s = i;
        int e = j;
        int b = nums[s];
        while(s != e){
            while(s < e && nums[e] > b){
                e--;
            }
            if(s < e){
                nums[s] = nums[e];
                s++;
            }
            while(s < e && nums[s] < b){
                s++;
            }
            if(s < e){
                nums[e] = nums[s];
                e--;
            }
            nums[s] = b;

        }
        QuickSort(nums, i, s - 1);
        QuickSort(nums, s + 1, j);
    }
}
