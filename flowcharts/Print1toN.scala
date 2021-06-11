
import scala.io.StdIn.readInt

/*
  This program displays the first n numbers. eg if limit is 5,
   it will display: 1 2 3 4 5
*/

object Print1toN extends App {

	println("Enter a number: ")

	var limit = readInt()

    
	var x:Int = 1

	while(x <= limit) {
		//println(x)
		print(x + " ")
		x = x + 1
	}
}
