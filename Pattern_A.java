class Pattern_1
{
 public static void main(String arg[])
 {
    for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		  System.out.print(j+" ");
		}
		  System.out.println();
	}		
 }
}






class Pattern_2
{
 public static void main(String arg[])
 {
	int Ch = 64;
    for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		  System.out.print((char)(Ch + j)+" ");
		}
		  System.out.println();
	}		
 }
}



class Pattern_3
{
 public static void main(String arg[])
 {
    for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		  System.out.print("* ");
		}
		  System.out.println();
	}		
 }
}


class Pattern_4
{
 public static void main(String arg[])
 {
    for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		  System.out.print(i+" ");
		}
		  System.out.println();
	}		
 }
}




class Pattern_5
{
 public static void main(String arg[])
 {
	int Ch = 64;
    for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		  System.out.print((char)(Ch + i)+" ");
		}
		  System.out.println();
	}		
 }
}




class Pattern_6
{
	public static void main(String arg[])
	{
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=4;j>=i;j--)
		  {
			  System.out.print("  ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print("* ");
		  }
		  
		      System.out.println();
	  }		  
	}
}


class Pattern_7
{
	public static void main(String arg[])
	{
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=4;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print(k+" ");
		  }
		  
		      System.out.println();
	  }		  
	}
}


class Pattern_8
{
	public static void main(String arg[])
	{
		
	  for(int i=5;i>=1;i--)
	  {
		  for(int j=1;j<i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=i;k<=5;k++)
		  {
			  System.out.print(k+" ");
		  }
		  
		      System.out.println();
	  }		  
	}
}

class Pattern_9
{
	public static void main(String arg[])
	{
		int ch=64;
		 for(int i=1;i<=5;i++)
	  {
		  for(int j=4;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print((char)(ch+k)+" ");
		  }
		     System.out.println();
	  }		  
	}
}




class Pattern_10
{
	public static void main(String arg[])
	{
		int ch=64;
		for(int i=5;i>=1;i--)
	  {
		  for(int j=1;j<i;j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k=i;k<=5;k++)
		  {
			  System.out.print((char)(ch+k)+" ");
		  }
		  
		      System.out.println();
      }		  
	}
}


class Pattern_11
{
	public static void main(String arg[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


class Pattern_12
{
	public static void main(String arg[])
	{
	  for(int i=1;i<=5;i++)
	  {
		  for(int j=4;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print(i+" ");
		  }
		  
		      System.out.println();
	  }		  
	}
}




class Pattern_13
{
	public static void main(String arg[])
	{
		int ch=64;
		 for(int i=1;i<=5;i++)
	  {
		  for(int j=4;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print((char)(ch+i)+" ");
		  }
		     System.out.println();
	  }		  
	}
}


class Pattern_14
{
     public static void main(String arg[])
    {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
    } 	
}


class Pattern_15
{
     public static void main(String arg[])
    {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
    } 	
}


class Pattern_16
{
     public static void main(String arg[])
    {
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
    } 	
}






class Pattern_17
{
	public static void main(String arg[])
	{
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count++ +" ");
			}
			
			System.out.println();
		}
	}
}




class Pattern_18
{
	public static void main(String arg[])
	{
		int ch=64;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print((char)(ch+j)+" ");
			}
			System.out.println();
		}
	}
}