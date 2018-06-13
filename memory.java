import java.io.File;
import java.util.Scanner;

public class memory {
  int size = 0;
 Scanner x;
 
    static String[] RAM;
    String[] Memory_create() {
    	RAM = new String[10000];
       size = 10000;
       fill_memory(RAM);
       return RAM;
    }
  
    
    public void fill_memory(String[] ram) {
        String data;
        int address=0;
        int i=0;
        String file="C:\\Users\\Asus X5555LJ-X01034T\\Desktop\\csa\\ReadHex\\src\\Instruction Memory.hex";
        try { x=new Scanner(new File(file));
        } catch (Exception e) {
            System.out.println("File not found");
            System.exit(0);
        }
    
        while (x.hasNext()) {
            String line=x.nextLine();
            for (i=0; i<line.length()-1;i=i+2) {
                data = "";
                data += line.charAt(i)+line.charAt(i + 1);
                if (!data.matches("-?[0-9a-fA-F]+")) {
                    System.out.println("wrong simbols in the file");
                    System.exit(0);
                } else {
                	if (address >= size) {
                        System.out.println("This address is not in the memory");
                        System.exit(0);
                    } else
                    	ram[address] = data;
                	address++;
                }
            }
        }
    }


}