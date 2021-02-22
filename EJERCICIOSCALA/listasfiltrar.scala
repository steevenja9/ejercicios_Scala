def miFilter[A](lista: List[A], pred: (A)=>Boolean): List[A] = {
	if (lista.isEmpty) Nil
    else if (pred (lista.head)) lista.head :: miFilter(lista.tail, pred)
	else miFilter(lista.tail, pred)
}                                                 //> miFilter: [A](lista: List[A], pred: A => Boolean)List[A]

def par(x: Int) = x % 2 == 0                      //> par: (x: Int)Boolean

miFilter(List(1,2,3,4), par)                      //> res0: List[Int] = List(2, 4)