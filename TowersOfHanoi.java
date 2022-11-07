import java.util.*;

public class TowersOfHanoi{
  public static void main(String[] args){
    Tower tower = new Tower();
    exploreChoices(tower);
  }

  public static boolean exploreChoices(Tower tower){
    if(tower.getCol3().size() == 4){
      return true;
    } else{
     if(tower.checkMove(tower.getCurrentCol(), tower.getDestCol1())){ //first possible destination column
      tower.place();
      if(explore(tower){
        return true;
      }
      tower.remove();
     }
     if(tower.checkMove(tower.getCurrentCol(), tower.getDestCol2())){ //second possible destination column
      tower.place();
      if(explore(tower){
        return true;
      }
      tower.remove();
     }
     return false;
    }
  }
}