class vsp 
{
	public static void main(String[] args) 
	{
		String s="raghava";
	String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='r'||s.charAt(i)=='v')
			{
			t=s.charAt(i)+t;
			}
		}
		
		System.out.println(t);
	}
}
