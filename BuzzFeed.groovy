/**
 * Created by mlander1 on 27.10.2016.
 */
def BF = []
for(i=0;i<=99;i++){
    BF[i] = i+1
}
for(j=0;j<=99;j++) {
    if ((BF.getAt(j) % 15) == 0) {
        BF[j] = "Buzzfeed"
    } else if ((BF.getAt(j) % 5) == 0) {
        BF[j] = "Feed"
    } else if ((BF.getAt(j)) % 3 == 0) {
        BF[j] = "Buzz"
    }
}
println  BF

