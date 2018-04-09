package general;

public class Find_No_of_Digits 
{

	public static int main(String[] args)
	{
  int i=12345;
  int length = 0;
  long temp = 1;
  while (temp <= i) {
      length++;
      temp /= 10;
  }
  return length;
	}

}
