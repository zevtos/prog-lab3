package settlements.underwatersettlement.entities;

public class UnderwaterResident extends Person {
    public UnderwaterResident(String name, String role) {
        super(name, role);
    }

    @Override
    public String makeSound() {
        return "Издаёт звуки";
    }
}
