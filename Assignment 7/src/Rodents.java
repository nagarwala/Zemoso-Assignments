public abstract class Rodents {

    abstract void size();

    abstract void diseasesSpread();
}

class mouse extends Rodents{

    mouse()
    {
        System.out.println("I am mouse, and i am a rodent");
    }

    @Override
    void size() {
        System.out.println("I am very small in size");
    }

    @Override
    void diseasesSpread() {
        System.out.println("I lead to crop damage and also is the source of hantavirus");
    }
}

class gerbil extends Rodents{

    gerbil(){
        System.out.println("I am a gerbil, and i am a rodent");
    }

    @Override
    void size() {
        System.out.println("I have long hind feet and fairly large ears");
    }

    @Override
    void diseasesSpread() {
        System.out.println("I can also damage crops and also spread leptospirosis");
    }
}

class hamster extends Rodents{

    hamster(){
        System.out.println("I am a hamster, and i am a rodent");
    }

    @Override
    void size() {
        System.out.println("I have a stout body and elongated cheek pouches");
    }

    @Override
    void diseasesSpread() {
        System.out.println("I spread less disease and prove to be ideal pet");
    }
}

    class main{

        public static void main(String[] args) {
            Rodents[] typesOfRodents = new Rodents[3];

            typesOfRodents[0] = new mouse(); // while initializing the array of objects it is calling the constructor of the derived classes
            typesOfRodents[1] = new gerbil();
            typesOfRodents[2] = new hamster();

            typesOfRodents[0].size();
            typesOfRodents[0].diseasesSpread();

            typesOfRodents[1].size();
            typesOfRodents[1].diseasesSpread();

            typesOfRodents[2].size();
            typesOfRodents[2].diseasesSpread();


        }
    }
