import associationTestImpl.AccumulateAssociations;
import associationTestImpl.display.Display;
import associationTestImpl.report.JasperReport;

import javax.swing.*;
import java.awt.*;

public class MainMethod {
private static final int WIDTH = 600;
private static final int HEIGHT =400;


    public static void main(String[] args) {

    JFrame frame = new JFrame("C. Jung’s “16 associations");
    frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
    frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
    frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.add(new Display());
    frame.setVisible(true);


        new AccumulateAssociations().inputTheProblem();
        new AccumulateAssociations().inputSixteenAssociationWithProblem();
        new AccumulateAssociations().inputEightAssociations();
        new AccumulateAssociations().inputFourAssociations();
        new AccumulateAssociations().inputTwoAssociations();
        new AccumulateAssociations().inputKeyAssociation();



 //       new JasperReport();
    }
}
