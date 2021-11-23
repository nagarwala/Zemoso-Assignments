package nitesh.assignment.singleton;

public class DefaultStatic {
    String str;

    static String returnObj(String string){
        /*t Here, the str variable is a non-static member variable which can only be accessed
        using an object, so if we create multiple objects for str it will have separate values
        but the static method here is accessed directly, which creates a confusion for compiler to
        access which object thus it throws an error.
        his.str = string;
        return str; */
        return "";
    }

    public void printString(){
        System.out.println(str);
    }
}
