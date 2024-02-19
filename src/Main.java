public class Main {
    public static void main(String[] args) {

        User mySelf = User.getInstance();
        User user1 = User.getInstance();

        mySelf.printInformation();

        user1.setName("Luca Toni");
        user1.setAge(46);

        user1.printInformation();

    }
}