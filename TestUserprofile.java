import java.util.Scanner;
/**
 *
 * @author Ben Praseuth
 */
import java.util.Scanner;

public class TestUserprofile {
    private String name;
    private String genre;

    public TestUserprofile(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void createProfile() {
        System.out.println("User profile created for " + name + " with favorite genre " + genre + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to UserProfile Creator!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String[] genres = {"Action", "Comedy", "Drama", "Horror", "Romance", "Sci-Fi"};
        System.out.println("Choose your favorite genre from the following list:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        System.out.print("Enter the number of your favorite genre: ");
        int genreChoice = scanner.nextInt();
        while (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice. Please try again.");
            System.out.print("Enter the number of your favorite genre: ");
            genreChoice = scanner.nextInt();
        }
        String favoriteGenre = genres[genreChoice - 1];
        TestUserProfile userProfile = new TestUserProfile(name, favoriteGenre);
        userProfile.createProfile();
    }
}
