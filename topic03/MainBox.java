
import java.util.List;

public class MainBox {

    public static void main (String [] args){


        Box box1 = new Box(4, List.of() );



        Box box2 = new Box(4, List.of() );
        Box box3 = new Box(4, List.of(box2) ); // 8
        Box box4 = new Box(4, List.of(box3) ); // 12
        Box box5 = new Box(4, List.of(box2,box3,box4) ); // 4 + 8 + 12 + 4

        Box boxFinal = new Box(4, List.of(box5) );

        // Imprimira 4
        System.out.println(Box.totalBooks(box1));

        // Imprimira 32
        System.out.println(Box.totalBooks(boxFinal));

    }

}
