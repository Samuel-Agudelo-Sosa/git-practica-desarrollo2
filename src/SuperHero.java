import java.util.List;

public class SuperHero {
    private String name;
    private List<Ability> abilities;

    public SuperHero(String name, List<Ability> abilities){
        this.name = name;
        this.abilities = abilities;
    }

    public void useAbilities(){
        System.out.println(name + " usa sus habilidades:");
        for(Ability a : abilities) {
            a.use();
        }
    }


}
