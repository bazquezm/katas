import java.util.LinkedHashSet;
import java.util.Set;
//  LinkedHashSet
//  This collections answer second question; it requires avoid duplicates
//  Big O operations
//    - Finding O(1) : it search on specific bucket
//    - Adding O(1) : it ubicate the bucket and insert the object
//

public class WaitingList {

    private final LinkedHashSet<String> members;

    public WaitingList(){
        this.members = new LinkedHashSet<>();
    }

    public String next (){
        return members.removeFirst();
    }

    public void join(String member){

        if ( members.contains (member)){
            throw new IllegalStateException("member can't join twice");
        }

        members.add(member);
    }

    public String toString(){

        return members.toString();

    }

}