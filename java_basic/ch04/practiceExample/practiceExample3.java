package ch04.practiceExample;
/**
 * for 문을 이용
 * 1부터 100까지의 정수 중에서 3의 배수의 총합 구하기
 * **/
public class practiceExample3 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            count++;
        }
        System.out.println("1~" + count + " 까지의 3의 배수의 총합 : " + sum );
    }
}
