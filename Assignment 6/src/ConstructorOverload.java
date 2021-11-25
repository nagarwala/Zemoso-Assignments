public class ConstructorOverload {

    public ConstructorOverload(int i1, int i2) {
        this(2,3,4);
        int sum = i1+i2;
        System.out.println("The sum in first Constructor: "+ sum);
    }

    public ConstructorOverload(int a, int b, int c)
    {
        int productOfSum = (a+b)*c;
        System.out.println("The product of sum in second constructor is: " + productOfSum);
    }



    public static void main(String[] args) {
        new ConstructorOverload(7,6);
    }
}
