package LinkedList;
import java.util.LinkedList;
public class MethodLinkedList {
    public static LinkedList<Integer> reorderLL(LinkedList<Integer> l1){
        LinkedList<Integer> l2=new LinkedList<>();
        LinkedList<Integer> evenList=new LinkedList<>();
        for(int i=0;i<l1.size();i++){
            if(l1.get(i)%2==0){
                evenList.add(l1.get(i));
            }
            for(int j=0;j<l1.size();j++){
                if(l1.get(j)%2!=0){
                    l2.add(l1.get(j));
                }
            }
        }
        l2.addAll(evenList);
        return l2;
    }
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2= new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        System.out.println("Linked List l1: " + l1);
        l2=reorderLL(l1);
        System.out.println("Reordered Linked List l2: " + l2);

    }
}