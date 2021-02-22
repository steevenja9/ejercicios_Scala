def FiltoList[A](lista: List[A], pred: (A)=>Boolean): List[A] = {
	if (lista.isEmpty) Nil
    else if (pred (lista.head)) lista.head :: FiltoList(lista.tail, pred)
	else FiltoList(lista.tail, pred)
}                                                 //> FiltoList: [A](lista: List[A], pred: A => Boolean)List[A]

def par(x: Int) = x % 2 == 0                      //> par: (x: Int)Boolean

FiltoList(List(1,2,3,4), par)                     //> res1: List[Int] = List(2, 4)

