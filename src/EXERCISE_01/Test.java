package EXERCISE_01;

import javax.swing.JOptionPane;
import java.util.Random;
import java.text.NumberFormat;

public class Test {
    //declare
    String[] questions = {"""
                            In which year did Sun Microsystems fund an internal corporate\s
                            research project led by James Gosling, which resulted in a\s
                            C++ -based object-oriented programming language that Sun called Java?
                            
                            A - 1999
                            B - 1998
                            C - 1991
                            D - 1990
                            """,

                            """
                            Which of the following editions of Java  contains the capabilities\s
                            needed to develop desktop and server applications?
                            
                             A - Java Enterprise Edition (Java EE)
                             B - Java Enterprise Edition 2 (Java 2 EE)
                             C - Java Standard Edition 8 (Java SE 8)
                             D - Java Micro Edition (Java ME)
                            """,

                            """
                            What does an instance variable describe?
                            
                             A - Behaviour of an object
                             B - Height of an object
                             C - Measurement of an object
                             D - Properties of an object
                            """,

                            """
                            Which of the following statements is false in relation to Java parameters?
                            
                             A - Parameters are located inside the parentheses that follow the method name in the method declaration.
                             B - Parameters do not need to specify a datatype.
                             C - Parameters are declared in a comma-separated parameter list
                             D - Parameter names must follow the naming rules of identifiers.
                            """,

                            """             
                            Which of the following statements about static methods in interfaces is NOT true?
                             A - Static methods in interfaces are associated with the class in which they are defined rather than with any object.
                             B - Every instance of the class shares its static methods.
                             C - Static methods in interfaces can be overridden by implementing classes.
                             D - Static methods make it easier to organize helper methods specific to an interface.
                           
                            """
    };
    String[] options = {"A", "B", "C", "D"};
    String[] correctAnswer = {"C","C","C","B","A"};
    String[] userSelects = new String[correctAnswer.length];
    String userSelect;
    boolean check;
    int correctCount = 0;
    int wrongCount = 0;
    float correctRate;

    //methods
    public void simulateQuestion() {
        for (int i = 0; i <questions.length; i++) {
            //define user select
            userSelect = (String) JOptionPane.showInputDialog(null,
                    questions[i], "Test",
                    JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);
            //collecting user input
            userSelects[i] = userSelect;
            //check answer
            checkAnswer(i);
            //generate message
            JOptionPane.showMessageDialog(null,
                    generateMessage(i),
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void checkAnswer(int i) {
        if (userSelects[i].equals(correctAnswer[i])){
            check = true;
            correctCount += 1;
        }
        else {
            check = false;
            wrongCount += 1;
        }
    }
    public String generateMessage(int i) {
        Random random = new Random();
        if (check) {
            switch(random.nextInt(4)) {
                case 1 -> { return "Excellent!"; }
                case 2 -> { return "Good!"; }
                case 3 -> { return "Keep up the good work!"; }
                default -> { return  "Nice work!"; }
            }
        }
        else {
            switch(random.nextInt(4)) {
                case 1 -> { return "No. Please try again!"; }
                case 2 -> { return "Wrong. Try once more!"; }
                case 3 -> { return "Don't give up!"; }
                default -> { return  "No. Keep Trying."; }
            }
        }
    }

    public void inputAnswer() {
        //show percentage
        NumberFormat showPercent = NumberFormat.getPercentInstance();
        simulateQuestion();
        correctRate = (float)correctCount/questions.length;
        String message = "Your correct count is: " + correctCount + "\n" +
                "Your wrong count is: " + wrongCount + "\n" +
                "Your correct rate is: " + showPercent.format(correctRate);
        JOptionPane.showMessageDialog(null, message);
    }
}






