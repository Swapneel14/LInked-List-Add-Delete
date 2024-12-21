 public class LL {
    Node head;
    class Node{
        String data;
        Node next;
    Node(String data){
    this.data=data;
    this.next=null;
}
    }
    public void add_first(String data){
        Node abc = new Node(data);
        if(head==null){
            head = abc;
            return;
        }
        abc.next= head;
        head= abc;
    }
    public void addlast(String data){
        Node sopu= new Node(data);
        if(head== null){
            head = sopu;
            return;
        }
       Node currNode= head;
       while(currNode.next != null){
        currNode= currNode.next;
       }
       currNode.next= sopu;

    }
    public void printlist(){
        Node currNode= head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode= currNode.next;
        }
        System.out.println("NULL");
    }
    public void delete_first(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    public void delete_last(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast= head;
        Node Last=head.next;
        while(Last.next != null){
            Last=Last.next;
            secondLast=secondLast.next;
            secondLast.next = null;
        }
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.add_first("Swapneel");
        list.add_first("is");
        list.add_first("name");
        list.add_first("My");
        
        list.printlist();
        list.delete_first();
        list.printlist();
        list.delete_last();
        list.printlist();
    }
}
