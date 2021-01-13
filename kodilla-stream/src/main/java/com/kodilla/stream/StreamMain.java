package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpresionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        /*PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Dolce Vita",text -> text.toUpperCase());
        poemBeautifier.beautify("Dolce Vita",text -> text.substring( 0, +  text.indexOf(' '))+"ABC");
        poemBeautifier.beautify("Dolce Vita",text -> text.indent(10));
        poemBeautifier.beautify("Dolce Vita",text -> text.replace(' ','%'));
        poemBeautifier.beautify("Dolce Vita",text -> text.replaceAll("Vita","Dolce"));
        poemBeautifier.beautify("Dolce Vita",text -> text.concat("ABC"));*/


        //         People.getList() .stream()
        // //                .map(s -> s.toUpperCase()) / to samo robi co wiersz niżej tylko inny zapis
        //                 .map(String::toUpperCase)
        //                 .filter(s -> s.length() > 11)
        //                 .map(s -> s.substring(0, s.indexOf(' ') + 2 ) + ".")
        //                 .filter(s -> s.substring(0, 1).equals("M"))
        //                 .forEach(System.out::println);
        //
        //
        /*BookDirectory bookDirectory = new BookDirectory();
        Map<String, Book> theResultListOfBooks = bookDirectory.getList() .stream()

                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);*/

        /*BookDirectory bookDirectory = new BookDirectory();
        String theResultListOfBooks = bookDirectory.getList() .stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(";;\n","<<<", ">>>"));
        System.out.println( theResultListOfBooks);*/


        Forum forum = new Forum();

        LocalDate date20YearsAgo = LocalDate.now().minusYears(20);


        Map<Integer, ForumUser> theManUsersMaleUnderTwenty = forum.getTheUserList().stream()
                .filter(forumUser -> forumUser.getUserSex() != 'F')
                .filter(forumUser -> !forumUser.getDateOfBirth().isAfter(date20YearsAgo) )
                .filter(forumUser -> forumUser.getQuantityPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserIdentifier, forumUser-> forumUser));

        //System.out.println("# elements: " + theManUsersMaleUnderTwenty.size());
        theManUsersMaleUnderTwenty.entrySet().stream()
                .map(entry->entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);

    }
}
