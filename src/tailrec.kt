import java.math.BigInteger

//Tailrec function uses recursion in an Optimized way than any other oop language
//tailrec executes a recursion function internally, without affecting the stack memory, therefore,
//preventing program crash for very long recursive operations

fun main(){
    println(getFibonacciNumber(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger{
    if(n == 0)
        return b
    else
        return getFibonacciNumber(n-1, a+b, a)

}