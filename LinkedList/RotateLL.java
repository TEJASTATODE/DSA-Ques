/* given linkedlist of integer values .accept an int value from user and rotate ll from right using ll */
package LinkedList;
import java.util.LinkedList;

public class RotateLL {
    public static LinkedList<Integer> rotateRight(LinkedList<Integer> ll,int k){
        int n=ll.size();
        k=k%n;
        for(int i=0;i<k;i++){
            int val=ll.removeLast();
            ll.addFirst(val);
        }
        System.out.println("Rotated Linked List: " + ll);
        return ll;
    }
public static void main(String[] args){
    LinkedList<Integer> ll=new LinkedList<>();
    ll.add(10);
    ll.add(20);
    ll.add(30);
    ll.add(40);
    ll.add(50);
    int k=2;
    System.out.println("Original Linked List: " + ll);
    rotateRight(ll,k);
}


}