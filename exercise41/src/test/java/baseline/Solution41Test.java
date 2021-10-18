package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    @Test
    public void testSort(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ling","Mai"));
        people.add(new Person("Johnson","Jim"));
        people.add(new Person("Zarnecki","Sabrina"));
        people.add(new Person("Jones","Aaron"));
        people.add(new Person("Swift","Geoffrey"));
        people.add(new Person("Xiong","Fong"));
        people.add(new Person("Jones", "Chris"));
        String result =
                "Total of 7 names\n" +
                "-----------------\n" +
                "Johnson, Jim\n" +
                "Jones, Aaron\n" +
                "Jones, Chris\n" +
                "Ling, Mai\n" +
                "Swift, Geoffrey\n" +
                "Xiong, Fong\n" +
                "Zarnecki, Sabrina\n";
        assertEquals(result,Solution41.sortedNames(people));
    }

}