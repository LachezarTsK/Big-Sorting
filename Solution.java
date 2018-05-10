import java.util.*;
import java.math.*;

public class Streamlined_BigSorting {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int numberOfStrings = reader.nextInt();
		List<String> numbers = new ArrayList<String>();
		for (int i = 0; i < numberOfStrings; i++) {
			String nextString = reader.next();
			numbers.add(nextString);

		}
		ComparingStrings comMethod = new ComparingStrings();
		Collections.sort(numbers, comMethod);
		for (int i = 0; i < numberOfStrings; i++) {
			System.out.println(numbers.get(i));
		}

	}

}

class ComparingStrings implements Comparator<String> {

	@Override
	public int compare(String stringOne, String stringTwo) {

		if (stringOne.length() < stringTwo.length()) {
			return -1;
		}
		if (stringOne.length() > stringTwo.length()) {
			return 1;
		}
		for (int i = 0; i < stringOne.length(); i++) {
			if ((int) stringOne.charAt(i) < (int) stringTwo.charAt(i)) {
				return -1;
			}
			if ((int) stringOne.charAt(i) > (int) stringTwo.charAt(i)) {
				return 1;
			}
		}
		return 0;
	}
}
