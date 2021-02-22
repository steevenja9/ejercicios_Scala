# DOCUMENTACION SCALA 

<b>0.INTRODUCCIÓN</b> <br> <br>
Scala como lenguaje de programación es multi-paradigma y fue diseñado para expresar patrones comunes de programación de forma concisa, elegante y con tipos seguros. Teniendo características de lenguajes funcionales y orientados a objetos(OOP). Scala se ejecuta sobre la maquina virtual de java, con lo cual permite la unión con java. Esto es fantastico porque se puede programar en Java y Scala al mismo tiempo.
Algunas de las caracteristicas que definen Scala son:
<ul>

<li>Un punto fuerte es la escalabilidad que tiene, permitiendo crear tus propios frameworks y estructuras.</li>
<li>Su fuerte tipado estatico fuerza las abstracciones a usarse de forma coherente y segura. Esto detecta y evita muchos errores en compilación.</li>
<li>Tiene una gran productividad ya que ayuda a reducir el tamaño de código fuente en un gran porcentaje comparado con Java.</li>
<li>El ser un lenguaje funcional hace que la computación pueda distribuirse en servidores Data Center, con lo cual lo hace muy util para Big Data.</li>
<li>Es extensible, hace muy facil el uso de nuevas librerias.</li>

</ul> <br>

## 1.DEFINICIÓN DE FUNCIONES.</br>
<img src="imagenes/funciones.png" width="400">

Para definir una función se usa "def" y el nombre de la función. La declaración es muy similar a los lenguajes orientado a objetos ya que los parametros se colocan entre parentesis con su tipo. El operador ":" sirve para especificar dicho tipo, tanto de variables como de la propia función.

	def functionName ([tipos]) : [return tipos] = {
	   function body
	   return [expr]
	}



## 2.PRIORIDAD DE OPERADORES Y TIPOS.<br>

<img src="imagenes/Prioridad_tipos.png" width="800" height="500">

<img src="imagenes/prioridadOperadores.png" width="900" height="500">

##  3.EVALUACIÓN PEREZOSA <br>
La evaluación perezosa, tambien llamada lazy evaluation o call-by-need, permite que un bloque de código sea evaluado sólo cuando se necesite, esto nos permite realizar código que tiene un rendimiento superior en ciertas situaciones
En scala, se utilizan los lazy val, que solo se evaluan cuando se utilizan por primera vez. <br>
<img src="imagenes/lazyval.png" width="250" align="left" > <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>


Las funciones tambien pueden declarar parametros de Evaluacion perezosa<br>
EJ: Y: => Any <br>


<b>EJERCICIO DE CLASE HASKELL</b> <br>

	SoloPrimero::a->b->a
	soloPrimero x _ = x

<b>SCALA</b> <br>

	def soloprimero(x:Any, y: => Any) =  { 
	println(x)  
	} 
	soloprimero(2,7/0)                               //> res0: Int = 2  

--Sin definir el parametro como perezoso este hace la operacion 7/0 Y DARIA ERROR <br>

<b> Otro ejemplo para entenderlo mejor </b>
 
	def mul(x:Double ,y: => Double) = x*x               

<b>Dentro de scala</b> <br>

	mul(5,5+2)   //> NO EVALUA EL SEGUNDO PARAMETRO            //> res0: Double = 25.0
	5*5
	25

SIN EVAULACION PEREZOSA <br>

	mul(5,5+2)                                       //> EVALUA Y HACE LA SUMA DEL 5+2 
	mul(5,7)
	5*5
	25



## 4.FUNCIONES DE ORDEN SUPERIOR</br>
Las funciones de orden superior son aquellas que toman por parametros otras funciones, o devuelven como resultado una funcion. <br>

//Definir funcion 
	
	f: Double => Double

	def FuncionValor(f: Double => Double, x: Double , y: Double , z: Double ) = { 
	   function body 
	   return [expr] 
	}


	def map (f: Int=>Int, l: List[Int]):List[Int] = 
	      if (l == Nil) l else f(l.head)::map(f,l.tail)
      

## 5.CURRIFICACIÓN <br>

La currificación es un mecanismo para la invocación parcial de funciones. Al llamar a una función normalmente le pasamos todos los parámetros y nos devuelve un resultado. Al invocarla parcialmente, le pasamos solo parte de esos parámetros y obtenemos una función. A esa otra función le pasamos el resto de parámetros para terminar obteniendo el resultado final.


<b> Ejemplo de clase </b>

     def suma(a: Double, b: Double) = {
     a+b 
     }
     --si no ponemos un parametro da error--- 

--Con currying devuelve una funcion con el parametro faltante--    

		def suma2(x:Double)=(y:Double) => x + y        
		val rest=suma2(1)                                
		rest(3)                                  //> res0: Double = 4.0 

## 6.COMPOSICION DE FUNCIONES<br>

En la programacion funcional las funciones suelen ser pequeñas y cohesivas con lo cual las combinamos para formar funciones mas grandes.<br> 
Por ejemplo, en haskell podríamos hacer esto:<br>

	(length . filter aprobado . map parcial) alumnos 
	
Tenemos las funciones length, filter y map (sin contar las que usamos cómo parámetro) y las combinamos en secuencia para hacer algoritmos más complejos.<br>
En el paradigma orientado a objetos hariamos:<br> 

	alumnos.map(_.parcial).filter(_.aprobado).length

La diferencia es que en la programación funcional cada uno tiene que construir las operaciones por afuera de los datos, en objetos los mismos datos pueden proveer las funciones. No necesitamos componer, porque podemos mandarle mensajes al resultado de una operación.<br>
Las funciones pueden ser compuestas usando “compose” y “andThen” para crear nuevas funciones más complejas.<br>

Creemos las siguientes funciones y veamos como funciona la composición enn Scala:<br> 

Sumar el valor de todos los niveles<br> 

	val toList: Niveles => List[Int] = niveles => List(niveles._1, niveles._2, niveles._3)
	val sumaNiveles: Niveles => Int = toList.andThen(_.sum)
	
	Calcular la diferencia entre el nivel más alto y el más bajo
	
	val maxNivel: Niveles => Int = toList.andThen(_.max) 
	val minNivel: Niveles => Int = toList.andThen(_.min)
	val diferenciaNiveles: Niveles => Int = niveles => maxNivel(niveles) - minNivel(niveles) 
	
	Sumar los niveles de una persona
	
	  def niveles(persona: Persona) = persona._2
	  val sumaNivelesPersona: Persona => Int = sumaNiveles.compose(niveles)

## 7.LISTAS<br>

En Scala para usar listas tenemos que usar el tipo List.<br>
 

 // Crear lista <br>
 
         val list = List(1, 2, 3, 4, 5, 6, 7)	
	 
	 val p = (1 to 20).toList
	 p: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
	 
	 for (k <- p if k % 3 == 0) yield("<" + k + ">")
	 res1: List[String] = List(<3>, <6>, <9>, <12>, <15>, <18>) 
	 
	 
	 list map (a => a + 1) foreach { a => print(" " + a) }
	 

//crear una lista de 10 elementos con 0 con fill
	
	val list3 = List.fill(10)(0)                      //> list3  : List[Int] = List(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)


 // Aplicar metodo take<br>
 
     val result = list.take(4) // gracias a la evaluacion perezosa 
    // solo genera los 4 primeros elementos de la lista 
          
// Añadir un elementos al principio de la lista // <br>

	scala> val list2 = 4 :: list 
	l3: List[Int] = List(4, 1, 2, 3) 
	
// Concatenar listas //<br>

	List = List :+ List2 

// Añadir n elementos a la lista // <br>
     
     scala> List.fill(3)("foo")
     res1: List[String] = List(foo, foo, foo)

// Recorrer lista con for// <br>
	
     for(x <- lista) x = x+1
     
 //Ejercicios con listas <br>
 
	 val list = List (5,3,1,2,4)                       //> list  : List[Int] = List(5, 3, 1, 2, 4)
 
 //Primer elemento de la lista <br>
 
	 def firstelement(l: List[Any]) = {
	  l.head
	}                                                 //> firstelement: (l: List[Any])Any
	firstelement(list)                                //> res0: Any = 5
	
// sumar elementos de una lista Forma Recursiva


	def sumlista(lis: List[Int]): Int = {
	  lis match {
	    case x :: tail => x + sumlista(tail)
	    case Nil => 0  // si es vacio return 0
	  }
	}                                                 //> sumlista: (lis: List[Int])Int

	sumlista(list)                                    //> res0: Int = 15
	
 //Buscar en una lista los numeros pares

	def mifiltro[A](lista: List[A], pred: (A)=>Boolean): List[A] = {
		if (lista.isEmpty) Nil
	    else if (pred (lista.head)) lista.head :: miFilter(lista.tail, pred)
		else miFiltro(lista.tail, pred)
	}                                                 //> mifiltro: [A](lista: List[A], pred: A => Boolean)List[A]

	def par(x: Int) = x % 2 == 0                      //> par: (x: Int)Boolean

	miFiltro(List(1,2,3,4), par)                      //> res0: List[Int] = List(2, 4)
	
	
// Lista invertida

	def reversoList(list: List[Int]): List[Int] = list match {
	 case head :: tail => reverseList(tail) :+ head
	 case Nil => Nil
	 }
	 
	 
  // Obtener un elemento de una lista
  
	  def getElemlist(list: List[Int], acc: (Int, Int)):Int = list match {
	    case Nil => 0
	    case head :: tail => {
	     if (acc._1 == acc._2)     // 1
	     list.head
	    else
	      getElemlist(tail, (acc._1 + 1, acc._2))     // 2
	   }
	   }                                              //> getElemlist: (list: List[Int], acc: (Int, Int))Int

	  getElemlist(list, (0, 1))   // 3                //> res0: Int = 3
## 8.PATRONES<br>

Los patrones es una forma de estructurar el código de forma que al ejecutarse funciona de una manera muy similar a una estructura de control de switch.
Consiste en asignar el valor a la función dependiendo del parámetro de entrada, en un orden jerárquico, de forma que los resultados van de mas especifico a mas general


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

 //Es lo mas parecido a un ejemplo complejo que utiliza ambos tipos de coincidencia de patrones
 
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

## 9.TUPLAS<br>

Las tuplas son estructuras de datos similares a las listas, pero pueden almacenar valores de distinto tipo, por lo que a la hora de declararla no es necesario saber de qué tipo de valores se encargará de almacenar
Para que dos tuplas se puedan comparar entre sí tienen que almacenar el mismo número y tipo de datos. Las tuplas son inmutables.

Las tuplas son especialmente útiles para retornar múltiples valores desde un método.

Una tupla con dos elementos puede ser creada del siguiente modo:

	val ingrediente = ("Azucar", 25)
Esta instrucción crea una tupla que contiene un elemento de tipo String y un elemento de tipo Int.

El tipo de la tupla ingredient se infiere que es(String, Int), lo cual es una abreviatura de Tuple2[String, Int].

Para representar tuplas, Scala utiliza una serie de clases: Tuple2, Tuple3, etc., hasta Tuple22. Cada clase tiene tantos parámetros como número de elementos.

<b>Accediendo a los elementos</b>
Una forma de acceder a los elementos de una tupla es por posición. Los elementos concretos se llaman _1, _2, y así sucesivamente.

	println(ingrediente._1) // Sugar
	println(ingrediente._2) // 25
<b>Reconocimiento de patrones en tuplas</b>
Una tupla también puede ser dividida/expandida usando reconocimiento de patrones (pattern matching):

	val (nombre, cantidad) = ingrediente
	println(nombre)     // Sugar
	println(cantidad) // 25
En esta ocasión el tipo de name es inferido como String y el de quantity como Int.

A continuación otro ejemplo de reconocimiento de patrones con tuplas:

	val planets =
 	 List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6),
       		("Mars", 227.9), ("Jupiter", 778.3))
	planets.foreach{
  	case ("Earth", distance) =>
   	 println(s"Nuestro planeta está a $distance millones de kilómetros del Sol.")
  	case _ =>
	}
O en compresión de bucles for:

	val numPairs = List((2, 5), (3, -7), (20, 56))
	for ((a, b) <- numPairs) {
	  println(a * b)
	}
	
	
## 10.RECURSIVIDAD<br>

La recursividad consiste en llamar al propio metodo con un tamaño menor al metodo original hasta llegar a un caso base de resolución sencilla e ir hacia atras luego resolviendo las subllamadas recursivas que se hicieron.Es muy usado en algoritmos resueltos por la tecnica Divide y Vencerás.
Existe prácticamente en todos los lenguajes y genera un código pequeño y elegante.		

	def factorial(n: Int): Int =
	    { 
		if (n == 0)  
		    return 1
		else
		    return n * factorial(n-1) 
	    } 
	    
 // Quitar Blancos de un string
 
 val str ="aa bb cc"                               //> str  : String = aa bb cc
                                    
de forma recursiva

	def quitaBlancos(x: String): String = {
	if(x == "")x
	else if (x.head!= ' ') x.head + quitaBlancos2(x.tail)
		else quitaBlancos2(x.tail)

	}                                                 //> quitaBlancos: (x: String)String
	quitaBlancos(str)                                //> res2: String = aabbcc

