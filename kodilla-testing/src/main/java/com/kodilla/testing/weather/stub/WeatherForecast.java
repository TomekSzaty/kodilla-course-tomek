package com.kodilla.testing.weather.stub;

import java.awt.*;
import java.util.*;
import java.util.List;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAverage() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
                resultMap.put(temperature.getKey(), temperature.getValue());
        }

        Double sum = 0.0;
        Double average;

        for (Double i : resultMap.values()) {
            sum += i;
        }
        average = (sum /= resultMap.size());
        return average;
    }

    public Double calculateMediana() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
                resultMap.put(temperature.getKey(), temperature.getValue());
        }
        Collection<Double> collectionValues = resultMap.values();
        List<Double> theList = new ArrayList<>();

        Double mediana = 0.0;
        Double averageMediana = 0.0;
        Collections.sort(theList);

        theList.addAll(collectionValues);
        if (theList.size() % 2 == 0) {
            averageMediana = theList.get(theList.size() / 2) + theList.get(theList.size() / 2 - 1);
            mediana = averageMediana / 2.0;
        } else {
            mediana = (double) theList.get(theList.size() / 2);
        }
        return mediana;
    }
}
