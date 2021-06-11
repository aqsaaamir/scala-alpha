import scala.io.StdIn.readInt

/*this prints reverse of a number. 
eg number = 234 output = 432*/

object ReverseOfANumber extends App
{
	var t = 4
    while(t >= 0) {

	print("Enter a Number: ")
	var number = readInt

	var reverse:Int = 0

	while(number > 0)
	{
		reverse = reverse * 10 + (number % 10)
		number = number / 10
	}
	println(reverse)
	t = t - 1
}
}