 Es lo mas parecido a un ejemplo complejo que utiliza ambos tipos de coincidencia de patrones
 
 def funcionLista(list : List[Any]) = list match {

	 case Nil => "(none)"	
         case head :: Nil => "Coincide sólo con un elemento"
         case x :: y :: Nil => "coincide solo con dos elementos"
         case "Lili" :: tail => "Empareja el caso que comienza con Lili"
         case head :: tail => "El caso de hacer coincidir varios elementos"
         case _ => "Otras situaciones"
}


  def funcionLista(p: List[Any],list : List[Any]) = list match {
         case Nil => "(none)" 
	 case head => list.head 	
	 case tail => list.tail
	 case _ => ""+list.head+", "+list.tail.head 
}

