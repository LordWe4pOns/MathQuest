package factories;

import java.util.Scanner;

import products.HardRoom;
import products.Room;

public class HardMathGame extends MathGame {
  public HardMathGame(Scanner scanner) {
    super(scanner);
  }

  @Override
  public Room createRoom() {
    return new HardRoom();
  }
}