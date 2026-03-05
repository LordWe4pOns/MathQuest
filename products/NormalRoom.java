package products;

public class NormalRoom extends Room {
  public NormalRoom() {
    this.a = (int) (Math.random() * 11);
    this.b = (int) (Math.random() * 11);
  }

  @Override
  public void showMessage() {
    System.out.println("\n--- Nouvelle Salle ---");
    System.out.print("Combien font " + a + " x " + b + " ? ");
  }

  @Override
  protected int getResult() {
    return a * b;
  }
}