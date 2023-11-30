package settlements.underwatersettlement.construction;

import settlements.underwatersettlement.entities.Elders;

public class MiningStrongStones extends StoneMining {

    @Override
    public void mineStones(Elders initiator) {
        System.out.println(initiator.getRole() + " наладил добычу особо прочных камней в горных недрах.");
    }
}
