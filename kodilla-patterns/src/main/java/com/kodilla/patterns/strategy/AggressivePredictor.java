package com.kodilla.patterns.strategy;

public class AggressivePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] by stock of XYZ ";
    }
}
