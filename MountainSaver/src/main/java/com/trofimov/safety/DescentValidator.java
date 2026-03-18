package com.trofimov.safety;

public class DescentValidator {
    TruckStatus truck;
    TrailerStatus trailer;

    // Конструктор: говорим валидатору, с чем именно он работает
    public DescentValidator(TruckStatus truck, TrailerStatus trailer) {
        this.truck = truck;
        this.trailer = trailer;
    }

    // Тот самый метод, который "красный" на скрине
    public boolean isSafeToDescend() {
        // Простая логика сравнения со стандартами
        boolean airOk = truck.airPressure >= SafetyStandards.minAirPressure;
        boolean truckTiresOk = truck.steeringTread >= SafetyStandards.minSteerengTreadDepth;
        boolean trailerTiresOk = trailer.tireTread >= SafetyStandards.minTiresTreadDepth;

        return airOk && truckTiresOk && trailerTiresOk;
    }
}