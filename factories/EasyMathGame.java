package factories;

import java.util.Scanner;

import products.EasyRoom;
import products.Room;

public class EasyMathGame extends MathGame {
  public EasyMathGame(Scanner scanner) {
    super(scanner);
  }

  @Override
  public Room createRoom() {
    return new EasyRoom();
  }
}