def suma3(a: Int, b: Int, c: Int) = {
  a+b+c
}                                                 //> suma3: (a: Int, b: Int, c: Int)Int

suma3(1, 3, 5) 
                                                  //> res0: Int = 9

def suma3curried(a: Int, b: Int) = {
  def temp(c: Int) = {
    suma3(a, b, c) // a y b los guarda y devuelve una funcion de un argumento  c
  }
  temp _
}   
                                              //> suma3curried: (a: Int, b: Int)Int => Int
val devf =suma3curried(1,2)                       //> devf  : Int => Int = espaciopracticas$$$Lambda$11/114132791@3498ed
devf(4)                                           //> res1: Int = 7


def suma3curried2(a: Double) = {
  def temp(c: Double, b: Double) = {
    suma3(a, b, c) // devuelve una funcion de 2 argumentos
  }
  temp _ 
}                                                 //> suma3curried: (a: Double)(Double, Double) => Double
val devf =suma3curried2(1)                        //> devf  : (Double, Double) => Double = espaciopracticas$$$Lambda$11/328638398@
                                                  //| 3d8c7aca
devf(4,5)                                         //> res1: Double = 10.0














