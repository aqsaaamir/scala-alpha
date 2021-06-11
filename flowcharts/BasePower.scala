import scala.io.StdIn.readInt

object BasePower extends App {

    var t = 4
    while(t >= 0) {

	print("Enter a value for Base: ")
		var base = readInt()

		var result:Int = 1

	print("Enter a value for Power: ")
		var power = readInt()
		var z:Int = power

	while (power > 0)
	{
		result = result * base
		power = power - 1
	}

	println(base + " to the base " + z + " is: " + result)
  t = t - 1;
}
}