 interface NewCycle {

    int numberOfTyres();
}

class NewUnicycle implements NewCycle {

    int tyres = 1;

    @Override
    public int numberOfTyres() {
        return tyres;
    }
}

class NewBicycle implements NewCycle{

 int tyres = 2;
    @Override
    public int numberOfTyres() {
        return tyres;
    }
}

class NewTricycle implements NewCycle{

    int tyres = 3;
    @Override
    public int numberOfTyres() {
        return tyres;
    }
}

class CycleFactory{
    public NewCycle createNewCycle(String tyre){
             if(tyre == null || tyre.isEmpty())
                 return null;
             if("One".equals(tyre))
                 return new NewUnicycle();
             else if("Two".equals(tyre))
                 return new NewBicycle();
             else if("Three".equals(tyre))
                 return new NewTricycle();
             return null;
    }
}

  class BuyACycle {
     public static void main(String[] args) {
         CycleFactory cyclefactory = new CycleFactory();
         NewCycle newcycle = cyclefactory.createNewCycle("Two");
         System.out.println(newcycle.numberOfTyres());
     }


 }
