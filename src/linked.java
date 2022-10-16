public class linked {
   Node head;
   Node tail;

   public void tambahDepan(String data){
    Node newNode = new Node(data);
    if (head == null) {
        head = tail = newNode;
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
    
    public void hapusDepan(){
        if (head == null) {
            head = tail = null;
        }
        head = head.next;
        head.prev = null;
    }

    public void hapusBelakang(){
        Node current = head;
        if(head==tail){
            head=tail=null;
        }
        else {
            while(current.next.next != null){
                current=current.next;
            }
            current.next=null;

        }
    }

    public void print (){
        Node current = head;
        while (current !=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
