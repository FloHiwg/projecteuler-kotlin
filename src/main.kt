import java.util.*

fun main() {
    //println(sumOfMultOfThreeAndFive())
    //print(palindrome())
    //print(smallestDevidableByOneToTwenty())
    print(differenceSumPowerAndPowerSum())
}

fun palindrome(): Int {
    var highest: Int = 0
    for(factor1 in 100..999) {
        loop@for(factor2 in 100..999){
            var currentProd: Int = factor1 * factor2;
            var currentProdStr: String = currentProd.toString()
            if(currentProdStr.length % 2 != 0){
                continue@loop
            }

            for(l in 0..(currentProdStr.length/2-1)){
                if(currentProdStr.get(l) != currentProdStr.get(currentProdStr.length-1-l))
                    continue@loop
            }
            if(currentProd > highest)
                highest = currentProd
        }
    }
    return highest;
}

fun sumOfMultOfThreeAndFive(): Int {
    var result: Int = 0

    for(i in 1..(1000-1))
        if((i % 3) == 0 || (i % 5) == 0)
            result += i
    return result;
}

fun smallestDevidableByOneToTwenty(): Int {
    var i:Int = 1;
    loop@while(true) {
        for(j in 1..20)
            if(i % j != 0) {
                i++
                continue@loop
            }
        return i;
    }
}

fun differenceSumPowerAndPowerSum(): Int {
    var sumPower: Int = 0
    var powerSum: Int = 0
    var sum: Int = 0

    for(i in 1..100) {
        powerSum+=i
        sumPower+=(i*i)
    }

    return powerSum*powerSum-sumPower
}