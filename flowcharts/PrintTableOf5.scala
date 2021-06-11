import scala.io.StdIn.readInt

/*
This program will display table of 5
*/

object PrintTableOf5 extends App
{
	print("Enter a Limit: ")

	var limit = readInt()

	var x:Int = 5
	var y:Int = 1
	var z:Int = 0

	while(y <= limit) {
		
		//print(x + " ")
		z = x * y
		print(z + " ")
		y = y + 1
	}
}