package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SocialTestSuite {
    @Test
    void testDefaultSharingStrategy() {
        //Given
        User millis = new Millenials("Millis");
        User yogi = new YGeneration("Yogi");
        User zenek = new Zgeneration("Zenek");
        //When
        String millisShouldShare = millis.sharePost();
        System.out.println("Millis share on " + millisShouldShare);
        String yogiShouldShare = yogi.sharePost();
        System.out.println("Yogi share on " + yogiShouldShare);
        String zenekShouldShare = zenek.sharePost();
        System.out.println("Zenek share on " + zenekShouldShare);
        //Then
        assertEquals("Facebook", millisShouldShare);
        assertEquals("Twitter", yogiShouldShare);
        assertEquals("Snapchat", zenekShouldShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millis = new Millenials("Millis");
        //When
        String millisShouldShare = millis.sharePost();
        System.out.println("Millis share on " + millisShouldShare);
        millis.setSocialPublisher(new SnapchatPublisher());
        millisShouldShare = millis.sharePost();
        System.out.println("Now Millis publishing on " + millisShouldShare);
        //Then
        assertEquals("Snapchat", millisShouldShare);
    }
}
