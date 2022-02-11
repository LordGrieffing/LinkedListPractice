
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Listlinked testList = new Listlinked("Jacob");
        testList.insertAtEnd("Sabrina");
        testList.insertAtStart("Kyle");
        testList.insertAfter("Kyle", "Alex");
        testList.insertAfter("Jacob", "Max");
        testList.insertBefore("Max", "Nathan");
        testList.insertBefore("Kyle", "Hunter");
        testList.insertAfter("Sabrina", "Jake");
        //testList.insertBefore("Simon", "Gibblon");
        //testList.insertAfter("Gibblon", "Echo");
        System.out.println("======================================");
        System.out.println(testList.getStart().getData());
        System.out.println(testList.getEnd().getData());
        System.out.println(testList.getSize());
        System.out.println("======================================");
        
        testList.printList();
        
        testList.removeRecord("Hunter");
        testList.removeRecord("Jake");
        testList.removeRecord("Nathan");
        System.out.println("======================================");
        System.out.println(testList.getStart().getData());
        System.out.println(testList.getEnd().getData());
        System.out.println(testList.getSize());
        System.out.println("======================================");
        testList.printList();
        
        
    }
}
























































