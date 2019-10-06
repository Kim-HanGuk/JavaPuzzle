public class LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        // 풀이 MICROS_PER_DAY 의 오버플로
        // int 끼리 곱셈
        // 타깃 타이핑
//        final long MICROS_LONG = 24L * 60L * 60L * 1000L * 1000L;
        final long MICROS_LONG = 24L * 60 * 60 * 1000 * 1000;
        System.out.println(MICROS_LONG / MILLIS_PER_DAY);
    }
}
