package day02.sharpieset;

import day02.sharpie.Sharpie;
import java.util.List;

public class SharpieSet {

  List<Sharpie> newList;

  public int countUsable() {
    int countUsable = 0;
    for (Sharpie item : newList) {
      if (item.inkAmount > 0) {
        countUsable++;
      }
    }
    return countUsable;
  }

  public void removeTrash() {
    for (Sharpie item : newList) {
      if (item.inkAmount == 0) {
        newList.remove(item);
      }
    }
  }

}

