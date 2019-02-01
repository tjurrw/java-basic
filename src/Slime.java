public class Slime extends Monster {
    String name;
    int hp;

    public Slime(){
        this.hp = 50;
    }

    public void run() {
        System.out.println("The slime was ran confidentially");
    }
}