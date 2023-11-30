package settlements.underwatersettlement.entities;

public class NewShoggoth implements Shoggoth {
    private String name;
    private String size;
    private String intelligence;

    public NewShoggoth(String name, String size, String intelligence) {
        this.name = name;
        this.size = size;
        this.intelligence = intelligence;
    }

    public void describeShoggoth() {
        System.out.print(name + " были " + size);
        System.out.println(" и имели: " + intelligence);
    }

    public void followCommands() {
        System.out.println(name + " понимают и исполняют приказы с удивительной быстротой.");
    }
    public void communicateWithElders() {
        System.out.println("Со Старцами они изъяснялись, подражая их голосам");
    }
    public void makeSound(){
        Elders elder = new Elders();
        imitateElderSounds(elder);
    }
    public void makeSound(Elders elder){
        imitateElderSounds(elder);
    }
    public void imitateElderSounds(Elders elder) {
        String sound = elder.makeSound();
        System.out.println("Шогготы подражают звукам старцев, создавая " + sound);
    }
    public void describeBehavior() {
        System.out.println("Теперь шогготы подчинялись не гипнотическому внушению, а простым командам и были идеально послушны");
    }
}
