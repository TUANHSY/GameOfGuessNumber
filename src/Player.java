import java.util.Random;

/**
 * @Author: duanxu
 * @Date: 2019/5/1 16:47
 */
public class Player {
    Random random  = new Random();
    private int number = random.nextInt(10);
    private boolean isRight;

    public boolean guess(int numberToGuess){
        if (this.number == numberToGuess){
            isRight=true;
        }else {
            isRight=false;
        }
        return isRight;
    }

    public void setIsRight(boolean isRight) {
        this.isRight = isRight;
    }

    public int getNumber() {
        return number;
    }

    public boolean isIsRight() {
        return isRight;
    }
}
