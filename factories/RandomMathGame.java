package factories;

import java.util.Scanner;

import products.EasyRoom;
import products.NormalRoom;
import products.HardRoom;
import products.Room;

public class RandomMathGame extends MathGame {
  public RandomMathGame(Scanner scanner) {
    super(scanner);
  }

  @Override
  public Room createRoom() {
    double rand = Math.random();
    if (rand < 0.3) {
      return new EasyRoom();
    } else if (rand < 0.7) {
      return new NormalRoom();
    } else {
      return new HardRoom();
    }
  }
}