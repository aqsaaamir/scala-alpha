import scala.io.StdIn.readInt

object SquareRoot extends App{

	var t = 4
	while (t >= 0) {
	print("Enter a Number: ")

	var number = readInt()

	var result = 0
	var x = 0

		while (result <= number)
		{
			x = x + 1
			result = x * x
		}
		x = x - 1
		println(x)

		t = t - 1
	}
}