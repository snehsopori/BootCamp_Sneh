public class MovieService {
    public boolean watch(User user) throws InvalidInputException, LowRatingException {
        int age = user.getAge();
        int rating = user.getRating();

        if (age < 0) {
            throw new InvalidInputException("Invalid age");
        }
        if (age < 10) {
            throw new InvalidInputException("You are a baby. Go home and play.");
        }
        if (age < 20) {
            throw new InvalidInputException("You are not an adult");
        }
        if (rating < 3) {
            throw new LowRatingException("You are not a good customer. Bye");
        }
        System.out.println("You are allowed to watch the movie");
        return true;
    }

    public void buy(User user, double price) throws InvalidInputException, PriceLowException, LowRatingException {
        if (watch(user)) {
            if (price < 0.0) {
                throw new InvalidInputException("Invalid price");
            }
            if (price < 2000.0) {
                throw new PriceLowException("Price is lower than 2000. Pay up else goodbye.");
            }
            System.out.println("Enjoy your movie and popcorn");
        }
    }
}