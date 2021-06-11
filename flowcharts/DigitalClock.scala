import java.io.IOException

//remove if not needed
import scala.jdk.CollectionConverters._
object DigitalClock extends App
{
	var hour = 0
	var minute = 0
	var second = 0

	while(hour < 24) {
		minute = 0
		while (minute < 60)
		{
			second = 0
			while (second < 60)
				{
					print(hour + "::" + minute + "::" + second)
  						Thread.sleep(1000)
      					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
					second = second + 1
				}
				minute = minute + 1
		}
		hour = hour + 1
	}
	hour = 0
}