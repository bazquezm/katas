import java.util.Map;
import java.util.HashMap;

public class Loans {
    private final Map<String, WaitingList> waitingLists = new HashMap<>();

    public String next (String isbn){
        WaitingList waitingList = waitingLists.get(isbn);
        return waitingList.next();
    }

    public void join(String isbn, String member){

        waitingLists.computeIfAbsent(isbn, k -> new WaitingList());
        WaitingList waitingList = waitingLists.get(isbn);
        waitingList.join(member);
    }

    public String toString(){
        return waitingLists.toString();
    }
}