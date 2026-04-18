public class SingleLinkedList {

    Node head, tail;
    int size = 0;

    boolean isEmpty() {
        return size == 0;
    }

    void tambahkanawal(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.next = head;
            head = data;
        }
        size++;
    }

    void tambahkanakhir(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            tail.next = data;
            tail = data;
        }
        size++;
    }

    Node find(Object data) {
        Node current=head;
        while(current != null) {
            if(current.data.equals(data)) {
                return current;}
            current=current.next;}
        return null;}

    // b. Cari berdasarkan index
    Node get(int index) {
        if(index<0||index >= size) return null;
        Node current=head;
        int i=0;
        while(current!=null) {
            if(i==index) return current;
            current=current.next;
            i++;}
        return null;}

    // c. Hapus berdasarkan index
    void hilangkandi(int index) {
        if (index<0|| index>=size) return;
        if (index==0){
            head =head.next;
            if (head == null) tail=null;} 
        else{
            Node prev = get(index - 1);
            Node current = prev.next;
            prev.next = current.next;
            if(current==tail) {
                tail=prev;}}
        size--;}

    // d. Hapus berdasarkan nila
    void remove(Object data) {
        if(isEmpty()) return;
        if(head.data.equals(data)) {
            head=head.next;
            if(head== null) tail=null;
        } else{
            Node current=head;
            while (current.next != null) {
                if (current.next.data.equals(data)) {
                    if (current.next==tail) {
                        tail=current;}
                    current.next=current.next.next;
                    break;}
                current = current.next;}}
        size--;}

    void tambahkandi(int index, Node data) {
        if(index<0|| index> size) return;
        if(index==0) {
            tambahkanawal(data);
        } else if(index==size) {
            tambahkanakhir(data);
        } else{
            Node prev= get(index - 1);
            data.next= prev.next;
            prev.next= data;
            size++;}}

    void tambahkansetelah(Object target, Node data) {
        Node node=find(target);
        if(node != null) {
            data.next=node.next;
            node.next=data;
            if(node==tail) {
                tail=data;}
            size++;}}

    void tambahkansebelum(Object target, Node data) {
        if (head == null) return;
        if (head.data.equals(target)) {
            tambahkanawal(data);
            return;}
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(target)) {
                data.next = current.next;
                current.next = data;
                size++;
                return;}
            current = current.next;}}

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.tambahkanakhir(new Node("A"));
        list.tambahkanakhir(new Node("B"));
        list.tambahkanakhir(new Node("C"));
        list.print();

        System.out.println("Find B: " + list.find("B").data);

        System.out.println("Index 1: " + list.get(1).data);

        list.hilangkandi(1);
        list.print();

        list.remove("C");
        list.print();

        list.tambahkandi(1, new Node("D"));
        list.print();

        list.tambahkansetelah("A", new Node("E"));
        list.print();

        list.tambahkansebelum("D", new Node("F"));
        list.print();
    }
}