package settlements.underwatersettlement.entities;

import settlements.underwatersettlement.illumination.PolarLights;

public class PhosphorescentOrganism implements Luminous{
    @Override
    public void provideLight() {
        System.out.println("Фосфоресцирующие организмы обеспечивали Старцев светом");
    }

    @Override
    public void compensateLightLoss() {
        System.out.print("Фосфоресцирующие организмы компенсировали утрату света, которую раньше обеспечивали:");
        PolarLights polarLights = new PolarLights();
        polarLights.describeAurora();
    }   
}
