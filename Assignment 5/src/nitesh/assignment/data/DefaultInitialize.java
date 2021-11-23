package nitesh.assignment.data;

public class DefaultInitialize {
    int var1;
    char var2;

    public void printVar(){
        System.out.println(var1);
        System.out.println(var2);
    }

    public void printLocalVar(){
        int testVar1;
        char testVar2;

      /* This part of code shows error because class members are implicitly initialized
      (ex: int default value is 0) but local variables are not thus is cannot print without
      initialization
      System.out.println(testVar1);
      System.out.println(testVar2);*/
    }
}
