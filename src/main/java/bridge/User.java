package bridge;

import java.util.ArrayList;
import java.util.List;

public class User {
  private List<String> moveStatus;
  private boolean isGameSuccess;
  private int tryCount;

  public User() {
    this.moveStatus = new ArrayList<>();
    this.isGameSuccess = false;
    this.tryCount = 0;
  }

  public void move(String direction) {
    moveStatus.add(direction);
  }

  public boolean isCorrectlyMove(List<String> bridge) {
    final int index = moveStatus.size() - 1;
    return bridge.get(index).equals(moveStatus.get(index));
  }
}
