public class Goblin extends Monster {
    String name;
    int hp = 50;

    public void heading(Hero h){
        h.hp -= 5;
        System.out.println(this.name + "'s heading!");
    }
}
