import scala.io.StdIn.readInt

/*
This program will display largest of three numbers
*/

object LargestOfThreeNumbers extends App
{
	print("Enter first Number: ")
	var number1 = readInt()

	print("Enter second Number: ")
	var number2 = readInt()

	print("Enter third Number: ")
	var number3 = readInt()

	if ((number1 > number2) && (number1 > number3))
	   {
		print(number1 + " is largest")
		} 
		else if(number2 > number3) 
		{
	   	println(number2 + " is greatest")
  	 	} 
   		else 
   		{
   		println(number3 + " is greatest")
  		}

}

		
