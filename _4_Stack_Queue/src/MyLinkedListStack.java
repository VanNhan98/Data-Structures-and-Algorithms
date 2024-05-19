public class MyLinkedListStack implements IStackQueu{


    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    };

    Node topNode;
    MyLinkedListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            topNode = newNode;
        }
        else {
            newNode.next = topNode;
            topNode = newNode;
        }
    return true;
}
    @Override
    public int pop() {
         if(isEmpty()) {
             return -1;
         }
         else {
             int value = topNode.value;
             topNode = topNode.next;
             return value;
         }

    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            Node currentNode = topNode;
            while (currentNode != null) {
                System.out.println(currentNode.value); // In ra nút currentNode
                currentNode = currentNode.next;
            }
        }
    }




}
