public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr ={1,2,3,0,6,0,0,2};
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    
}