package main;
import settlements.underwatersettlement.construction.*;
import settlements.underwatersettlement.entities.*;
import settlements.underwatersettlement.history.*;
public class MainClass {
    public static void main(String[] args) {
        AncientSculptors ancientSculptors = new AncientSculptors();
        Story story = new Story();

        City city = new City("на дне мрачного моря");
        PhosphorescentOrganism phos_organism = new PhosphorescentOrganism();

        UnderwaterResident architect = new UnderwaterResident("noname", "Подводный архитектор");
        Elders elders = new Elders("noname", "Старцы");

        ancientSculptors.describeSculptorsNarrative();
        story.introduceProblemScientifically(elders, architect);
        System.out.print("И вот, ");
        city.constructCity();
        city.describeNewShoggoth();
        phos_organism.provideLight();
        phos_organism.compensateLightLoss();
    }
}

