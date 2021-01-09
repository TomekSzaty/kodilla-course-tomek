package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String text, PoemDecorator poemDecorator) {
        String sentence = poemDecorator.decorate(text);
        System.out.println("Upiększone zdanie: " + sentence);
    }
}
