 class Player {
    int Pid;
    String Pname;
    public Player(){
        Pid=102;
        Pname="Bittu";
        System.out.println(Pid +" " + Pname);
    }
}
     class Bats extends Player{
        int now;
        Bats(){
            now=2;
            System.out.println(now);
        }
    }
    
     class stats extends Bats{
        int nor;
        stats(){
            nor=150;
            System.out.println(nor);
        }
    }

class Bowler{
        public static void main(String[] args) {
            new Bats();
        }
    }
