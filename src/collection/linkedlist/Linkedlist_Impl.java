package collection.linkedlist;

public class Linkedlist_Impl {


    Node head;
    public void add(int data)
    {
       Node node=new Node();
       node.data=data;
       node.next=null;
       if(head==null) {
           head = node;
       }
       else {
           Node n=head;
           while(n.next!=null)
           {
               n=n.next;
           }
           n.next=node;
       }
    }

    public void show()
    {
        Node node=head;

        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }

        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }

    public void addAtStart(int data)
    {
        Node node =new Node(data);

//        node.next=null;
        node.next=head;
        head=node;


    }

    public void addAt(int index,int data) {
        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next=head;
            head=newNode;
            return;
        }
        Node currentNode = head;
        int currentIndex = 0;

        while (currentNode != null && currentIndex < (index -1)) {

            currentNode = currentNode.next;
            currentIndex++;
//            System.out.println("index "+currentIndex);
        }

            if (currentNode==null) {
                System.out.println("Invalid index. Index out of bounds.");
                return;
            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;

    }

    public void remove(int index)
    {
        if(index<0)
        {
            System.out.println("index can't be negative !!");
            return;
        }

        if(index==0)
        {
            head=head.next;
            return;
        }
        int currentIndex=0;
        Node current=head;
        while (head!=null && currentIndex<index-1)
        {
            currentIndex++;
            current=current.next;
        }
        if(current==null)
        {
            System.out.println("Index invalid !! index out of bound");
        }


        current.next=current.next.next;

//        current.next=null;
    }

}
