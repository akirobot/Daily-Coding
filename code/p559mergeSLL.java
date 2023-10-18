public class p559mergeSLL {
    public class SLL{
        Node head;
        class Node{
            int data;
            Node next;

            Node(int d){
                data = d;
                next = null;
            }
        }
        public SLL insert (SLL list, int data){
            Node new_node = new Node(data);

            if (list.head == null){
                list.head = new_node;
            }
            else {
                Node last = list.head;
                while(last.next != null){
                    last = last.next;
                }
                last.next = new_node;
            }
            return list;
        }
        public void printList(SLL list){
            Node current = list.head;
            System.out.print("SLL: ");
            while (current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
    public static void main (String[] args){

    }
}
