import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> places = new LinkedList<>();
        LinkedList<String> placesVisited = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        /*removeElements(placesToVisit);
        System.out.println(placesToVisit);*/

        /*gettingElements(placesToVisit);*/

        //printItinerary(placesToVisit);
        testIterator(placesToVisit);

    }
    private static void addMoreElements(LinkedList<String> list){

        list.addFirst("Darvin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack Methods
        list.push("Alice Springs");


    }

    private static void removeElements(LinkedList<String> list){

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removed first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removed first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removed last element
        System.out.println(s3 + " was removed");

        // Queue/Deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");
        //Stack methods
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);
        //Stack methods
        String p4 = list.pop(); // removes first element
        System.out.println(p4 + " was removed");


    }

    private static void gettingElements(LinkedList<String> list){

        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position" + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("melbourne"));

        //Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekFirst() = " + list.peekLast());

    }
    public static void printItinerary(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        //Option 1
        /*for(int i = 1; i < list.size(); i++){
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }*/

        //Option 2
        /*String previousTown = list.getFirst();
        for(String town: list){
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }*/

        //Option 3 Important!!!
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());

    }





    private static void testIterator(LinkedList<String> list){

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
                iterator.remove();
            }
        }

        var iterator2 = list.listIterator();
        while (iterator2.hasNext()) {
            if(iterator2.next().equals("Brisbane")){
                iterator2.add("Lake Wivenhoe");
            }
        }

        while (iterator2.hasNext()) {
            // System.out.println(iterator2.next()); es funktioniert nicht da iterator hat zu ende die liste gegangen. es muss jetzt zurück
            System.out.println(iterator2.previous()); // weil listIterator ist das
        }

        System.out.println(list);

        var iterator3 = list.listIterator(3);
        System.out.println(iterator3.next());


    }
}
