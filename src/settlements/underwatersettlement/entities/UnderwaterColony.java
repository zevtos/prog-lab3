package settlements.underwatersettlement.entities;

import settlements.underwatersettlement.construction.materials.Equipment;

public class UnderwaterColony {

    public void invite(Elders initiator, UnderwaterResident person) {
        System.out.println(initiator.getRole() + " пригласил " + person.getRole() + " из подводного поселения.");
        System.out.println("Это приглашение обусловлено необходимостью применения новейших технологий " +
                "и опыта в строительстве в условиях подводной среды.");

        arrivalDetails(person);
    }
    private void arrivalDetails(UnderwaterResident person) {
        System.out.println(person.getRole() + " прибыл со всем необходимым для деятельности:");

        for (Equipment item : Equipment.values()) {
            System.out.println("- " + item.getDescription());
        }
    }
}
