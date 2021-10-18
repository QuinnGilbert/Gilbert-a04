package baseline;

//Sortable class to store names
public class Person implements Comparable<Person>{
    String first;
    String last;
    Person(String f, String l){
        first = f;
        last = l;
    }
    public int compareTo(Person b){
        if(first.equals(b.first)) return last.compareTo(b.last);
        return first.compareTo(b.first);
    }
}