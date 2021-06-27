package FirstNonRepeating;

import java.util.*;

public class Program {

    //O(n^2) time | O(1) space

    //brute force approach, not practical solution

    //nested loop , hash map solution could possibly be implemented
    public int firstNonRepeatingCharacter(String string){
        for(int idx = 0; idx < string.length(); idx++){
            boolean foundDouplicate = false;
            for(int idx2 = 0; idx2 < string.length(); idx2++){
                if(string.charAt(idx) == string.charAt(idx2) && idx != idx2){
                    foundDouplicate = true;
                }
            }
            if(!foundDouplicate) return idx;
        }
        return -1;
    }
    
}
