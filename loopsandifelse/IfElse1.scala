import scala.io.StdIn.readInt
object IfElse1 extends App {

   
   val age: Int = readInt()

   if((age > 20) && (age < 30)) {
   	  println("youngester")
   } else if((age > 30) && (age < 40)) {
   	println("married")
   } else {
   	println("old or teenagers")
  }

}