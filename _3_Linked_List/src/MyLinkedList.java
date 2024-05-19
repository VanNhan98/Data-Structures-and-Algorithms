// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MyLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        // print Node
        Node.printHeadNode(n1);
        n1 = Node.addToIndex(n1, 6,2);
        Node.printHeadNode(n1);
    }
}