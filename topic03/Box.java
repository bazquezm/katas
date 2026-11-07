import java.util.List;

public record Box(int books, List<Box> boxes) {


    //  Base case is when we have doesnt not have more elements on list
    //  base case return only books
    //  progress we need to iterate each element and pass the boxes again to counting
    //

    static int totalBooks(Box box){

        int innerBooks = 0;

        for (Box inner : box.boxes()){
            innerBooks += totalBooks(inner);
        }

        return box.books() + innerBooks;
    }

}
