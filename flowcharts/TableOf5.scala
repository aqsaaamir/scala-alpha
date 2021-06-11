import scala.io.StdIn.readInt

/*
This program will display table of 5
*/

object printTableof5 extends App
{
	println("Enter a Limit: ")

	var limit = readInt()

	var x:Int = 1

	while(x <= limit) {
		
		print(x + " ")
		x = x + 5
	}
}