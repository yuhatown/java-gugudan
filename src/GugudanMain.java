import java.util.Scanner;

public class GugudanMain {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int[] result = Gugudan.calculate(first, second);
		Gugudan.print(result);
		
	}

}
