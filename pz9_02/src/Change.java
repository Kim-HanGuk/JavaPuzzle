import java.math.BigDecimal;

public class Change {
    public static void main(String[] args) {
        System.out.println(2.00 - 1.10);

        // 0.9 가 출력되지 않음
        // 1.10 은 1.1과 가장 근접한 double
        System.out.printf("%.2f%n", 2.00 - 1.10); // 부동소수점 연산으로 반올림이 되어 출력되는 값

        // 자바 '이진 부동소수점 연산' -> 계산이 빠르지만 오류


        // 풀이
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
    }
}
