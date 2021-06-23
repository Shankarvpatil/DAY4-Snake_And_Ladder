import java.util.Scanner;
public class UC7_Which_Player_Won {
    public static final int Winning = 100;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first player name : ");
        String Player1Name = s.next();
        System.out.print("Enter second player name : ");
        String Player2Name = s.next();
        int player1Pos = 0;
        int player2Pos = 0;

        while (player1Pos <= Winning && player2Pos <= Winning) {
            if (player1Pos == Winning) {
                System.out.println(Player1Name + " is winner");
                break;
            } else if (player2Pos == Winning) {
                System.out.println(Player2Name + " is winner");
                break;
            } else {
                player1Pos = player1(player1Pos, Player1Name);
                player2Pos = player2(player2Pos, Player2Name);
            }
        }
    }

    private static int player1(int player1Position, String Player1Name) {
        int Dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int remaining = Winning - player1Position;
        int number = (int) (Math.floor(Math.random() * 10) % 3);
        if (remaining >= Dice) {
            switch (number) {
                case 0:
                    break;
                case 1:
                    player1Position += Dice;
                    if (player1Position == Winning)
                        break;
                    else
                        player1(player1Position, Player1Name);
                    break;
                default:
                    player1Position -= Dice;
                    if (player1Position < 0)
                        player1Position = 0;
            }
            System.out.println( Player1Name + " position: " + player1Position);
        }
        return player1Position;
    }

    private static int player2(int player2Position, String Player2Name) {
        int Dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
        int remaining = Winning - player2Position;
        int number = (int) (Math.floor(Math.random() * 10) % 3);
        if (remaining >= Dice) {
            switch (number) {
                case 0:
                    break;
                case 1:
                    player2Position += Dice;
                    if (player2Position == Winning)
                        break;
                    else
                        player2(player2Position, Player2Name);
                    break;
                default:
                    player2Position -= Dice;
                    if (player2Position < 0)
                        player2Position = 0;
            }
        }
        System.out.println(Player2Name + " position: " + player2Position);
        return player2Position;
    }

}
