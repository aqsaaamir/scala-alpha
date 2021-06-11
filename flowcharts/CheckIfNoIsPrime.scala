import scala.io.StdIn.readInt
import scala.util.control.Breaks._

/*
This program will display Lucas series
*/

object CheckIfNoIsPrime extends App
{
	print("Enter a num: ")

	var num = readInt()
	var div:Int = 2
	
 breakable {	
	while (div * div <= num) {
		if(num % div == 0)
		{
			break
		}
		else 
			{
				div = div + 1
			}
	}
}

if(div * div <= num)
	print(num + " is not a prime number")
else
			print(num + " is  a prime number")

}
	