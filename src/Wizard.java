public class Wizard extends Hero{
    int hp = 50;
    int mp = 100;

    public void attack(Monster m) {
        System.out.println(this.name + "'s attack");
        System.out.println("3 point damage to enemy");
        m.hp -= 3;
    }

    public void fireBall(Monster m) {
        System.out.println(this.name + "'s magic");
        System.out.println("20 point damage to enemy");
        m.hp -= 20;
        this.mp -= 5;
    }
}
