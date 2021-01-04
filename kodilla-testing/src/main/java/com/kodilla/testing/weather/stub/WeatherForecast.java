package com.kodilla.testing.weather.stub;

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
        Map<String, Double> map = temperatures.getTemperatures();

        Double sum = 0.0;

        for (Double i : map.values()) {
            sum += i;
        }
        return sum / map.size();
    }

    public Double calculateMediana() {
        Map<String, Double> map = temperatures.getTemperatures();

        List<Double> theList = new ArrayList<>(map.values());
        Collections.sort(theList);

        Double mediana;
        Double averageMediana;

        if (theList.size() % 2 == 0) {
            averageMediana = theList.get(theList.size() / 2) + theList.get(theList.size() / 2 - 1);
            mediana = averageMediana / 2.0;
        } else {
            mediana = theList.get(theList.size() / 2);
        }
        return mediana;
    }
}
