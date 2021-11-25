

public class ArrayOfObjectsWithoutInitialize {
    ArrayOfObjectsWithoutInitialize(String str){
        System.out.println("I like to " + str );
    }

    public static void main(String[] args) {
        ArrayOfObjectsWithoutInitialize [] reference = new ArrayOfObjectsWithoutInitialize[5];
    }
}
