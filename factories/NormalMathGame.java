package factories;

import java.util.Scanner;

import products.NormalRoom;
import products.Room;

public class NormalMathGame extends MathGame {
  public NormalMathGame(Scanner scanner) {
    super(scanner);
  }

  @Override
  public Room createRoom() {
    return new NormalRoom();
  }
}