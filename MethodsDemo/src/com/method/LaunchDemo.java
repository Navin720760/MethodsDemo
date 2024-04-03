package com.method;

//methods demonstration
class Demo1
{
	int num1,num2,res;
	
   //method with no argument and no return type
	void add1()
	{
		num1=10;
		num2=20;
		res=num1+num2;
		System.out.println("the sum of "+num1+" and "+num2+" is: "+res);
	}
	
   //method with arguments and no return type
	void add2(int n1,int n2)
	{
		num1=n1;
		num2=n2;
		//res=n1+n2;
		res=num1+num2;
		System.out.println("the sum of "+num1+" and "+num2+" is: "+res);
	}
	
   //method with return type and no arguments
	int add3()
	{
		num1=50;
		num2=60;
		res=num1+num2;
		return res;
	}
	
   //method with arguments and return type
	int add4(int n1,int n2)
	{
		num1=n1;
		num2=n2;
		//res=n1+n2;
		res=num1+num2;
		return res;
	}	
}

public class LaunchDemo {

	public static void main(String[] args) {
		
		
		Demo1 d1=new Demo1();
		
		d1.add1();
		
		d1.add2(30, 40);   //passing the data to the arguments
		
		Integer result1 = d1.add3();
		System.out.println("the sum is: "+result1);
		
		//System.out.println(d1.add4(70, 80));
		Integer result2 = d1.add4(70, 80);      //passing the data to arguments
		System.out.println("the sum is: "+result2);
		
            
	}

}
