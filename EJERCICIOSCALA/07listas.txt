
        // Crear lista
        val list = List(1, 2, 3, 4, 5, 6, 7) 	

	 // aplicar metodo take
        val result = list.take(4) // gracias a la evaluacion perezosa 
				  // solo genera los 4 primeros elementos de la lista

          
	// añadir un elementos al principio de la lista */
	scala> val l3 = 4 :: l2
	l3: List[Int] = List(4, 1, 2, 3)
	
	/+ concatenar listas */
	List = List :+ List2

	/* añadir n elementos a la lista */
	scala> List.fill(3)("foo")
	res1: List[String] = List(foo, foo, foo)


	/*recorrer lista*/
	var i=0
	for(x <- lista){
	i +=1;
	}


def mayor(x: Double) = x >2                       //> mayor: (x: Double)Boolean


mayor(5)                                          //> res1: Boolean = true



val list3 = List.fill(10)(0)                      //> list3  : List[Int] = List(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

list map (a => a + 1) foreach { a => print(" " + a) }
                             
scala> val p = (1 to 20).toList
p: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
scala> for (k <- p if k % 3 == 0) yield("<" + k + ">")
res12: List[String] = List(<3>, <6>, <9>, <12>, <15>, <18>) 
