import scala.io.StdIn.readInt

/*
This program will display Lucas series
*/

object LucasSeries extends App
{
	print("Enter a Limit: ")
	var limit = readInt()

	var x:Int = 0
	var y:Int = 1
	var z:Int = 1
	var sum:Int = 1
	
	while (x <= limit) {
		print(x + " ")
		sum = x + y + z
		x = y
		y = z
		z = sum
	}
}