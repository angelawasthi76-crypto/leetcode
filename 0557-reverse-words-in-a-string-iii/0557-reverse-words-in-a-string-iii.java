class Solution {
    public String reverseWords(String s) {
        char[]arr = s.toCharArray();

        int r=0;
        int l=0;

        while(r<arr.length){
            while(r<arr.length && arr[r]!=' '){
                r++;
            }
            int right =r-1;
            while(l<right){
                char temp =arr[l];
                arr[l]=arr[right];
                arr[right]=temp;
                l++;
                right--;
            }
            r++;
            l=r;
        }
        return new String(arr);
    }
}