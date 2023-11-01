package w2Assignment3;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class DuplicateNumberException extends RuntimeException {

	public DuplicateNumberException() {
	}
	public DuplicateNumberException(String Message) {
		super(Message);
	}

}
public class A5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> nSet = new HashSet<>();

		while (true) {
			System.out.print("Enter an integer or 'c' to close: ");
			String input = sc.nextLine();

			if (input.equalsIgnoreCase("c")) {
				break;
			}

			try {
				int number = Integer.parseInt(input);
				if (!nSet.add(number)) {
					throw new DuplicateNumberException();
				}
			} catch (DuplicateNumberException e) {
				System.err.println("Error: Duplicate no found: "+Integer.parseInt(input));

			}
			if (Integer.parseInt(input)==6) {
	            System.out.println("No duplicate numbers!");
	            break;
	        }
		}
		
	}
}