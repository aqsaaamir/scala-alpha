import scala.io.StdIn.readInt

/*
This program will display odd numbers
*/

object printEvenNumbers extends App
{
	println("Enter a Limit: ")

	var limit = readInt()

	var x:Int = 1

	while(x <= limit) {
		
		if (x % 2 != 0) {  
		  print(x + " ")
		} 
		x = x + 1
	}

}