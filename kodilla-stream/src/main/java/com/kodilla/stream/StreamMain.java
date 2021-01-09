package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpresionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        //Processor processor = new Processor();
        //processor.execute(() -> System.out.println("This is a text to display"));
        /*
        ExpresionExecutor expresionExecutor = new ExpresionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expresionExecutor.executeExpresion(10, 5, ((a, b) -> a + b));
        expresionExecutor.executeExpresion(10, 5, ((a, b) -> a - b));
        expresionExecutor.executeExpresion(10, 5, ((a, b) -> a * b));
        expresionExecutor.executeExpresion(10, 5, ((a, b) -> a / b));

        System.out.println("Calculating expressions with method references");
        expresionExecutor.executeExpresion(3, 4, FunctionalCalculator ::multiplyAByB);
        expresionExecutor.executeExpresion(3, 4, FunctionalCalculator ::addAToB);
        expresionExecutor.executeExpresion(3, 4, FunctionalCalculator ::divideAByB);
        expresionExecutor.executeExpresion(3, 4, FunctionalCalculator ::subBFromA);

         */

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Dolce Vita",text -> text.toUpperCase());
        poemBeautifier.beautify("Dolce Vita",text -> text.indent(10));
        poemBeautifier.beautify("Dolce Vita",text -> text.replace(' ','%'));
        poemBeautifier.beautify("Dolce Vita",text -> text.replaceAll("Vita","Dolce"));
        poemBeautifier.beautify("Dolce Vita",text -> text.concat("ABC"));
    }
}
