class Even
{
	public static void main(String[]args)
	{
		int n[]={2,8,4,5,9,3,15,18,17,20,22,23};
		for(int i=0; i<=n.length-1; i++)
		{
			if(n[i]%2==0)
			{
				System.out.println(n[i]);
			}
		}
	}
}