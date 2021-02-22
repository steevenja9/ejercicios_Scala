def suma(a: Double, b: Double) = {
  a+b
}
   
/******con currying*******/ devuelve una funcion anonima con un argumento
def suma2(x:Double)=(y:Double) => x + y           //> suma2: (x: Double)Double => Double

val rest=suma2(1)                                 //> rest  : Double => Double = espaciopracticas$$$Lambda$11/114132791@3498ed
rest(3)                                          //> res0: Double = 4.0

suma2(2)(3)                                           //> res0: Double = 5.0

Esta forma se llama curry . Currying nos permite convertir una función que espera dos argumentos en una función que espera solo uno.
def suma2(x:Double)(y:Double) = x + y  
