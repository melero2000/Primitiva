import java.util.Arrays;

public class Block {
	int[] numbers;

	public Block(int numNumbers) {
		if (numNumbers < 6) {
			numNumbers = 6;
		}
		if (numNumbers > 49) {
			numNumbers = 49;
		}

		numbers = new int[numNumbers];

		int rightNums = 0;

		while (rightNums < numNumbers) {

			int n = (int) (Math.random() * 49) + 1;
			
			boolean exists = false;
			int i = 0;
			while(i<rightNums && !exists) {
				if (n == numbers[i]) {
					exists = true;
				}
				i++;
			}
			if (!exists) {
				numbers[rightNums] = n;
				rightNums++;
			}
		}
		Arrays.sort(numbers);
	}

	public Block(int ... numbers) {
		this.numbers = new int[numbers.length];
		for ( int i = 0 ; i < numbers.length; i++) {
			this.numbers[i] = numbers[i];
		}
		Arrays.sort(this.numbers);
	}


	@Override
	public String toString() {
		String result = "" + numbers[0];
		for (int i = 1; i < numbers.length; i++) {
				result = result + "," + numbers[i];
		}
		return result;
	}

	public int[] getNumber() {
		return numbers;		
	}
}
