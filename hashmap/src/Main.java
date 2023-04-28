public class Main {
    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();

        // add some key/value pairs
        myMap.add("apple", "red");
        myMap.add("banana", "yellow");
        myMap.add("kiwi", "green");

        // display all key/value pairs
        System.out.println("Before removing a key/value pair:");
        myMap.display();

        // remove a key/value pair
        myMap.remove("banana");

        // display all key/value pairs again
        System.out.println("After removing a key/value pair:");
        myMap.display();
    }
}
