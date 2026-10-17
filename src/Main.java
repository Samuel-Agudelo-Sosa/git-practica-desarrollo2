import java.util.List;


public class Main {
    public static void main(String[] args){
        SuperHero superman = new SuperHero("Superman", List.of(new FlyAbility(), new SuperStrength()));
        superman.useAbilities();
        System.out.println();

        Avengers avengers = new Avengers(List.of(new IronMan(), new Hulk(), new Thor()));
        avengers.fight();
    }
}