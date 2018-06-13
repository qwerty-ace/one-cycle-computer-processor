
public class PC {
	static int offset;
	static int PC=0; 
	static void updatePC(String op){
	PC=PC+offset(op);}
	
	static int offset(String op){
		{if(op.equals("03") || op.equals( "04" )){
		offset=2;}
		else if(op.equals( "05" ) 
			|| op.equals("06")||  op.equals("07")
			||  op.equals( "08" )||  op.equals( "17" )
			||  op.equals( "18" )||  op.equals( "19" ))	{offset=3;}
		else  {offset=1;}}
		return offset;	
	}
}
	
	
	
	
		

	
	

