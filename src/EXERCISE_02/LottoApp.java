package EXERCISE_02;
import javax.swing.*;

public class LottoApp {
    public static void main(String[] args) {
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27:"));
        boolean userWins = false;

        for (int i = 0; i < 5; i++) {
            Lotto lotto = new Lotto();
            int sum = lotto.getSum();
            JOptionPane.showMessageDialog(null, "Your chosen number: " + userNumber + "\nLotto numbers: " + lotto.getNumbers()[0] + ", " + lotto.getNumbers()[1] + ", " + lotto.getNumbers()[2] + "\nSum: " + sum);

            if (sum == userNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You win!");
                userWins = true;
                break;
            }
        }

        if (!userWins) {
            JOptionPane.showMessageDialog(null, "Sorry, you didn't win. The computer wins.");
        }
    }
}
