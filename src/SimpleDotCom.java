/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/4/28 20:43
 * @version: 1.0
 * @modified By:
 */
public class SimpleDotCom {
    int [] locationCells;
    int numOfHits = 0;
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

        public String checkYourself(String stringGuess){
           int guess = Integer.parseInt(stringGuess);

           String result = "miss";

           for (int cell : locationCells){
               if (guess ==cell){
                   result = "hit";
                   numOfHits++;
                   break;

               }
        }
           if(numOfHits == locationCells.length){
               result = "kill";

           }
           System.out.println(result);
           return result;
    }
}
