package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {
    @Test
    public void testFormat(){
        ArrayList<Person> test = new ArrayList<>();
        test.add(new Person("Mai","Ling",55900));
        test.add(new Person("Jim","Johnson",56500));
        test.add(new Person("Aaron","Jones",46000));
        test.add(new Person("Chris","Jones",34500));
        test.add(new Person("Geoffrey","Swift",14200));
        test.add(new Person("Fong","Xiong",65000));
        test.add(new Person("Sabrina","Zarnecki",51500));
        String result =
                "Last      First     Salary\n" +
                "--------------------------\n" +
                "Ling      Mai       55900 \n" +
                "Johnson   Jim       56500 \n" +
                "Jones     Aaron     46000 \n" +
                "Jones     Chris     34500 \n" +
                "Swift     Geoffrey  14200 \n" +
                "Xiong     Fong      65000 \n" +
                "Zarnecki  Sabrina   51500 \n";
        assertEquals(result,Solution42.format(test));
    }
}