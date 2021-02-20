package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void getLastLog() {
        //Given
        Logger.INSTANCE.log("First log");
        String lastLog = Logger.INSTANCE.getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        assertEquals("First log", lastLog);
    }
}
