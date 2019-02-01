public class Archer extends Hero{
    int hp = 80;
    int conc = 100;

    public void attack(Monster m) {
        System.out.println(this.name + "'s attack");
        System.out.println("10 point damage to enemy");
        m.hp -= 10;
    }
}
