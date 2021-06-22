public class UC2_Random_Six_die {
	public static void main(String[] args) {
		int Position = 0;
		int Dice = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + Dice);		
	}
}

