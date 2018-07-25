package helloworld;

public class NestedLoop 
{

	public static void main(String[] args) 
	// think of i as ROW and j as COLUMN
	{
			for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= 4; j++)

			{
				System.out.print("*");
			}

			System.out.println();
		}
	
//Another Example

			for(int a=1;a<=4;a++)
			{
				for(int b=1;b<=a;b++)
				{
					System.out.print("*");
				}
					
					System.out.println();
				
			  }	
			
			// Another Example 
			
			for(int n=1;n<=6;n++)
			{
				for(int m=1;m<=n;m++)
				{
					System.out.print(m);
				}
				System.out.println();
			}
				
				
				
			//Another Example
				
			for(char c=65;c<=67;c++)
			{
				for(char d=65;d<=c;d++)
				{
					System.out.print(d);
				}
					System.out.println();
				
			}
			
			for(int f=1;f<=4;f++)
			{
				for(int g=1;g<=4;g++)
					{
						if(f==1||f==4||g==1||g==4)
						{
							System.out.print("$ ");
						}
						else
						System.out.print("  ");
					}
				
				System.out.println();
			 }
	}
}
	 
	

	
