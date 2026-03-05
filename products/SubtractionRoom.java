package products;

public class SubtractionRoom extends Room {
  public SubtractionRoom() {
    this.a = (int) (Math.random() * 101); // 0 à 100
    this.b = (int) (Math.random() * 101);
  }

  @Override
  public void showMessage() {
    System.out.println("\n--- Nouvelle Salle ---");
    System.out.println("Salle de soustraction");
    System.out.print("Combien font " + a + " - " + b + " ? ");
  }

  @Override
  protected int getResult() {
    return a - b;
  }
}