<h1> DOCUMENTACION SCALA </h1>

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

<b>1.DEFINICIÓN DE FUNCIONES.</b>

<img src="imagenes/funciones.png" width="400">

Para definir una función se usa "def" y el nombre de la función. La declaración es muy similar a los lenguajes orientado a objetos ya que los parametros se colocan entre parentesis con su tipo. El operador ":" sirve para especificar dicho tipo, tanto de variables como de la propia función.

def functionName ([tipos]) : [return tipos] = {
   function body
   return [expr]
}

funcion con funciones como parametros
def FuncionValor(f: Double => Double, x: Double , y: Double , z: Double ) = {
   function body
   return [expr]

}

funcion anonima
def lambda = new Function1[Int,Int]{  
	def anonima(x:Int):Int = x+1;  
} 

define un parámetro de entrada de tipo int función anónima: <BR>
var inc = (x:Int) => x+1



<b>2.PRIORIDAD DE OPERADORES Y TIPOS.</b>

<img src="imagenes/Prioridad_tipos.png" width="800" height="500">

<img src="imagenes/Prioridad_tipos.png" width="800" height="500">

<br>3.EVALUACIÓN PEREZOSA</br>
La evaluación perezosa, tambien llamada lazy evaluation o call-by-need, permite que un bloque de código sea evaluado sólo cuando se necesite, esto nos permite realizar código que tiene un rendimiento superior en ciertas situaciones
En scala, se utilizan los lazy val, que solo se evaluan cuando se utilizan por primera vez.
<img src="imagenes/lazyval.png" width="400">

<b>4.FUNCIONES DE ORDEN SUPERIOR</b>








