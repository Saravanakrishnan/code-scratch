import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Scratch {
	public static void main(String[] args) throws Exception {
		List<String> names = Arrays.asList("Rita", "Gita", "Nita", "Ritesh", "Nitesh", "Ganesh", "Yogen", "Prateema");

		final String startingLetter = "R";

		Optional<String> luckyName = names
				.stream()
				.filter(name -> name.startsWith(startingLetter))
				.findFirst();

		System.out.println(luckyName.orElseThrow(() -> new Exception("There is no name starting with letter.")));

		final String startingLetter1 = "Z";

		luckyName = names
				.stream()
				.filter(name -> name.startsWith(startingLetter1))
				.findFirst();

		System.out.println(luckyName.orElse("NA"));

	}
}
