public class DoubleLinkedList {
    Node head, tail;
    int size = 0;

    boolean isEmpty() { return size == 0; }

    void addFirst(Node data) {
        if (isEmpty()) {
            head = tail = data;
        } else {
            data.next = head;
            head.prev = data;
            head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = tail = data;
        } else {
            tail.next = data;
            data.prev = tail;
            tail = data;
        }
        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    Node carinilai(Object value) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(value)) return current;
            current = current.next;
        }
        return null;
    }

    Node caridariindex(int index) {
        if (index < 0 || index >= size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;}
        return current;}

    void hilangkandariindex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
        } else {
            Node target = caridariindex(index);
            target.prev.next = target.next;
            target.next.prev = target.prev;
        }
        size--;
    }

    void hilangkandarinilai(Object value) {
        Node target = carinilai(value);
        if (target == null) return;

        if (target == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (target == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
            else head = null;
        } else {
            target.prev.next = target.next;
            target.next.prev = target.prev;
        }
        size--;
    }

    void tambahkanpadaindex(Node data, int index) {
        if (index <= 0) {
            addFirst(data);
            return;
        }
        if (index >= size) {
            addLast(data);
            return;
        }

        Node current = caridariindex(index);
        data.next = current;
        data.prev = current.prev;

        current.prev.next = data;
        current.prev = data;

        size++;
    }

    void tambahkansetelah(Object value, Node data) {
        Node target = carinilai(value);
        if (target == null) return;
        if (target == tail) {
            addLast(data);
            return;}
        data.next = target.next;
        data.prev = target;
        target.next.prev = data;
        target.next = data;
        size++;
    }

    void tambahkansebelum(Object value, Node data) {
        Node target = carinilai(value);
        if (target == null) return;

        if (target == head) {
            addFirst(data);
            return;
        }

        data.next = target;
        data.prev = target.prev;

        target.prev.next = data;
        target.prev = data;

        size++;
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        // Awal
        list.addLast(new Node("A"));
        list.addLast(new Node("B"));
        list.addLast(new Node("C"));

        System.out.print("Sebelum: ");
        list.print();

        
        System.out.println("Cari B: " + list.carinilai("B").data);
        System.out.println("Cari Z: " + list.carinilai("Z"));

        
        System.out.println("Index 1: " + list.caridariindex(1).data);
        System.out.println("Index 9: " + list.caridariindex(9));

    
        list.hilangkandariindex(1);
        System.out.print("Hapus index 1: ");
        list.print();

        list.tambahkanpadaindex(new Node("B"), 1);

        
        list.hilangkandarinilai("B");
        System.out.print("Hapus B: ");
        list.print();

        
        list.addLast(new Node("C"));

        list.tambahkanpadaindex(new Node("X"), 1);
        System.out.print("Tambah X di index 1: ");
        list.print();

        
        list.tambahkansetelah("A", new Node("Y"));
        System.out.print("Tambah Y setelah A: ");
        list.print();

        
        list.tambahkansebelum("C", new Node("Z"));
        System.out.print("Tambah Z sebelum C: ");
        list.print();
    }
}