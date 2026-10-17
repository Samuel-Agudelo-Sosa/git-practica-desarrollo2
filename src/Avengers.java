import java.util.List;

public class Avengers {
    List<Avenger> miembros;

    public Avengers(List<Avenger> miembros){
        this.miembros = miembros;
    }

    public void fight(){
        for(Avenger m : miembros){
            m.fight();
        }
    }


    
}
