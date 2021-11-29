package Solid.Bank;

public class Bank {
    private String name;
    private String ifscCode;

    public void Bank(String name, String code)
    {
        this.name = name;
        this.ifscCode = code;
    }

    String getName()
    {
        return name;
    }

    String getIfscCode(){
        return ifscCode;
    }
}
