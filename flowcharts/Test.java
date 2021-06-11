import java.io.IOException;

public class Test  
{  
    public static void main(String... arg)
     throws IOException, InterruptedException {

  int i =1;
  while(i<10) {
  	System.out.println(i);
  	Thread.sleep(1000);
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

  	i++;
  } 
}  


}  