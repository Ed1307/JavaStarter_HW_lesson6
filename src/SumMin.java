public class SumMin {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int sum = 0;
        for(int x = A+1; x<B; x++){
            sum+=x;
        }
        System.out.println(sum);
        for(int x = A+1; x<B; x++){
            if((x%2)==1){
                System.out.println(x);
            }
        }
    }
}
