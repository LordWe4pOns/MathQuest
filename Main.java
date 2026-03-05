import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    boolean playing = true;

    System.out.println("Bienvenue dans MathQuest !");
    System.out.println("Répondez juste pour passer à la salle suivante.");

    while (playing) {
      // Problème : On instancie directement une classe concrète ici.
      // Impossible de changer de type de salle sans modifier ce code.
      NormalRoom room = new NormalRoom();

      room.showMessage();

      if (scanner.hasNextInt()) {
        int userAnswer = scanner.nextInt();

        if (room.checkAnswer(userAnswer)) {
          score++;
          System.out.println("Correct ! Vous progressez.");
        } else {
          System.out.println("Dommage... Mauvaise réponse.");
          playing = false;
        }
      } else {
        System.out.println("Entrée invalide. Fin de partie.");
        playing = false;
      }
    }

    System.out.println("\nGAME OVER");
    System.out.println("Salles traversées avec succès : " + score);
    scanner.close();
  }
}