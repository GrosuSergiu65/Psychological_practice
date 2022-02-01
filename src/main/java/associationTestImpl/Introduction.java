package associationTestImpl;

import java.util.Scanner;

public class Introduction implements associationTest.Introduction {

    @Override
    public void helloWords() {
        System.out.println("C. Jung’s “16 associations” test as a problem solving method");
    }

    @Override
    public void AuthorAndHistory() {
        System.out.println("Carl Jung created and began to use the word association test in 1910-1916 " +
                "to unravel the subconscious. He discovered that this instrument was excellent for helping to establish" +
                " the real motivation of a person. Thanks to this technique, a person can come to the realization of " +
                "his inside world and begin to eliminate his psychological problems.\n" +
                "Over time, K. Jung’s test has transformed into a methodology for working with personality problems, " +
                "as well as an effective method for solving diverse practical problems at the subconscious level.");
        System.out.println("******Press enter to continue******");
        new Scanner(System.in);
    }

    @Override
    public void MainFunctions() {
        System.out.println("1. Exercise-test “16 associations” is primarily intended for solving intrapersonal psychological problems by building a map of associative connections and identifying destructive associations.\n" +
                "2. The method allows you to understand the true feelings, desires and real motivation of a person, to identify the causes and sources of intrapsychic problems, as well as to determine ways to solve them.\n" +
                "3. The versatility of the method allows you to identify the deep roots of any issue and creatively solve problems in any area.\n" +
                "4. The method helps to strengthen awareness, to reveal the essence and true reasons of any problem, as well as generate a number of new extraordinary ideas and strong creative solutions.");
        System.out.println("******Press enter to continue******");
        new Scanner(System.in);
    }

    @Override
    public void Rules() {
        System.out.println("1. For the exercise to be highly effective, it must be performed in absolute peace and solitude.\n" +
                "2. Let go of yourself and freely write down the association words that come to mind. Do not discard words, even if they do not seem right to you.\n" +
                "2. The association can be any, not necessarily logically related to the previous words.\n" +
                "3. Be attentive, choose those words that resonate internally. The more honest and sincere you are with yourself, the better the result will be.\n" +
                "4. Try to find your own, rather than generally accepted associations. Listen to yourself, to your feelings, follow the sensations in the body.\n" +
                "5. Try not to repeat yourself, the word association can be used only once.");
        System.out.println("******Press enter to continue******");
        new Scanner(System.in);
    }

}
