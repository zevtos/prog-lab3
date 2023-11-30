package settlements.underwatersettlement.entities;

public class Elders extends Person{
    public Elders(String name, String role) {
        super(name, role);
    }
    public Elders() {
        super("noname", "Elder");
    }
    @Override
    public String makeSound() {
        return "Мелодичные, трубные звуки, слышные на большом расстоянии";
    }

}
