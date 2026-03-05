package factories;

import java.util.Scanner;

import products.EasyRoom;
import products.HardRoom;
import products.NormalRoom;
import products.AdditionRoom;
import products.SubtractionRoom;
import products.DivisionRoom;
import products.Room;

public class FullRandomMathGame extends MathGame {
  public FullRandomMathGame(Scanner scanner) {
    super(scanner);
  }

  @Override
  public Room createRoom() {
    int type = (int) (Math.random() * 6); // 0 à 5

    return switch (type) {
      case 0 -> new EasyRoom();
      case 1 -> new NormalRoom();
      case 2 -> new HardRoom();
      case 3 -> new AdditionRoom();
      case 4 -> new SubtractionRoom();
      case 5 -> new DivisionRoom();
      default -> new NormalRoom();
    };
  }
}