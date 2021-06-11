import scala.io.StdIn.readInt


object PrimeFactors extends App
{
	print("Enter a Number: ")
	var number = readInt()

	var div = 2
	
	while(div <= number){
		while(number % div ==0){
			println(div)
			number = number / div
		}

		div = div + 1
	}
}

/*
28 
2 2 7
*/