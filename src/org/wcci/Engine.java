package org.wcci;

public class Engine {
    private String engineType;
    private int fuelBurnRate;

    public Engine(String engineType, int fuelBurnRate) {
        this.engineType = engineType;
        this.fuelBurnRate = fuelBurnRate;
    }

    public int getFuelBurnRate() {
        return fuelBurnRate;
    }

}
