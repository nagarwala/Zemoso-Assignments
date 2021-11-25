class Cycle {
    void balance (){
        System.out.println("I am a cycle balance class ");
    }
}

class Unicycle extends Cycle{
    void balance(){
        System.out.println("Unicycle need balancing ");
    }
}

class Bicycle extends Cycle{
    void balance(){
        System.out.println("Bicycle also need balancing ");
    }
}

class Tricycle extends Cycle{

    void automaticBalanced(){
        System.out.println("Tricycle is itself balanced");
    }
}

class CycleMain{

    public static void main(String[] args) {

        Cycle[] cy = new Cycle[3];
        cy[0] = new Unicycle();
        cy[1] = new Bicycle();
        cy[2] = new Tricycle();

       cy[0].balance();
      cy[1].balance();
       cy[2].balance();

        Unicycle uni = (Unicycle) cy[0];
        Bicycle bi = (Bicycle) cy[1];
        Tricycle tri = (Tricycle) cy[2];
        uni.balance();
        bi.balance();
        tri.balance();

    }

}