public class SecondLargest{
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        int[] arr = {3,12,34,53,5};
        for(int i=0; i<arr.length; i++){
            if(first < arr[i]){
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }
    }
}
