public class PerfectSquare {

    public static boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(Integer.MAX_VALUE / 100));
        System.out.println(isPerfectSquare(255));
    }
}
