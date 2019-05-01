import java.util.Random;

/**
 * @Author: duanxu
 * @Date: 2019/5/1 16:45
 */
public class GuessGame {

    public void startGame(int playerNum){
        Random random = new Random();
        int numberToGuess = random.nextInt(10);
        Player[] p =new Player[playerNum];
        boolean isContinue = false;
        while (!isContinue){
            for (int i = 0;i<p.length;i++){
                p[i] = new Player();
                p[i].setIsRight(p[i].guess(numberToGuess));
                System.out.println("Player"+(i+1)+": I guess the number is:"+p[i].getNumber()+"\nSystem: You are "+p[i].isIsRight()+"\tThe real number is:"+numberToGuess);
                isContinue=isContinue||p[i].isIsRight();
            }
        }
    }
}
