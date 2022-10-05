package Java_Basics.eg.Basic_algorithms_and_methods;
//基本算法与方法的使用

//Java讲义01-3（实训一 方法定义）---->算法

public class example {
    public static void main(String[] args) {

        System.out.println(aaccumulation1(10));

        System.out.println(Denominatoraccumulation1(10));

        System.out.println(aaccumulation2(10));

        System.out.println(Denominatoraccumulation2(10));

        System.out.println(aaccumulation3(10));

        System.out.println(Factorial(10));

        System.out.println(Factorialandcumulative1(10));

        System.out.println(Factorialandcumulative2(10));

        System.out.println(Power(10,2));

        System.out.println(Cumulativepowerfactorial1(10,2));

        System.out.println(Cumulativepowerfactorial2(10,2));

        System.out.println(Denominatordifference1(10));

        System.out.println(Denominatordifference2(10));
    }

    // 1 求 1 + 2 + 3 + … + n

    public static int aaccumulation1(int n){
        int Sum = 0;
        for (int i=1;i <= n;i++){
            Sum += i;
        }
        return Sum;
    }

    // 2 求 1 + 1/2 + 1/3 + ... + 1/n

    public static int Denominatoraccumulation1(int n){
        int Sum = 0;
        for (int i=1;i <= n;i++){
            Sum += 1/i;
        }
        return Sum;
    }

    // 3 求 1 – 2 + 3 – 4 + … + n

    public static double aaccumulation2(int n){
        double Sum = 0;
        for (int i=1;i <= n;i++){
            //Sum += i;
            if (i % 2 == 0){
                Sum -= i;
            }else {
                Sum += i;
            }
        }
        return Sum;
    }

    // 4 求 1 - 1/3 + 1/5 - 1/7 + … + 1/2n-1

    public static double Denominatoraccumulation2(int n){
        double Sum = 0;
        for (int i = 1;i <= n++;i++){
            Sum += 1/(2*i-1);
            if (i % 2 ==0){
                Sum -= 1/(2*i-1);
            }else {
                Sum += 1/(2*i-1);
            }
        }
        return Sum;
    }

    // 5 求 1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+3+...+n)

    public static double aaccumulation3(int n){
        double Sum = 0.0,sum = 0;
        for (int i=1;i <= n;i++){
            sum += i;
            Sum += 1/sum;
        }
        return Sum;
    }

    // 6 求 n! = 1*2*3...*n

    public static int Factorial(int n){
        int Sum = 1;
        for (int i = 1;i <= n;i++){
            Sum *= i;
        }
        return Sum;
    }

    // 7 求 1 + 2! + 3! + … + n!

    public static int Factorialandcumulative1(int n){
        int Sum = 0,sum = 1;
        for (int i = 1;i < n;i++){
            sum *= i;
            Sum +=sum;
        }
        return Sum;
    }

    // 8 求 1 + 1/2！+ 1/3！+ ... + 1/n!

    public static double Factorialandcumulative2(int n){
        double Sum = 0,sum = 1;
        for (int i = 1;i < n;i++){
            sum *= i;
            Sum += 1/sum;
        }
        return Sum;
    }

    // 9 求 x的n次方

    public static int Power(int x , int n){
        for (int i = 1;i <= n;i++){
            x *= x;
        }
        return x;
    }

    // 10 求1 + x + (x的2次方)/2! + (x的3次方)/3! +...+(x的n次方)/n!

    public static double Cumulativepowerfactorial1(int n , int x){
        double Sum = 1,sum1 = 1,sum2 = 1;
        for (int i = 2;i <= n;i++){
            sum1 = (x *=(i-1));
            sum2 *= (i-1);
            Sum += sum1/sum2;
        }
        return Sum;
    }

    // 11 求 1 + x - (3x的2次方)/2! + (5x的3次方)/! - (7x的4次方)/4! + {[(-1)的n-1次方]*[(2n-1)*x的n次方]/n!}

    public static double Cumulativepowerfactorial2(int n , int x){
        double Sum = 1,sum1 = 1,sum2 = 1,p = 1,sgin = 1;
        for (int i = 1;i <= n;i++){
            p *= x;
            sum1 +=(2*i-1)*p;
            sum2 *= i;
            Sum += sum1/sum2*(sgin *= -1);
        }
        return Sum;
    }

    // 12 求(1 - 1/2) + (1/3 - 1/4) +...+ (1/(2n-1) - 1/2n)

    public static double Denominatordifference1(int n){
        double Sum = 0;
        for (int i = 1;i <= 2*n-1;i++){
            Sum += (1/(2*i-1) - 1/(2*i));
        }
        return Sum;
    }

    // 13 求{[(1*3)]/2的2次方} - {[(3*5)]/4的2次方} + {[(5*7)]/6的2次方} -...+(-1)的n-1次方 * {[(2*n-1)*(2*n+1)]/(2*n)的2次方}

    public static double Denominatordifference2(int n){
        double Sum = 0,sum1=0,sum2=0;
        int sign = -1;
        for (int i = 1;i <= 2*n-1;i++){
            sum1 = (2*n-1)*(2*n+1);
            sum2 = Math.sqrt(2*n);
            Sum += sum1/sum2*(sign *= -1);
        }
        return Sum;
    }
}

