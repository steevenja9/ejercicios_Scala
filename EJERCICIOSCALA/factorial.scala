def factorial(n: BigInt): BigInt = {  
        var f = 1
        for(i <- 1 to n)
        {
            f = f * i;
        }
        return f
    }                                             //> factorial: (n: BigInt)BigInt
    factorial(5)                                 //> res4: Int = 120

/***con recursividad******/
 def factorial(n: BigInt): BigInt =
    { 
        if (n == 0)  
            return 1
        else
            return n * factorial(n-1) 
    } 
  
