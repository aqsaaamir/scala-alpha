import scala.io.StdIn.readInt

object SwapANumber extends App
{
	var t = 4
	while(t >= 0){

		print("Enter Number1: ")
		var number1 = readInt()

		print("Enter Number2: ")
		var number2 = readInt()

		var z = 0

		z = number1
		number1 = number2
		number2 = z

		println("Swapped Number: " + number1 + ", " + number2)

		t = t - 1
	}

}