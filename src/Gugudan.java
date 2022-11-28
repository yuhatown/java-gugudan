public class Gugudan {
	
	public static int[] calculate(int times, int number) {
		int[] result = new int[number];
		for(int i=0; i < number; i++) {
			result[i] = times * (i+1);
	}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);		
		}
	}
}
