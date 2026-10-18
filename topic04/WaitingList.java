import java.util.LinkedHashSet;
import java.util.Set;
//  LinkedHashSet
//  This collections answer second question; it requires avoid duplicates
//  Big O operations
//    - Finding O(1) : it search on specific bucket
//    - Adding O(1) : it ubicate the bucket and insert the object
//

public class WaitingList {

    private final LinkedHashSet<String> waitingList;

    public WaitingList(){
        this.waitingList = new LinkedHashSet<>();
    }

    public String next (){
        return waitingList.removeFirst();
    }

    public void join(String member){

        if ( waitingList.contains (member)){
            throw new IllegalStateException("member can't join twice");
        }

        waitingList.add(member);
    }

    public String toString(){

        return waitingList.toString();

    }

}