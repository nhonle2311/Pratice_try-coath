public class Main {
    public static void main(String[] args) {
        User user[] = new User[3];
        System.out.println("Q");
        System.out.println("Q");
        System.out.println("flash chạy");

        try {
            System.out.println(user[2].getName());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println("lên bản đếm số");
    }
}