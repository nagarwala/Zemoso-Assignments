package nitesh.assignment.main;

import nitesh.assignment.data.DefaultInitialize;
import nitesh.assignment.singleton.DefaultStatic;

public class main {
DefaultInitialize obj1 = new DefaultInitialize();
/* A static method belongs to a class rather than an instance thus to access methods of a class it is necessary
    to create a static method
 */
/*
obj1.printVar();
obj1.printLocalVar();
*/

    public static void main(String[] args) {

        DefaultStatic obj2 = new DefaultStatic();
        obj2.printString();
    }
}
