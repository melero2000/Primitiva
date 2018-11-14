
public class Ticket {

	private Block blocks[];

	public Ticket(int number) {
		blocks = new Block[number];
		for (int i = 0; i < number; i++) {
			blocks[i] = new Block(6);
		}
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < blocks.length ; i++) {
			s = s + blocks[i] + "\n";
		}
		return s;
	}
	
	public String printUsedNumbers() {
		String s = "";
		int[] numbers;
		for (int i = 0; i < blocks.length; i++ ) {
			numbers = blocks[i].getNumber();
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == )
				
			}

		}
	}
}
