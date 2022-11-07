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
      if(tower.checkMove(tower.getDestCol1())){ //first possible destination column
        tower.transfer(tower.getDestCol1());
        if(exploreChoices(tower)){
          return true;
        }
        tower.transfer(tower.getDestCol1());
      }
      if(tower.checkMove(tower.getDestCol2())){ //second possible destination column
        tower.transfer(tower.getDestCol2());
        if(exploreChoices(tower)){
          return true;
        }
        tower.transfer(tower.getDestCol2());
      }
      return false;
    }
  } 
}