// merge sort (recursive)  very imp done by myself after memorising

public class Day08 {
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int[] arr, int si, int mid, int ei){
        int[] merged = new int[ei+si-1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }else{
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while(idx1<=mid){
            merged[x++] = arr[idx1++];
        }

        while(idx2<=ei){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j = si; i<merged.length; i++, j++ ){
            arr[j]=merged[i];
        }
    }

    public static void main(String[] args) {
        
    }
}





// leet 905
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low  = 0;
        int high = nums.length-1;

        while(low<=high){
            //case 1 even - odd
            if(nums[low]%2==0 && nums[high]%2!=0){
                low++;
                high--;
            }
            //case 2 odd - even
            else if(nums[low]%2!=0 && nums[high]%2==0){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
            //case 3 even - even
            else if(nums[low]%2==0 && nums[high]%2==0){
                low++;
            }
            //case 4 odd - odd
            else{
                high--;
            }
        }
        return nums;
    }
}


// leet 75 medium almost done by myself

class Solution2 {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length-1;
        while(m<=h){
            if(nums[m] == 2){
                int temp = nums[h];
                nums[h] = nums[m];
                nums[m] = temp;
                h--;
            }else if(nums[m] == 0){
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            }else{
                m++;
            }
        }
        return;
    }
}

// did a lot of dry run for all this


// done bubble, insertion and selection sort as well 