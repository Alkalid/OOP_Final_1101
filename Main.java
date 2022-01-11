public class Main {

	public static void main(String[] args) {
		int[] array = {60, 86, 34, 100, 57, 23};
		
		Score max = new Max(array);
		Score min = new Min(array);
		Score average = new Average(array);
		
		cal(max);
		cal(min);
		cal(average);
	}
	
	public static void cal(Score s) {
		s.calculate();
	}
}

abstract class Score {
	public int[] array;
	
	public Score() {
		
	}
	
	public Score(int[] array) {
		this.array = array;
	}
	
	abstract public void calculate();
}

class Max extends Score {
	public Max(int[] array) {
		super(array);
	}
	
	public void calculate() {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}
}

class Min extends Score {
	public Min(int[] array) {
		super(array);
	}
	
	public void calculate() {
		int min = 999999;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}
}

class Average extends Score {
	public Average(int[] array) {
		super(array);
	}
	
	public void calculate() {
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.println(total/array.length);
	}
}
