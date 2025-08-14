package August.day16.linkedlistEx;

public class SingleLinkedListEx<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) { // 노드의 마지막까지 이동
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public Node<T> search(T data) {
        if (head != null) {
            Node<T> node = this.head;
            while (node.next != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public void addNodeInside(T data, T isData) { // 1,2,3  addNodeInside(5,1<-인덱스)
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                if (node.data == isData) {
                    Node<T> node2 = new Node<>(data);
                    node2.next = node.next;
                    node.next = node2;
                    break;
                } else {
                    node = node.next;
                }
            }
        }
    }

    public boolean deleteNode(T isData) {
        if (head != null) {
            Node<T> node = this.head;
            if (node.data == isData) {
                head = null;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        node.next.next = null;
                    } else {
                        node = node.next;
                    }
                }
            }
        }
    }

    public void printAll() {
        if (head != null) { // 그냥 바로 헤드에서 시작하면 안되나
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedListEx<Integer> myLinkedList = new SingleLinkedListEx<>();


        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(5);

        System.out.println(myLinkedList.head.data);
        System.out.println(myLinkedList.head.next.data);

    }


}
