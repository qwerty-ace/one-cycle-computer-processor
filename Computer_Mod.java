
public class Computer_Mod {
	static int  offset;
	int result;
	String  op, ops;
	static String register_A="0";
	static String register_B="0";
	
	//static String op= Ram[PC.PC];
	 
	public static void operation(String[] Ram){
		Computer_Mod comp=new Computer_Mod();
		Integer reg_A_int = Integer.parseInt(register_A);
	    Integer reg_B_int = Integer.parseInt(register_B);
	  
		//System.out.print("equal " + ( Ram[0].equals("00"))));
	    String ops=comp.op=Ram[PC.PC];
		Computer_Mod obj=new Computer_Mod();
		if( ops.equals("00")) {   System.out.println("nop ");    }
		else {if( ops.equals("01")) {register_A= register_B;System.out.println("Reg A now equal to Reg B");     }
		else {if( ops.equals("02")) { register_B= register_A; System.out.println("Reg B now equal to Reg A");   }
		else {if( ops.equals("03")) { register_A=  Ram[PC.PC+1];                                                }
		else if( ops.equals("04"))  { register_B=  Ram[PC.PC+1];                                                }
		else {if( ops.equals("05")) { register_A=  Ram[Integer.parseInt( Ram[PC.PC+1]+  Ram[PC.PC+2],16)];   }
		else {if( ops.equals("06")) { register_B=  Ram[Integer.parseInt( Ram[PC.PC+1]+ Ram[PC.PC+2],16)];   }
		else {if( ops.equals("07")){ Ram[Integer.parseInt( Ram[PC.PC+1]+  Ram[PC.PC+2],16)]= register_A;  }
		else{ if( ops.equals("08")){ Ram[Integer.parseInt( Ram[PC.PC+1]+  Ram[PC.PC+2],16)]= register_B;     }
		else{ if( ops.equals("09")){System.out.println(obj.alu( ops,register_A,register_B ));    }
		else{ if( ops.equals("0A")){System.out.println(obj.alu( ops,register_A,register_B ));    }
		else{ if( ops.equals("0B")){System.out.println(obj.alu( ops,register_A,register_B ));    }
		else{ if( ops.equals("0C")){System.out.println(obj.alu( ops,register_A,register_B ));    }
		else{ if( ops.equals("0D")){System.out.println("Register A is "+ reg_A_int+" then it is incremented ");reg_A_int=reg_A_int+1; register_A=reg_A_int.toString();                   }
		else{ if( ops.equals("0E")){System.out.println("Register B is "+ reg_B_int+" then it is incremented "); reg_B_int=reg_B_int+1;   register_B=reg_B_int.toString();                 }
		else{ if( ops.equals("0F")){System.out.println("Register A is "+ reg_A_int+" then it is decremented "); reg_A_int--;  register_A=reg_A_int.toString();                  }
		else{ if( ops.equals("10")){System.out.println("Register B is "+ reg_B_int+" then it is decremented "); reg_B_int--;   register_B=reg_B_int.toString();                 }
		else{ if( ops.equals("11")){System.out.println(obj.alu( ops,register_A,register_B ));    }
		else{ if( ops.equals("12")){System.out.println(obj.alu( ops,register_A,register_B ));    }
		else{ if( ops.equals("13")){System.out.println(obj.alu( ops,register_A,register_B ));    }
		else{ if( ops.equals("14")){if(obj.alu( ops,register_A,register_B )==888) System.out.println("Registers are equal"); 
		else System.out.println("registers are not equal");
			    }
		else{ if( ops.equals("15")){register_A="0";                                                 }
		else{ if( ops.equals("16")){register_B="0";                                                 }
		else{ if( ops.equals("17")){
		PC.PC=Integer.parseInt( Ram[PC.PC+1]+Ram[PC.PC+2],16)-3; 
		}
		else{ if( ops.equals("18")){if (register_A.equals("0")){ PC.PC=Integer.parseInt( Ram[PC.PC+1]+Ram[PC.PC+2],16)-3; System.out.println("a equals 0"); }      }
		else{ if( ops.equals("19")){if ((register_A.equals("0"))){} else{PC.PC=Integer.parseInt( Ram[PC.PC+1]+Ram[PC.PC+2],16)-3;  System.out.println("a doesnt equal 0");}       }
		else{ if( ops.equals("20")){reg_A_int=~reg_A_int; register_A=reg_A_int.toString();            }
		else{ if( ops.equals("21")){reg_B_int=~reg_B_int; register_A=reg_B_int.toString();            }
		else{ if( ops.equals("22")){String temp =register_A; register_B=register_A; register_A= temp; }
		else{ if( ops.equals("23")){System.out.println("HLT instruction");  System.exit(0);           }
		else  {System.out.print("No such instruction supported 1"); offset=1;}}}}}}}}
	}}}   }}}}}}}}}}}}}}}}}}
		PC.updatePC(ops);}
	
	int alu(String op, String a, String b){
		int A=Integer.parseInt(a,16); int B=Integer.parseInt(b,16); 
		if( op.equals("09")) {
			int add=A+B;
			if (add > 255) {
                System.out.println("The output is more than 1 byte ");
                System.exit(0);
            }
			return add; }
		else{ if( op.equals("0A")){ 
			int sub=A+B;
			if (sub > 255) {
                System.out.println("The output is more than 1 byte ");
                System.exit(0);
            }
			return sub;}
		else {if ( op.equals("0B")) {
			int mul=A*B;
			if (mul > 255) {
                System.out.println("The output is more than 1 byte ");
                System.exit(0);
            }
			return mul;}
		else {if ( op.equals("0C")) {
			int div=A+B;
			if (div > 255) {
                System.out.println("The output is more than 1 byte ");
                System.exit(0);
            }
			return div;}
		else {if ( op.equals("11")) {
			int and=A&B;
			return and;}
		else {if ( op.equals("12")) {
			int or=A|B;
			return or;}
		else {if ( op.equals("13")) {
			int p=A^B;
			return p;}
		else {if ( op.equals("14")) {
			if (A==B)return 888;
			else 	return 777;
		}
		else{  System.out.println("No such instruction supported"); return 0000;     }
		
		
		}}}}}}} 	
		}}

