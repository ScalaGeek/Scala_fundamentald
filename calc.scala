class calculator {

def addition(a: Int, b: Int) : Int =a+b

def subtraction(a: Int, b: Int) : Int=a-b

def multiplication(a: Int, b: Int) : Int = a*b

def division(a: Int, b: Int) : Int=a/b

}

object cal{

def main(args:Array[String])
{
val calc=new calculator

calc.addition(10,5)
}
}
