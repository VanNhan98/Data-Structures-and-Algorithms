public class MyLinkedListQueue implements IStackQueu{
    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    Node headNode, tailNode;
    MyLinkedListQueue() {
        headNode = null;
        tailNode = null;
    }


    @Override
    public boolean push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        }
        else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return true;
    }

    @Override
    public int pop() {
       if (!isEmpty()) {
           int value = headNode.value;
           if(headNode == tailNode) {
               headNode = tailNode = null;
           }
           headNode = headNode.next;
           return value;
       }
       return -1;
    }

    @Override
    public boolean isFull() {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return headNode == null && tailNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        else {
            Node currentNode = headNode;
            while (currentNode!= null) {
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    }
}
