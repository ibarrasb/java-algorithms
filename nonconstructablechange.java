import java.util.*;

class nonconstructablechange {
  
  public int nonConstructableChange(int[] coins) {
    Array.sort(coins);
    
    int currentChange = 0;
    for(int coin : coins) {
      if (coin > currentChange + 1) {
        return currentChange + 1;
      }
      
      currentChange += coin;
    }
    return currentChange + 1;
    
  }
    

}
