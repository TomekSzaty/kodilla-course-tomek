package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given

        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów",25.5);
        temperaturesMap.put("Kraków",26.2);
        temperaturesMap.put("Wrocław",24.8);
        temperaturesMap.put("Warszawa",25.2);
        temperaturesMap.put("Gdańsk",26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateAverageWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów",25.5);
        temperaturesMap.put("Kraków",26.2);
        temperaturesMap.put("Wrocław",24.8);
        temperaturesMap.put("Warszawa",25.2);
        temperaturesMap.put("Gdańsk",26.1);
        temperaturesMap.put("Bialystok",25.9);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double averageTemperatures = weatherForecast.calculateAverage();

        //Then
        Assertions.assertEquals(25.616666666666664, averageTemperatures);


    }


    @Test
    void testCalculateMedianaWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów",25.5);
        temperaturesMap.put("Kraków",26.2);
        temperaturesMap.put("Wrocław",24.8);
        temperaturesMap.put("Warszawa",25.2);
        temperaturesMap.put("Gdańsk",26.1);
        temperaturesMap.put("Bialystok",25.9);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double mediansTemperatures = weatherForecast.calculateMediana();

        //Then
        Assertions.assertEquals(25.549999999999997, mediansTemperatures);


    }
}
