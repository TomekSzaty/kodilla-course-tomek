package com.kodilla.stream.world;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Asia - Afghanistan, Armenia, Bhutan
        //Europe - Germany, Sweden, Switzerland
        //North America - United States of America, Mexico, Cuba

        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");

        Country afghanistan = new Country("Afghanistan", BigDecimal.valueOf(1000000000));
        Country armenia = new Country("Armenia", BigDecimal.valueOf(1000000000));
        Country bhutan = new Country("Bhutan", BigDecimal.valueOf(1000000000));

        Country germany = new Country("Germany", BigDecimal.valueOf(1000000000));
        Country sweden = new Country("Sweden", BigDecimal.valueOf(1000000000));
        Country switzerland = new Country("Switzerland", BigDecimal.valueOf(1000000000));

        Country usa = new Country("USA", BigDecimal.valueOf(1000000000));
        Country mexico = new Country("Mexico", BigDecimal.valueOf(1000000000));
        Country cuba = new Country("Cuba", BigDecimal.valueOf(1000000000));

        europe.addCountryName(germany);
        europe.addCountryName(sweden);
        europe.addCountryName(switzerland);

        asia.addCountryName(afghanistan);
        asia.addCountryName(armenia);
        asia.addCountryName(bhutan);

        northAmerica.addCountryName(usa);
        northAmerica.addCountryName(mexico);
        northAmerica.addCountryName(cuba);

        world.addContinentWorld(europe);
        world.addContinentWorld(asia);
        world.addContinentWorld(northAmerica);

        //When
        BigDecimal allPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal allPeopleExpected = new BigDecimal("9000000000");
        assertEquals(allPeopleExpected, allPeopleQuantity);
    }
}
