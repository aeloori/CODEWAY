//imports
import java.lang.Math;

public class RandomNumbers {

    public int randomGen(int range){
        int randNo=(int)(Math.random()*range)+1;
        return randNo;
    }
    
}
