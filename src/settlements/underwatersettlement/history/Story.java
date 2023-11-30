package settlements.underwatersettlement.history;

import settlements.underwatersettlement.construction.MiningStrongStones;
import settlements.underwatersettlement.entities.Elders;
import settlements.underwatersettlement.entities.UnderwaterColony;
import settlements.underwatersettlement.entities.UnderwaterResident;

public class Story {

    public static void introduceProblemScientifically(Elders initiator, UnderwaterResident person) {
        UnderwaterColony colony = new UnderwaterColony();
        MiningStrongStones mining = new MiningStrongStones();
        System.out.print("Подойдя к проблеме научно, ");
        mining.mineStones(initiator);
        colony.invite(initiator, person);
    }


}