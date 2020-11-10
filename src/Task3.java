public class Task3 {
    public static void main(String[] args) {

        for (int x = 0; x<5; x++){
            for(int y = 0; y<10; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        for(int x = 0; x<10; x++){
            for(int y = 0; y<x+1; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        int probeli = 3;
        int zvezdochki = 1;
        for (int x = 0; x < 3; x++) {
            for (int z = 0; z < probeli; z++) {
                System.out.print(" ");
            }
            for (int y = 0; y < zvezdochki; y++) {
                System.out.print("*");
            }
            probeli -= 1;
            zvezdochki += 2;
            System.out.print("\n");
        }

        System.out.print("\n");

        probeli = 3;
        zvezdochki = 1;
        for (int x = 0; x < 3; x++) {
            for (int z = 0; z < probeli; z++) {
                System.out.print(" ");
            }
            for (int y = 0; y < zvezdochki; y++) {
                System.out.print("*");
            }
            probeli -= 1;
            zvezdochki += 2;
            System.out.print("\n");
        }
        if(probeli==0){
            probeli = 1;
            zvezdochki = 5;
            for (int x = 0; x < 3; x++){
                probeli += 1;
                zvezdochki-= 2;
                for (int z = 0; z < probeli; z++) {
                    System.out.print(" ");
                }
                for (int y = 0; y < zvezdochki; y++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
