package com.practise.usingRunnableInterface;

public class Cases {

	public static void main(String[] args) {
		FIrst f =new FIrst();
		
		Thread t1=new Thread();
        Thread t2=new Thread(f);
        
        //Case:1 
        t1.start(); //Executes Thread Class Run()
        
        //Case:2
        t2.start(); //Executes FIrst Class Run()
        
        // In above Cases new Thread will be created
   //--------------++++-------++++------------------
        
        //Case:3
        t1.run(); // executes Thread Class run()
        
        //Case:4
        t2.run();  // executes FIrst Class run()
        
        // In above Cases NO new Thread will be created
        
   //-------------+++++--------++++++++-------------
       
        //Case:5
       // f.start(); occurs compile time error
        
        //Case:6
        f.run(); //executed as normal method call

	}

}
