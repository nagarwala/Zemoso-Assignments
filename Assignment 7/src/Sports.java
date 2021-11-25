public class Sports {

    void playSports(){
        System.out.println("I am outer sports class");
    }

      class Cricket{

        Cricket(String countryName){
            System.out.println("I am a player of " + countryName);
        }
    }
}

class player extends Sports{

    void aboutPlayer(){
        System.out.println("I am a outer player");
    }

    class PlayerDescription extends Sports.Cricket {

        PlayerDescription(String countryName) {
            super(countryName);
        }
    }

}

class SportsMain{
    public static void main(String[] args) {
        Sports sp = new Sports();
        Sports.Cricket cri = sp.new Cricket("India");
        //Sports.Cricket cri = new Sports.Cricket("India");



    }
}
