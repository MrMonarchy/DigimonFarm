//Class used to demostrate the uses of an overlord
public class Overlord {

	public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
       Overlord obj = new Overlord();
       obj.disp('a');
       obj.disp('a',10);
   }
}
	

