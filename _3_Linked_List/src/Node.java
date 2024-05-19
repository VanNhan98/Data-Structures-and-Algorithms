
public class Node  {
    int value;
    Node next;

   Node(int value) {
        this.value = value;
   }

    public static void printHeadNode(Node head) {
       if(head ==  null ) {
           System.out.println("LinkedList is empty");
       }
       else{
           while (head != null) {
               System.out.print(head.value);
               head = head.next;
               if(head != null) {
                   System.out.print("->");
               }
               else {
                   System.out.println();
               }
           }
       }
    }
    public static Node addToHead(Node headNode, int value) {
       Node newNode = new Node(value);
       if(headNode != null) {
           newNode.next = headNode;
       }
       return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
       Node newNode =  new Node(value);
       Node lastNode =  headNode;
       if (lastNode == null) {
           return newNode;
       }
       else {
           while(lastNode.next != null) {
               lastNode = lastNode.next;
           }
           lastNode.next = newNode;
       }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {
       if (index == 0 ) {
           return addToHead(headNode, value);
       }
       else {
           Node newNode = new Node(value);
           int count  = 0;
           Node curNode = headNode;
           while (curNode != null) {
               count ++;
               if(count == index) {
                   newNode.next = curNode.next;
                   curNode.next = newNode;
               }
               curNode = curNode.next;
           }
       }
       return headNode;
    }

    public static Node removeAtHead(Node headNode) {

       if(headNode != null) {
           return headNode.next;
       }
       return headNode;
    }

    public static Node removeAtTail(Node headNode) {
        if (headNode == null) {
            return null;
        }
         else {
            Node lastNode = headNode;
//            Node prevNode = null;
            while(lastNode.next.next != null) {
//                prevNode = lastNode;
                lastNode = lastNode.next;
            }
            lastNode.next = null;
//            if (prevNode == null) {
//                return null;
//            }
//            else  {
//                prevNode.next = lastNode.next;
//            }
        }


        return headNode;

    }

    public static Node removeAtIndex(Node headNode, int index) {
       if (index < 0 || headNode == null)
           return null;
       if (index == 0)
           return removeAtHead(headNode);
       Node currNode = headNode;
       Node prevNode = null;
       int count = 0;
       boolean isFound = false;
       while(currNode.next != null) {
           if (count == index) {
               isFound = true;
               break;
           }
           prevNode = currNode;
           currNode =  currNode.next;
           count ++;

       }
       if (isFound) {
           if (prevNode == null) {
               return null;
           }
           else {
               if (currNode != null) {
                   prevNode.next = currNode.next;
               }
           }
       }
       return headNode;
    }

    public static Node reverse(Node head) {
       Node curNode = head;
       while(curNode != null && curNode.next != null) {
           Node nextNode =curNode.next;
           curNode.next = nextNode.next;
           nextNode.next = head;
           head = nextNode;
       }
       return head;
    }

}
