package Class;

public class sumofeven {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for(int j=1; j<arr.length;j++){
            if(arr[j] % 2 ==0){
                System.out.println("even numbers " + arr[j]);
            }
        }
    }
}
