public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int expected = 150;
        int amount = 5_000;
        boolean isRegistered = true;

        int actual = (int) service.calculate(amount, isRegistered);
        System.out.println(expected + " == ? == " + actual);
    }
}