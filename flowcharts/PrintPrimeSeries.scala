import scala.io.StdIn.readInt

object PrintPrimeSeries extends App{
	print("Enter a limit: ")
	var limit = readInt()

	var num:Int = 0
	var div:Int = 2

	while(div * div <= num)
	{
		if (num % 2 == 0)
			num = num + 1
	}
	print(num)
	
}