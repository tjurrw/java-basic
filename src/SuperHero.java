public class SuperHero extends Hero{
    private boolean flying;

    public void attack(Monster m){
        super.attack(m);

        if(this.flying){
            super.attack(m);
        }
    }

    public void fly(){
        this.flying = true;
        System.out.println("He can fly");
    }

    public void land(){
        this.flying = false;
        System.out.println("He has landed");
    }

    public void run(){
        System.out.println("He was reteated");
    }
}