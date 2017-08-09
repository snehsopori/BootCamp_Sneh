public class Cinema {
    public static void main(String[] args) {
        MovieService ms = new MovieService();
        User user1 = new User(40, "Prince1", 30, 4);
        User user2 = new User(41, "Prince2", -4, 4);
        User user3 = new User(42, "Prince3", 4, 4);
        User user4 = new User(43, "Prince4", 0, 4);
        User user5 = new User(44, "Prince5", 14, 4);
        User user6 = new User(45, "Prince6", 28, 1);
        User user7 = new User(46, "Prince7", 40, 2);

        try {
            ms.buy(user1, 20011.0);
//            ms.buy(user1, 200.0);
            ms.buy(user2, 20011.0);
//            ms.buy(user3, 20011.0);
//            ms.buy(user4, 20011.0);
//            ms.buy(user5, 20011.0);
//            ms.buy(user1, -11.0);
//            ms.buy(user6, 20011.0);
//            ms.buy(user7, 20011.0);
        } catch(InvalidInputException e){
            System.out.println(e.getMessage());
        } catch(LowRatingException e){
            System.out.println(e.getMessage());
        } catch(PriceLowException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}