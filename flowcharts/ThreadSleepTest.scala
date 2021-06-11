object ThreadSleepTest extends App {

	var i = 1;

	while(i <= 10) {
		println(i);
		Thread.sleep(1000)
		i = i + 1;
	}
}
/*
  clrscr();
*/