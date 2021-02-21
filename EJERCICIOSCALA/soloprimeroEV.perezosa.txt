EVAULACION PEREZOSA

def soloprimero(x:Any, y: => Any) =  {
println(x)
}                                                 //> solo: (x: Any, y: => Any)Unit
soloprimero(2,7/0)                                //> 2


//SIN EVALAUCION PEREZOSA DA error al al dividir 7/0 //
def soloprimero(x:Any, y: Any) =  {
println(x)
}                                                 //> soloprimero: (x: Any, y: Any)Unit
soloprimero(2,7/0)                                //> java.lang.ArithmeticException: / by zero
                                                  //| 	at espaciopracticas$.$anonfun$main$1(espaciopracticas.scala:19)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at espaciopracticas$.main(espaciopracticas.scala:1)
                                                  //| 	at espaciopracticas.main(espaciopracticas.scala)

//OTRO EJEMPLO LO ENTIENDO MEJOR ASI // 
def mul(x:Double ,y: Double) = x*x                //> mul: (x: Double, y:Double)Double

//DENTRO DE ESCALA 
mul(5,5+2)   //> NO EVALUA EL SEGUNDO PARAMETRO            //> res0: Double = 25.0
5*5
25

SIN EVAULACION PEREZOSA
mul(5,7)                                       //> EVALUIA Y HACE LA SUMA DEL 5+2
5*5
25


