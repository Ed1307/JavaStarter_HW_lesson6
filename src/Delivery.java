public class Delivery {
    public static void main(String[] args) {
        int clients = 5;
        int routs = 1;
        int counter = 1;
        while (counter<=clients){
            routs *= counter;
            counter++;
        }
        System.out.println(routs);
    }
}




