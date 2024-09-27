import java.util.Scanner;

public class GardenTiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int b = in.nextInt();
        int flag = in.nextInt();
        System.out.println((long) (Math.ceil((double) (l / flag)) * ((double) (b / flag))));
    }
}

// THE QUESTION IS THERE WILL BE LENGTH VALUE AND BREADTH VALUE AND A TILE VALUE
// WE HAVE TO COUNT THE NUMBER OF TILES FITTING INSIDE THE GIVEN LENGTH AND
// BREADTH, THE TILES SHOULDNT BE BROKEN AND IT CAN GO OVERBOARD