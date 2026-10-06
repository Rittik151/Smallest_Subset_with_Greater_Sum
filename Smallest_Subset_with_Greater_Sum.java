import java.util.*;

class Smallest_Subset_with_Greater_Sum {
    int minSubset(int[] arr) {
        // code here
        int sum = Arrays.stream(arr).sum();

        Arrays.sort(arr);

        int max = 0;
        int count = 0;
        for(int i = arr.length - 1; i >= 0 ; i--){
            max += arr[i];

            if(max > sum - max){
                return arr.length - i;
            }

        }

        return 0;
    }
}