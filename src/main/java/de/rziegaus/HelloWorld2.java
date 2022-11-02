package de.rziegaus;

public class HelloWorld2
{

	public static String getGreeting()
	{
	  return "Hello World 2";	
	}
	
	public static void main(String[] args)
	{
		System.out.println(getGreeting() + ": " + System.getProperty("java.version"));
	}

}
