val list = List (5,3,1,2,4)  



def suma(a: Int,b: Int): Int = {
    a+b;
    }                                             //> suma5: (a: Int, b: Int)Int
    
    suma(2,1)    

//INSTANCIA DE MAP//
List(1,2,3).map(suma(2,_))                        //> res0: List[Int] = List(3, 4, 5)

// EVALUAR UNA LISTA DE ENTEROS CON FUNCIONES                                
def map (f: List[Int => Int], l: List[Int]) = {
 	if (l == Nil) l else{
     var dev: List[Any]=List()
     for(li <- l){
     var aux: List[Int]=List()
     for(fun <- f) aux = aux :+ fun(li)
     
     dev = dev :+ aux
     }
     dev
     }
    }                                             //> map: (f: List[Int => Int], l: List[Int])List[Any]
      
    map(List((_*2),(_+3)),list)
                                                  //> res0: List[Any] = List(List(10, 8), List(6, 6), List(2, 4), List(4, 5), List
                                                  //| (8, 7))

FUNCION DE ORDEN SUPERIOR//

//definicion funcion map //

def map (f: Int=>Int, l: List[Int]):List[Int] =
      if (l == Nil) l else f(l.head)::map(f,l.tail)
                                                  //> map: (f: Int => Int, l: List[Int])List[Int]
map(suma(_,3),list)                               //> res0: List[Int] = List(8, 6, 4, 5, 7)
    
