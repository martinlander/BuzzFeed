/**
 * Created by mlander1 on 27.10.2016.
 */
def BF = []
for(j=0;j<=99;j++) {
       BF[j] = j+1
    if ((BF[j] % 15) == 0) {
        BF[j] = "FizzBuzz"
    } else if ((BF[j] % 5) == 0) {
        BF[j] = "Fizz"
    } else if ((BF[j]) % 3 == 0) {
        BF[j] = "Buzz"
    }
}
println  BF

