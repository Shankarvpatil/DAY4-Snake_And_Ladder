import java.util.Scanner;
public class UC4_Winning_Position_Hundred {
	public static final int Winning = 100;
	public static void main(String[] args) {
		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String Name = s.next();
		int Position = 0;
		System.out.println("Player name: " + Name);
		
		while ( Winning > Position ) {
		int Dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println(Dice);
		
		int number = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println(number);
		switch (number) {
			case 0:
				System.out.println("No play : "+ 0);
				Position = Position + 0;
				break;
			case 1:
				System.out.println("Ladder  : "+ Dice);
				Position = Position + Dice;
				break;
			default:
				System.out.println("Snake   : "+ Dice);
				Position = Position - Dice;
				if (Position < 0)
					Position = 0;
		}
		}
		System.out.println("Player position is : " + Position);
	}
}
