import java.util.Scanner;
public class UC6 {
	public static final int Winning = 100;
	public static void main(String[] args) {
		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String Name = s.next();
		int Position = 0;
		int DiceCount = 0;
		System.out.println("Player name is: " + Name);
		while ( Winning > Position ) {
		int Dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			System.out.println(Dice);
		DiceCount++;
			System.out.println(DiceCount);
		int remaining = Winning - Position;
			System.out.println(remaining);
		int number = (int) (Math.floor(Math.random() * 10) % 3);
			System.out.println(number);
		if( remaining >= Dice ) {
		switch (number) {
			case 0:
				Position = Position + 0;
				break;
			case 1:
				Position = Position + Dice;
				break;
			default:
				Position = Position - Dice;
				if (Position < 0)
					Position = 0;
		} 
		} 
		System.out.println("Player position is : " + Position);
		} 
		//System.out.println("Dice rolled " + DiceCount + " times.");
	}
}
