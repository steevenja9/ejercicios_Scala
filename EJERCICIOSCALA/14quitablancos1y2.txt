val str ="aa bb cc"                               //> str  : String = aa bb cc
                                    

de forma recursiva

def quitaBlancos(x: String): String = {
if(x == "")x
else if (x.head!= ' ') x.head + quitaBlancos2(x.tail)
	else quitaBlancos2(x.tail)

}                                                 //> quitaBlancos: (x: String)String
quitaBlancos(str)                                //> res2: String = aabbcc


def quitaBlancos2(x: String) = {
	var devS: String = ""
	for(s <- x){
		if(s == ' ') 0
		else devS = devS :+ s
	}
	devS
}                                                 //> quitaBlancos2: (x: String)String

quitaBlancos2(str)                                 //> res1: String = aabbcc
