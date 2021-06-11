import scala.io.StdIn.readInt

/*this prints armstrong numbers: 153, 370, 371, 407 etc*/

object ArmstrongNumber extends App
{

	var t = 4
	while(t >= 0) {

	print("Enter a Number: ")
	var number = readInt()

	var remainder = 0
	var sum = 0
	var temp = number+

	while(temp > 0)
	{
		remainder = temp % 10
		sum = sum + (remainder * remainder * remainder)
		temp = temp / 10
	}

	if (sum == number)
	println(" It is an ArmstrongNumber")
	else 
		println("It is not an ArmstrongNumber")
	t = t - 1
  }

}