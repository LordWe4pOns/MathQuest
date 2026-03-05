public class NormalRoom {
  private int a;
  private int b;

  public NormalRoom() {
    // Génère deux nombres entre 0 et 10
    this.a = (int) (Math.random() * 11);
    this.b = (int) (Math.random() * 11);
  }

  public void showMessage() {
    System.out.println("\n--- Nouvelle Salle ---");
    System.out.println("Combien font " + a + " x " + b + " ? ");
  }

  public boolean checkAnswer(int answer) {
    return answer == (a * b);
  }
}