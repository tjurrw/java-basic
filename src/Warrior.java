public class Warrior extends Hero{
    int hp = 100;

    public void attack(Monster m) {
        System.out.println(this.name + "'s attack");
        System.out.println("7 point damage to enemy");
        m.hp -= 7;
    }
}
