import scala.io.StdIn.readInt

/*
This program will display fibonacci series
*/

object FiboSeries extends App
{
	print("Enter a Limit: ")
	var limit = readInt()

	var x:Int = 0
	var y:Int = 1
	var sum:Int = 1
	
	while (x <= limit) {
		print(x + "   ")
		x = y
		y = sum
		sum = x + y

	}
}