import scala.io.StdIn.readInt

/*
  This program sums up the digits of a number:
  e.g inputNumber = 345, output will be 12
*/

object sumofdigitsofanumber extends App {

	println("Enter a number: ")
	var inputNumber = readInt()

    //type inference
	var sum:Int = 0
	var rem:Int = 0

	while(inputNumber > 0) {
		rem = inputNumber % 10
		sum = sum + rem
		inputNumber = inputNumber / 10
	}

	println("Sum is: " + sum)


}