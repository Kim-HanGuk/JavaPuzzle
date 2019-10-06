public class Puzzle01 {
    public static void main(String[] args) {
        /// 풀이

        /// 일반
        System.out.format("%s is odd : %s%n", 10, isOdd(10));
        System.out.format("%s is odd : %s%n", 9, isOdd(9));

        /// 음수일때?
        System.out.format("%s is odd : %s%n", -10, isOdd(-10));
        System.out.format("%s is odd : %s%n", -9, isOdd(-9));

        /// 연산자 우선 순위?

        /// 0 일때?
        System.out.format("%s is odd : %s%n", 0, isOdd(0));


        /// 해설
        /// 정수를 나눌 때 버림을 수행  (a/b)*b + (a%b) == a
        /// 나머지 연산의 결과는 0이 아닌 값을 반환할 때는 항상 왼쪽 피연산자의 부호와 동일

        System.out.printf("3 %% 2 = %d %n", 3 % 2);
        System.out.printf("3 %% -2 = %d %n", 3 % -2);
        System.out.printf("-3 %% 2 = %d %n", -3 % 2);
        System.out.printf("-3 %% -2 = %d %n", -3 % -2);
    }

    public static boolean isOdd(int i) {
        // 문제
//        return i % 2 == 1;
        // 풀이
        return i % 2 != 0;
        // 다른 풀이
//        return (i & 1) != 0;
    }
}
