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
        head = null;
    }

    public SListIterator iterator()
    {
        return new SListIterator<T>(head);
    } 
}


class SListIterator<T>
{
    Node<T> head;
    Node<T> tail;

    SListIterator(Node<T> t)
    {
        head = t;
    }

    public void insert(T data)
    {
        if(head==null)
        {
            head = new Node<T>(data);
            tail = head;
        }
        else
        { 
            tail.next = new Node<T>(data);
            tail = tail.next;
        }
    }

    public void delete(T data)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(String.valueOf(head.data).equals(String.valueOf(data)))
        {
            head = head.next;
            return;
        }

        Node<T> temp = head;
        while(temp!=tail && !String.valueOf(temp.next.data).equals(String.valueOf(data))) 
            temp = temp.next;

        if(temp==tail)
        {
            System.out.println("No element as such present in the linked list");
            return;
        }

        if(temp.next==tail)
        {
            tail = temp;
            tail.next = null;
        }

        else
            temp.next = temp.next.next;
    }

    public void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node<T> temp = head;
        System.out.print("SList : [");
        while(temp!=tail)
        {
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println(temp.data+"]");
    }
} 

class Assignment_6
{
    public static void main(String args[])
    {
        SList<String> myList = new SList<String>();
        SListIterator it = myList.iterator();
        it.insert("Rahul");
        it.insert("Sreetej");
        it.insert("Jayesh");
        it.display();
        it.delete("Rahul");
        it.delete("Jayesh");
        it.display();
        it.delete("Rahul");
        it.display();
    }
}
