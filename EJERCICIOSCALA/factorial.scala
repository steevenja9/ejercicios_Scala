def factorial(n: Int): Int = {  
        var f = 1
        for(i <- 1 to n)
        {
            f = f * i;
        }
        return f
    }                                             //> factorial: (n: Int)Int
    factorial(5)                                 //> res4: Int = 120

/***con recursividad******/
 def factorial(n: Int): Int =
    { 
        if (n == 0)  
            return 1
        else
            return n * factorial(n-1) 
    } 
  
