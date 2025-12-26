/* Find intersection of two linked lists */
package LinkedList;
class node{
    int data;
    node next;
    node(int n){
       data=n;
       next=null;
    }
}

public class IntersectionLinkedList {
    public static node findIntersection(node head1,node head2){
        node ptr1=head1;
        node ptr2=head2;
        while(ptr1!=ptr2){
            if(ptr1==null){
                ptr1=head2;
            }else{
                ptr1=ptr1.next;
            }
            if(ptr2==null){
                ptr2=head1;
            }else{
                ptr2=ptr2.next;
            }
        }

        System.out.println("Intersection at node with value: " + ptr1.data);
        return ptr1;
    }

    public static void main(String[] args){
        node head1=new node(10);
        head1.next=new node(20);
        head1.next.next=new node(30);
        head1.next.next.next=new node(40);
        head1.next.next.next.next=new node(50);

        node head2=new node(5);
        head2.next=new node(15);
        head2.next.next=head1.next.next;
        findIntersection(head1,head2);
    }
}