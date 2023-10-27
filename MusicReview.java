import java.util.Scanner;

class MusicReview {
	public static void main(String[] args) {
		String myName = "Roberto Rodriguez"; 
		System.out.println("Hi, my name is " + myName + ".");

		// Q1
		String songName = "Get Ready";
		String artistName = "Rare Earth";

		System.out.println("I love listening to " + songName + " by " + artistName + ".");

		// Q2
		int releaseYear = 1967;
		int timesPlayed = 37;
		double vinylPrice = 22.99;
		char songTier =  'A';

		System.out.println("The song was released in year " + releaseYear + ".");
		System.out.println("On Spotify, the song has been played " + timesPlayed + " times.");
		System.out.println("A vinyl copy might sell for $" + vinylPrice + "!");
		System.out.println("Overall, this artist's songs should be considered " + songTier + " tier.");

		// Q3
		System.out.println("\nThree questions to determine if I will go to the next concert...");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Is the next concert expensive? (type true or false): ");
		boolean isExpensive = scanner.nextBoolean();

		System.out.print("Will the concert be worth it? (type true or false): ");
		boolean worthIt = scanner.nextBoolean();

		System.out.print("Are my friends going to the concert? (type true or false): ");
		boolean areFriendsGoing = scanner.nextBoolean();

		boolean willAttendConcertResult = (!isExpensive || worthIt) && areFriendsGoing;

		System.out.println("Will I go to the next concert? The answer is " + willAttendConcertResult + ".\n");
		

		// Q4
		timesPlayed = timesPlayed+1;
		System.out.println("Oops, I just played the song again! Make that " + timesPlayed + " times.");
	}
}

//I deleted the comments because it seemed very cluttered