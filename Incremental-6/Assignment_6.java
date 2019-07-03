class Node<T>
{
    T data;
    Node<T> next;
   
    Node(T data)
    {
        this.data = data;
        this.next = null;
    }
    Node()
    {
        this.data = null;
        this.next = null;
    }
}

class SList<T>
{
    Node<T> head;
    SList()
    {
        head = new Node<T>();
    }
    public SListIterator iterator()
    {
        return new SListIterator<T>(head);
    } 
    public String toString()
    {
        if(head.next==null)
            return "SList : []";
        System.out.print("SList : [");
        SListIterator<T> it = this.iterator();
        StringBuilder s = new StringBuilder();
        while(it.hasNext())
            s.append(it.next().data + (it.hasNext() ? ", " : ""));
        return s+"]";
    }
}
class SListIterator<T>
{
    Node<T> head;
    Node<T> current;
    Node<T> tail;
    SListIterator(Node<T> t)
    {
        head = t;
        current=head;
        tail = head;
    }
    public boolean hasNext() {
		return current.next!=null;
	}
	public Node<T> next() {
		current = current.next;
		return current;
	}
    public void insert(T data)
    {
        if(head==null)
            head = new Node<T>(data);
        else
        {
            Node<T> temp = new Node<T>(data);
            tail.next = temp;
            tail = temp;
        }
    }
    public void delete(T data)
    {
        Node<T> temp = head;
        while(temp!=tail && temp.next.data!=data )
            temp = temp.next;
        if(temp==tail)
        {
            System.out.println("No element as such present in the linked list");
            return;
        }
        if(temp.next==tail)
        {
            tail = temp;
            temp.next = null;
        }
        else
            temp.next = temp.next.next;
    }
} 

class Assignment_6
{
    public static void main(String args[])
    {
        SList<Integer> myList = new SList<Integer>();
        SListIterator it = myList.iterator();
        it.insert(10);
        System.out.println(myList);
        it.insert(20);
        System.out.println(myList);
        it.insert(30);
        System.out.println(myList);
        it.insert(30);
        System.out.println(myList);
        it.insert(40);
        System.out.println(myList);
        it.delete(40);
        System.out.println(myList);
        it.delete(50);
        System.out.println(myList);
        it.delete(10);
        System.out.println(myList);
    }
}
