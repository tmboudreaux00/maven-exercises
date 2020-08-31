import com.google.common.math.DoubleMath;

public class GuavaTesting {
    public static void main(String[] args) {
        double num = Math.PI;
        double num2 = 7.1;
        System.out.println(DoubleMath.isMathematicalInteger(num));
        System.out.println(DoubleMath.isMathematicalInteger(num2));
    }
}
