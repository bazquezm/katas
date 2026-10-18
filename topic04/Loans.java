import java.util.Map;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Loans {
    private final Map<String, WaitingList> waitingLists = new HashMap<>();

    public String next (String isbn){
        WaitingList waitingList = waitingLists.get(isbn);

        if (waitingList == null) {
            throw new NoSuchElementException("nobody is waiting for " + isbn);
        }

        return waitingList.next();
    }

    public void join(String isbn, String member){
        waitingLists.computeIfAbsent(isbn, k -> new WaitingList()).join(member);
    }

    public String toString(){
        return waitingLists.toString();
    }
}