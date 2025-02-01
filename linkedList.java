// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         this.data=x;
//         this.next=null;
//     }
// }
// class linkedList{
//     public static void main(String args[]){
//         Node head=new Node(2);
//         Node n=new Node(5);
//         head.next=n;
//         Node nn =new Node(6);
//         n.next=nn;
//         Node ne=new Node(10);
//         nn.next=ne;
//         list(head);
//     }
//     static void list(Node head){
//         Node temp=head;
//         int c=0;
//         while(temp!=null){
//             System.out.print(temp.data+"->");
//             c++;
//             temp=temp.next;
//         }
//         System.out.println();
//         System.out.println(c);
//     }
// }
// ============================================================================================

// Insert a element in linked list----------------
// Insert a element in linked list-------------
import java.util.*;
class Node{
    char data;
    Node next;
    Node(char x){
        this.data=x;
        this.next=null;
        
    }
}
public class linkedList{
    public static void main(String args[]){
        Node head=new Node('V');
        Node n=new Node('I');
        head.next=n;
        Node nn=new Node('S');
        n.next=nn;
        head=insert(head,'K',2);
        printLinkedList(head);
    }
    static Node insert(Node head,char a,int b){
        Node ne=new Node(a);
        Node temp=head;
        for(int i=1;i<=b-1;i++){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
            // Node temp=head.next;
            ne.next=temp.next;
            temp.next=ne;
            return head;
        }
        static void printLinkedList(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
}