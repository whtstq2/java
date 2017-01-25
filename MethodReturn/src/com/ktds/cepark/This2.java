package com.ktds.cepark;

public class This2 {
	
	int i;
	double d;
	
	public void Method1(int i){ 
		      this.i=i; 
		    } 
	
	public void Method1(double d){ 
		      this.d=d;
		   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This2 t=new This2(); 
		      t.Method1(100); 
		      t.Method1(3.14); 
		      System.out.println(t.i); 
		      System.out.println(t.d); 
	}

}
