// class Solution {
//     public double myPow(double x, int n) {
//         if (n == 0) return 1;

//         if (n < 0) {
//             x = 1 / x;
//             n = -n;
//         }

//         return fastPow(x, n);
//     }

//     private double fastPow(double x, int n) {
//         if (n == 0) return 1;

//         double half = fastPow(x, n / 2);

//         if (n % 2 == 0)
//             return half * half;
//         else
//             return half * half * x;
//     }
// }
class Solution {
    public double myPow(double x, int n) {
        long pow = n ;// due to if n = -2147483648 its positive will go out of int range;
        double ans = 1;

        if(pow<0){
            x = 1/x;
            pow = -1*pow;
        }

        while(pow>0){
            if(pow%2==1){
                ans = ans * x;
                x = x * x;
            }else{
                x = x * x;
            }
            pow = pow / 2;
        }
        return ans;
    }
}