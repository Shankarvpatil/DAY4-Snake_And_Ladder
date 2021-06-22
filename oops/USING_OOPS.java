import java.util.Scanner;
public class UC3_NOPlay_Ladder_Snake {
	public static void main(String[] args) {
		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String Name = s.next();
		int Position = 0;
		System.out.println("Player name is: " + Name);
		int Dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + Dice);
		
		int number = (int) (Math.floor(Math.random() * 10) % 3);
		switch (number) {
			case 0:
				System.out.println("No play");
				Position += 0;
				break;
			case 1:
				System.out.println("Ladder");
				Position += Dice;
				break;
			default:
				System.out.println("Snake");
				Position -= Dice;
				if (Position < 0)
					Position = 0;		
		}
		System.out.println("Player position is: " + Position);
	}
}
