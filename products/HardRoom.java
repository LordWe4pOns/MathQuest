package products;

public class HardRoom extends Room {
  public HardRoom() {
    // Génère deux nombres aléatoires entre 0 et 50
    this.a = (int) (Math.random() * 51);
    this.b = (int) (Math.random() * 51);
  }

  @Override
  public void showMessage() {
    System.out.println("\n--- Nouvelle Salle ---");
    System.out.println("Difficulté : Difficile");
    System.out.print("Combien font " + a + " x " + b + " ? ");
  }

  @Override
  protected int getResult() {
    return a * b;
  }
}