package products;

public abstract class Room {
  protected int a;
  protected int b;

  public abstract void showMessage();

  public boolean checkAnswer(int answer) {
    return answer == getResult();
  }

  // Méthode utilitaire pour obtenir le résultat attendu
  protected abstract int getResult();
}