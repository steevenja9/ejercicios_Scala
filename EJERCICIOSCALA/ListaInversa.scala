def ListaInversa(list: List[Int]): List[Int] = list match {
 case Nil => Nil
 case head :: tail => ListaInversa(tail) :+ head
 }

