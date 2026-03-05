import java.util.Scanner;

import factories.MathGame;
import factories.NormalMathGame;
import factories.EasyMathGame;
import factories.HardMathGame;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choisissez votre mode : 1(Easy), 2(Normal), 3(Hard)");
    int choice = scanner.nextInt();

    MathGame game;

    // Polymorphisme : game peut contenir n'importe quel type de MathGame
    switch (choice) {
      case 1 -> game = new EasyMathGame(scanner);
      case 2 -> game = new NormalMathGame(scanner);
      case 3 -> game = new HardMathGame(scanner);
      default -> game = new NormalMathGame(scanner);
    }

    // Le code suivant reste STRICTEMENT le même peu importe le mode
    game.play();
    scanner.close();
  }
}