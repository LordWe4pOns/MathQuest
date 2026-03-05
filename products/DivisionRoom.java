package products;

public class DivisionRoom extends Room {
  public DivisionRoom() {
    this.b = (int) (1 + Math.random() * 10); // Diviseur entre 1 et 10
    int quotient = (int) (Math.random() * 11);
    this.a = b * quotient; // On s'assure que la division tombe juste
  }

  @Override
  public void showMessage() {
    System.out.println("\n--- Nouvelle Salle ---");
    System.out.println("Salle de division");
    System.out.print("Combien font " + a + " / " + b + " ? ");
  }

  @Override
  protected int getResult() {
    return a / b;
  }
}