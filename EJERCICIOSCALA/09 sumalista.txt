val list = List (5,3,1,2,4)                       //> list  : List[Int] = List(5, 3, 1, 2, 4)

def sumlista(lis: List[Int]): Int = {
  lis match {
    case x :: tail => x + sumlista(tail)
    case Nil => 0  // si es vacio return 0
  }
}                                                 //> sumlista: (lis: List[Int])Int

sumlista(list)                                    //> res0: Int = 15


def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case n :: rest => n + sum(rest)
}                                                 //> sum: (list: List[Int])Int


def mult(list: List[Int]): Int = list match {
    case Nil => 1
    case n :: rest => n * mult(rest)
}                                                 //> mult: (list: List[Int])Int

mult(list)                                        //> res0: Int = 120
sum(list)                                         //> res1: Int = 15
