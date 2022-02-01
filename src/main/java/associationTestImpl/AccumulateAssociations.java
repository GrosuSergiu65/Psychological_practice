package associationTestImpl;

import associationTest.AccumulationPerRisponderi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class AccumulateAssociations implements AccumulationPerRisponderi {
    static List<Map<String, ?>> answers = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    @Override
    public void inputTheProblem() {
        System.out.println("Formulate a problem requiring a solution or any topic that you would like to clarify.\n" +
                "Try to concretize the question and label it with a succinct phrase or word. Write this word at the top of the sheet. \nC" +
                "oncentrate and think about the word you want to work with.");
        Map<String, Object> problem = new HashMap<>();
        problem.put("problem", scan.nextLine());
        answers.add(problem);
    }

    @Override
    public void inputSixteenAssociationWithProblem() {
        for (int i = 0; i < 16; i++) {

            System.out.println("Due blocko");
            answers.add((Map<String, ?>) new HashMap<>().put("First Column", scan.nextLine()));
        }

    }

    @Override
    public void inputEightAssociations() {
        Map<String, Object> secondColumn = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            System.out.println("tre bloco");
            secondColumn.put("Second Column", scan.nextLine());
        }

        answers.add(secondColumn);
    }

    @Override
    public void inputFourAssociations() {
        Map<String, Object> thirdColumn = new HashMap<>();

        for (int i = 0; i < 4; i++) {
            thirdColumn.put("Third Column", scan.nextLine());
        }

        answers.add(thirdColumn);
    }

    @Override
    public void inputTwoAssociations() {
        Map<String, Object> fourthColumn = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            fourthColumn.put("Fourth Column", scan.nextLine());
        }

        answers.add(fourthColumn);
    }

    @Override
    public void inputKeyAssociation() {
        Map<String, Object> key = new HashMap<>();
        key.put("Key Column", scan.nextLine());
        answers.add(key);
    }

    public static List<Map<String, ?>> getAnswers() {
        return answers;
    }

}
