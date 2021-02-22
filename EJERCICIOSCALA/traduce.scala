
  def traduce(x: Double): String = {  
   x match {
  case 1 => "A"
  case 2 => "B"
  case 3 => "C"
  case 4 => "A"
  case _ => "X"
  }
}                                                 //> traduce: (x: Double)String

traduce(b)                                        //> res4: String = A
