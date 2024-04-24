public class Question4 {
    private final int number;
    private final int[] arr;
    public Question4(int number, int[] arr) {
        this.number = number;
        this.arr = arr;
    }
    
    public int SumEvenArray(){
        int sum = 0;
        for(int i = 0; i < number;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
