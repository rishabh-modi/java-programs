
import java.util.*;
interface Test
{
     interface Yes
    {
        void show();
    }
}
 
class Testing implements Test.Yes
{
    public void show()
    {
        System.out.println("method called from inenr interface");
    }
}
 
class A
{
    public static void main(String[] args)
    {
        //Test.Yes obj;
        Testing t = new Testing();
      //  obj = t;
        t.show();
    }
}