package dsa.doublylinklist;

public class DoublyLinklist {

    Node head;
    Node tail;




    void print()
    {

        if(head==null)
        {
            System.out.println("NO element found");
        }
        Node a=head;
        System.out.println(a.data);
        while(a.next!=null)
        {
            a=a.next;
            System.out.println(a.data);
        }
    }

    void insertAtMiddel(int x,int position)
    {
        Node node=new Node(x);
        Node p=head;
        if(position==0)
        {
            node.next=head;
            head.prev=node;
        }

        while(p!=null&& position>1)
        {
            p=p.next;
            position--;
        }
        if(p!=null && p.next!=null)
        {
            node.next=p.next;
            node.prev=p;
            p.next.prev=node;
            p.next=node;
        }
        else {
            System.out.println("position not found");
        }


    }

    void insertAtEnd(int num)
    {
        Node node=new Node(num);

        if(head==null)
        {
            head=node;
            tail=node;

        }

        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

    }

    void insertAtBegning(int num)
    {
        Node node=new Node(num);

        if(head==null)
        {
            head=node;
            tail=node;
        }
        else {

            node.next=head;
            head.prev=node;
            head=node;
        }
    }





}
