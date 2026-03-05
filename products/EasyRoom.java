package products;

public class EasyRoom extends Room {
  public EasyRoom() {
    // Génère deux nombres aléatoires entre 0 et 5
    this.a = (int) (Math.random() * 6);
    this.b = (int) (Math.random() * 6);
  }

  @Override
  public void showMessage() {
    System.out.println("\n--- Nouvelle Salle ---");
    System.out.println("Difficulté : Facile");
    System.out.print("Combien font " + a + " x " + b + " ? ");
  }

  @Override
  protected int getResult() {
    return a * b;
  }
}