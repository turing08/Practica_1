/***
Ennumera el factorial es un miembro de la clase Factorial cuyo listado completo se presenta a continuación ..****/

class Factorial
{
	public static int factorial (int n)
	{
		int ans=1;
		while(n>1)
		{
			ans=ans*n;
			n=n-1;
		}
		return ans;
	}

	public static void main(String [] args)
	{
		int n=0;
		while(n<13)
		{
			System.out.print(n + " !=");
			System.out.println(factorial(n));
			n=n+1;
		}
	}
}
