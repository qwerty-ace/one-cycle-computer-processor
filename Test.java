
public class Test {
static String op;
	public static void main(String[] args){
		
		memory a=new memory();
		String Ram[]= a.Memory_create();
		System.out.println("ram:"+Ram.length);
		for(int i=0; i<300 ; i++){
			System.out.println("PC:"+PC.PC);
			System.out.println("Instruction:"+Ram[PC.PC]);
			Computer_Mod.operation(Ram);
			System.out.println("Register A in hex:"+Computer_Mod.register_A);
			System.out.println("Register B in hex:"+Computer_Mod.register_B);
			//System.out.println("Register A in decimal:"+Integer.parseInt(Computer_Mod.register_A,16));
			//System.out.println("Register B in decimal:"+Integer.parseInt(Computer_Mod.register_B,16));
		}}}
