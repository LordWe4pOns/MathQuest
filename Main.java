import java.util.Scanner;

import factories.MathGame;
import factories.NormalMathGame;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pour l'instant on instancie le mode Normal
    MathGame game = new NormalMathGame(scanner);
    game.play();
    scanner.close();
  }
}