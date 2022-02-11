
/**
 * This is a simple Linked List package. I allows you to create a mutable list that stores
 * generic objects.
 *
 * @author (Jacob Dent)
 * @version (12/17/2021)
 */
public class Listlinked<E>
{
    private Node listStart;
    private Node listEnd;
    private int size;
    
    public Listlinked(E data)
    {
        Node list = new Node(data);
        listStart = list;
        listEnd = list;
        size = 1;
        
    }
    
    public void insertAtEnd(String name)
    {
        Node endNode = new Node(name);
        listEnd.setNext(endNode);
        listEnd = endNode;
        size++;
    }
    
    public void insertAtStart(String name)
    {
        Node startNode = new Node(name);
        startNode.setNext(listStart);
        listStart = startNode;
        size++;
    }
    
    public void insertAfter(E dataSearch, E data)
    {
        Node nextNode = listStart;
        Node workNode = new Node(data);
        int nodeCheck = 0;
        
        while(!(dataSearch.equals(nextNode.getData())))
        {
            nextNode = nextNode.getNext();
            if(nextNode == null)
            {
                System.out.println("Could not find record");
                return;
            }
        }
        
        workNode.setNext(nextNode.getNext());
        nextNode.setNext(workNode);
        size++;
        
        if(workNode.getNext() == null)
        {
            listEnd = workNode;
        }
    }
    
    public void insertBefore(E dataSearch, E data)
    {
        Node nextNode = listStart;
        Node workNode = new Node(data);
        
        if(dataSearch.equals(listStart.getData()))
        {
            workNode.setNext(listStart);
            listStart = workNode;
            size++;
        }
        else
        {
            while(!(dataSearch.equals(nextNode.getNext().getData())))
            {
                nextNode = nextNode.getNext();
                if(nextNode.getNext() == null)
                {
                    System.out.println("Could not find record");
                    return;
                }
            }
            
            workNode.setNext(nextNode.getNext());
            nextNode.setNext(workNode);
            size++;
            
        }
        
        
    }
    
    public boolean findRecord(E dataSearch)
    {
        Node workNode = listStart;
        
        while(!(dataSearch.equals(workNode.getData())))
        {
            workNode = workNode.getNext();
            if(workNode == null)
            {
                System.out.println("Could not find record");
                return false;
            }
        }
        
        return true;
    }
    
    public void removeRecord(E dataSearch)
    {
        Node workNode = listStart;
        
        if(dataSearch.equals(listStart.getData()))
        {
            listStart = listStart.getNext();
            size--;
            return;
        }
        
        while(!(dataSearch.equals(workNode.getNext().getData())))
        {
            workNode = workNode.getNext();
            if(workNode.getNext() == null)
            {
                System.out.println("Could not find record");
                return;
            }
        }
        
        if(workNode.getNext().getNext() == null)
        {
            listEnd = workNode;
            workNode.setNext(null);
            size--;
            return;
        }
        
        workNode.setNext(workNode.getNext().getNext());
        size--;
    }
    
    public Node getStart()
    {
        return listStart;
    }
    
    public Node getEnd()
    {
        return listEnd;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void printList()
    {
        Node nextNode = listStart;
        int nodeCheck = 0;
        String name;
        
        while(nodeCheck == 0)
        {
            System.out.println(nextNode.getData());
            if(nextNode.getNext() == null)
            {
                nodeCheck++;
            }
            nextNode = nextNode.getNext();
        }
    }
}































































