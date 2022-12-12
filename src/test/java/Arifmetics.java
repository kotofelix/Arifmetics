import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Arifmetics {
    public static void main(String[] args) {
        System.out.println("Привет");
        BigInteger num1 = new BigInteger("50");
        BigInteger num2 = new BigInteger("111");
        BigInteger resultPlus = num1.add(num2);
        BigInteger resultMinus = num1.subtract(num2);
        BigInteger resultUmnozheniya = num1.multiply(num2);
        BigInteger resultDelenia = num2.divide(num1);
        BigInteger resultOstatokOtDelenia = num2.remainder(num1);

        System.out.println("Сложение целых числел равно: " + resultPlus);
        System.out.println("Разница целых числел равна: " + resultMinus);
        System.out.println("Произведение целых числел равно: " + resultUmnozheniya);
        System.out.println("Деление целых числел равно: " + resultDelenia);
        System.out.println("Остаток от деления целых числел равен: " + resultOstatokOtDelenia);

        BigDecimal num3 = new BigDecimal("50.3");
        BigDecimal num4 = new BigDecimal("111.7");
        BigDecimal resultPlusDecimal = num3.add(num4);
        BigDecimal resultMinusDecimal = num3.subtract(num4);
        BigDecimal resultUmnozheniyaDecimal = num3.multiply(num4);
        BigDecimal resultDeleniaDecimal = num4.divide(num3, 9, RoundingMode.DOWN);
        BigDecimal resultOstatokOtDeleniaDecimal = num4.remainder(num3);

        System.out.println("Сложение дробных числел равно: " + resultPlusDecimal);
        System.out.println("Разница дробных числел равна: " + resultMinusDecimal);
        System.out.println("Умножение дробных числел равно: " + resultUmnozheniyaDecimal);
        System.out.println("Деление дробных числел равно: " + resultDeleniaDecimal);
        System.out.println("Остаток от деления дробных числел равен: " + resultOstatokOtDeleniaDecimal);


    }
}
