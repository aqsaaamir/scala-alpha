import scala.io.StdIn.readInt

/*
This program will display any table
*/

object PrintAnyTable extends App
{
	print("Enter a Number: ")
	var number = readInt()

	print("Enter a Limit: ")
	var limit = readInt()

	var y:Int = 1
	var z:Int = 0

	while (y <= limit) {
		
		z = number * y
		print(z + " ")
		y = y + 1
	}
}