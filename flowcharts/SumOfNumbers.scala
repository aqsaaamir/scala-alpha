import scala.io.StdIn.readInt

/*
This program will display sum of numbers
*/

object SumOfNumbers extends App
{
	print("Enter a Limit: ")
	var limit = readInt()

	var y:Int = 1
	var sum:Int = 0
	
	while (y <= limit) {
		
		sum = sum + y
		y = y + 1
	}
	print(sum)
}