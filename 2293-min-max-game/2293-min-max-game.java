class Solution {
    public int minMaxGame(int[] nums) {
        return recursive(nums);
    }

    int recursive(int[] arr){
        if(arr.length == 1) return arr[0];

        int[] newArr = new int[arr.length / 2];
        for(int i=0; i<newArr.length; i++){
            if (i % 2 == 0) {
                newArr[i] = Math.min(arr[2*i], arr[2*i + 1]);
            } else {
                newArr[i] = Math.max(arr[2*i], arr[2*i + 1]);
            }
        }

        return recursive(newArr);
    }
}