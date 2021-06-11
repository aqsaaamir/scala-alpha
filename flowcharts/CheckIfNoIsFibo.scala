import scala.io.StdIn.readInt

/*
This program will display Lucas series
*/

object CheckIfNoIsFibo extends App
{
	print("Enter a num: ")
	var num = readInt()

	var x:Int = 0
	var y:Int = 1
	var sum:Int = 1
	
	while (x < num) {
		//sum = x + y 
		x = y
		y = sum
		sum = x + y
	}
	if (x == num)
	{
		println(num + " is Fibo")
	}
	else 
		{ println(num + " is not Fibo")
		}

}