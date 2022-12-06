package cafeBusinessLogic;

import java.awt.font.NumericShaper;
import java.util.stream.IntStream;

public class CafeUtil {

    public int getStreakGoal(){
        IntStream intStreamRangeOf = IntStream.of(0,1,2,3,4,5,6,7,8,9,10);
        return intStreamRangeOf.sum();
    }

//Ninja Bonus
    public int getStreakGoalChange(int num){
        IntStream intStreamRangeOf = IntStream.of(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        return intStreamRangeOf.sum();
    }


}
