public class linked {
   Node head;
   
   public void tambahDepan(String data){
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
}

    public void tambahBelakang(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
    
    Node hapusDepan(){
        Node toDelete = new Node(null);
        if (head == null || head.next == null) {
            head = null;
            return toDelete;
        }
        head = head.next;
        head.prev = null;
        return toDelete;
    }

    Node hapusBelakang(){
        Node current = head;
        if (head == null || head.next == null) {
            head = null;
            return current;
        }
        while (current.next != null) {
            current = current.next;
        }
        return current.prev.next = null;
    }

    Node hapusNilai(String data){
        Node current = head;
        while (current.data != data) {
            current = current.next;
        }

        if (current != null) {
            if (current.next != null) {
                current.next.prev = current.next;
            }
            current.prev.next = current.next;
        }
        return current;
    }

    public void print(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void showPrev(){
        Node current = head;
        while (current.next != null) {
            System.out.println(current.prev.data + " -> ");
            current = current.prev;
        }
        System.out.println("NULL");
    }
}
