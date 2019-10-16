/*
 * Name: Zachary Neeley	
 * Date: 2/6/19
 * Assignment: Lab 3, this file will model the expression ((∃x p(x)) ∧ (∃x q(x))) → ∃x (p(x) ∧ q(x)) 
 */

public class Part1Model1 {
	//init 
   static boolean [] P = { true, false};
   static boolean []Q = { true, true};
  
  
   public static void main(String[] args){
	   // Print out the final results
      System.out.print(arrow(and(pxLoop(),qxLoop()),(pandqexists())));

   }
   
  // Return the index of p[x]
   public static boolean p(int x) {
      return P[x];
   }

   // Return the index of q[x]
   public static boolean q(int x) {
      return Q[x];
   }
    
	// Loop through all the possible values for p(X)
   public static boolean pxLoop(){
    for (int y=0; y < 2; y++)
        if (p(y)) return true;
    return false;
   }
   
   // Loop through all the possible values of q(x)
   public static boolean qxLoop(){
    for (int y=0; y < 2; y++)
        if (q(y)) return true;
    return false;
   }
   
   // Check to see if both p and q exist
   public static boolean pandqexists()
    {
      for( int x=0;x<P.length;x++){
         if (q(x) && p(x))  
             return true;}
         return false;  
      
    }
	
    // Use this for the "and" in the expression
	public static boolean and(boolean L, boolean R){
		if(R==true&L==true){
			return true;
		}
		if(R==true&L==false){
			return false;
		}
		if(R==false&L==true){
			return false;
		}else{
		return false;
		}
	}
    
    // Use this for the "or" in the expression
	public static int or(int L, int R){
		if(R==1&L==1){
			return 1;
		}
		if(R==1&L==0){
			return 1;
		}
		if(R==0&L==1){
			return 1;
		}else{
			return 0;
		}
	}
 
	// Use this for the "imply" in the expression
	public static boolean arrow(boolean L, boolean R){
		if(R==true&L==true){
			return true;
		}
		if(R==true&L==false){
			return true;
		}
		if(R==false&L==true){
			return false;
		}else{
			return true;
		}
  
	}
    
    
}
