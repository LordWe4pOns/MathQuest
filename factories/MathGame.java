package factories;

import java.util.Scanner;
import products.Room;

public abstract class MathGame {
  protected Scanner scanner;

  public MathGame(Scanner scanner) {
    this.scanner = scanner;
  }

  // La Factory Method : les sous-classes décideront du type de salle
  public abstract Room createRoom();

  public void play() {
    int score = 0;
    boolean playing = true;

    System.out.println("Lancement du jeu...");

    while (playing) {
      // Utilisation de la Factory Method au lieu d'un "new" en dur
      Room room = createRoom();

      room.showMessage();

      if (this.scanner.hasNextInt()) {
        int userAnswer = this.scanner.nextInt();
        if (room.checkAnswer(userAnswer)) {
          score++;
          System.out.println("Correct !");
        } else {
          System.out.println("Faux !");
          playing = false;
        }
      } else {
        playing = false;
      }
    }

    System.out.println("\nGAME OVER. Score : " + score);
  }
}