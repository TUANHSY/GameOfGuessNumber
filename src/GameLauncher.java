import java.util.Scanner;

/**
 * @Author: duanxu
 * @Date: 2019/5/1 16:48
 */
public class GameLauncher {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many players:");
        int playerNum  = in.nextInt();

        GuessGame game = new GuessGame();
        game.startGame(playerNum);
    }
}
