
/**
 * Write a description of class Node here.
 *
 * @author (Jacob Dent)
 * @version (12/17/2021)
 */
public class Node<E>
{
    private E data;
    private Node next;
    
    public Node(E data)
    {
        this.data = data;
        this.next = null;
    }
    
    public E getData()
    {
        return this.data;
    }
    
    public Node getNext()
    {
        return this.next;
    }
    
    public void setNext(Node nextNode)
    {
        this.next = nextNode;
    }
}
















































































































