public class Hero extends Character {
    String name;
    int hp;

    public void attack(Monster m){

    };

    public void run(){
        System.out.println(this.name + " was ran");
    }

    public void slip(){
        this.hp -= 5;
        System.out.println(this.name + " is slipped");
    }

    public String toString() {
        return "Name: " + this.name + " /HP " + this.hp;
    }

    public boolean equals(Object o){
        if (this == o){return true;}
        if (o instanceof Hero){
            Hero h = (Hero) o;
            if(this.name.equals(h.name)){
                return true;
            }
        }
        return false;
    }
}