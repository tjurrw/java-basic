public class Dancer extends Character {
    public void dance(){
        System.out.println(this.name + " danced passionately");
    }

    public void attack(Matango m){
        System.out.println(this.name + "'s attack");
        System.out.println("The enemy is damaged 3 point");
        m.hp -= 3;
    }
}