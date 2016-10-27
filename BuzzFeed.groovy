/**
 * Created by mlander1 on 27.10.2016.
 */
def FB = []
for(j=0;j<=99;j++) {
       FB[j] = j+1
    if ((FB[j] % 15) == 0) {
        FB[j] = "FizzBuzz"
    } else if ((FB[j] % 5) == 0) {
        FB[j] = "Fizz"
    } else if ((FB[j]) % 3 == 0) {
        FB[j] = "Buzz"
    }
}
println  FB

