class Pattern_1C
{
	public static void main(String arg[])
	{
	  for(int i=1;i<=9;i++)
	  {
		  for(int j=8;j>=i;j--)
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



class Pattern_2
{
	public static void main(String arg[])
	{
	  for(int i=1;i<=9;i++)
	  {
		  for(int j=8;j>=i;j--)
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



class Pattern_3
{
	public static void main(String arg[])
	{
	  for(int i=1;i<=9;i++)
	  {
		  for(int j=8;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=i;k++)
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
		for(int i=1;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
			 if(i!=1)
			 {
				for(int k=i-1;k>=1;k--)
					 
			    {
			      System.out.print(k+" ");
				}
			 }
			 
			 System.out.println(); 
		}		
		
		
	}
}





class Pattern_5
{
	public static void main(String arg[])
	{
		for(int i=9;i>=1;i--)
		{
		  for(int j=1;j<i;j++)
		  {
			  System.out.print("  ");
		  }
		  for(int k=i;k<=9;k++)
		  {
			  System.out.print(k+" ");
		  }
		  
		   if(i!=9)
		   {
			   for(int k=8;k>=i;k--)
			   {
				   System.out.print(k+" ");
			   }
		   }
		  
			System.out.println();
		}		
		
		
	}
}




class Pattern_6
{
	public static void main(String arg[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=9;k>=i;k--)
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
		for(int i=9;i>=1;i--)
		{
			for(int j=9;j>i;j--)
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





class Pattern_8
{
 public static void main(String arg[])
 {
    for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=i;j++)
		{
		  System.out.print("* ");
		}
		  System.out.println();
	}		
 }
}





class Pattern_9
{
     public static void main(String arg[])
    {
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
    } 	
}






class Pattern_10
{
	public static void main(String arg[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				if(i==1||j==6||j==i)
				{
				 System.out.print("* ");
				}
				else
				{
				 System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}






class Pattern_11
{
	public static void main(String arg[])
	{
	  for(int i=1;i<=6;i++)
	  {
		  for(int j=5;j>=i;j--)
		  {
			  System.out.print("  ");
		  }
		  for(int k=1;k<=i;k++)
		  {
			  System.out.print("*   ");
		  }
		  
		      System.out.println();
	  }		  
	}
}






class Pattern_12
{
	public static void main(String arg[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=6;k>=i;k--)
			{
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
}







class Pattern_13
{
	public static void main(String arg[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--)
			{
				if(  i==6||k==1||i==k )
				{
					System.out.print("*   ");
				}
				else
				{
					System.out.print("    ");
				}
			}
			    System.out.println();
		}
	}
}