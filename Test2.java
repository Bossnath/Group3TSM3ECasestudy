//Method 1: Delos Reyes, Nathaniel
class Bank
{

double getRateOfInterest()
{return 0;}  
}  

//Method 2: Delos Reyes, Nathaniel
class SECURITYBANK extends Bank
{  
double getRateOfInterest(){return 0.99;}  
}
//Method 3: Libunao, Patrick O.
class GSAVE extends Bank{  
double getRateOfInterest(){return 2.6;}  
} 
//Method 4:Libunao, Patrick 0.
class LANDBANK extends Bank{  
double getRateOfInterest(){return 0.75;}  
}
//Method 5: Laxamana, Karl Friedrich
class CHINABANK extends Bank
{  
double getRateOfInterest()
{return 0.25;}  
} 
//Method 6: Laxamana, Karl Friedrich
class UNIONBANK extends Bank
{  
double getRateOfInterest()
{return 0.10;}  
}
}
class Test2
{  
public static void main(String args[]){  
SECURITYBANK sb=new SECURITYBANK();
GSAVE gs=new GSAVE(); 
LANDBANK lb=new LANDBANK();  
CHINABANK bc=new CHINABANK();  
UNIONBANK ub=new UNIONBANK();  
ING g=new ING(); 
BDO b=new BDO();
BPI bp=new BPI(); 
RCBC r=new RCBC();
CITIBANK cb=new CITIBANK();
CIMB ci=new CIMB();
METROBANK mb=new METROBANK();
System.out.println("SECURITYBANK Rate of Interest: "+sb.getRateOfInterest());
System.out.println("GSAVE Rate of Interest: "+gs.getRateOfInterest());
System.out.println("LANDBANK Rate of Interest: "+lb.getRateOfInterest());  
System.out.println("CHINABANK Rate of Interest: "+bc.getRateOfInterest());  
System.out.println("UNIONBANK Rate of Interest: "+ub.getRateOfInterest()); 
System.out.println("ING Rate of Interest: "+g.getRateOfInterest()); 
System.out.println("BDO Rate of Interest: "+b.getRateOfInterest()); 
System.out.println("BPI Rate of Interest: "+bp.getRateOfInterest()); 
System.out.println("RCBC Rate of Interest: "+r.getRateOfInterest()); 
System.out.println("CITIBANK Rate of Interest: "+cb.getRateOfInterest()); 
System.out.println("CIMB Rate of Interest: "+ci.getRateOfInterest()); 
System.out.println("METROBANK Rate of Interest: "+mb.getRateOfInterest()); 
}  
}
