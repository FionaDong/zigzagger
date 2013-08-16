public class Mission2
{
	public static void main(String[] args)
	{
// 	System.exit(1);
		System.out.println("ok");
		N n = new N();
		n.override();
	}
}	
class M
{
	public void override()
	{
		System.out.println("override");
	}

}	

class N extends M
{
	public void override()
	{
		System.out.println("not override");
// 		return 1;
	}	
}

