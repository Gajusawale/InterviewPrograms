package dsa.doublylinklist;

public class Test {

    public static void main(String[] args) {
        DoublyLinklist dl=new DoublyLinklist();

//        dl.insert(23);
//        dl.insert(24);
//        dl.insert(25);
//        dl.insert(26);
//        dl.insert(27);
        dl.insertAtEnd(30);
        dl.insertAtEnd(50);
        dl.insertAtEnd(69);
        dl.insertAtBegning(20);

//        dl.insertAtMiddel(28,4);
        dl.print();
    }
}
