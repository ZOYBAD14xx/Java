import java.io.*;  
public class Name {  
    public static void main(String args[])throws IOException{  
        try{

            FileOutputStream fout = new FileOutputStream("ListName.txt");
            OutputStreamWriter op = new OutputStreamWriter(fout);
            PrintWriter fop = new PrintWriter(op);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = " ";

            System.out.print("Enter your name: ");
            while(!(inputString.equalsIgnoreCase("q")) || !(inputString.equalsIgnoreCase("Q"))){
            inputString = reader.readLine();
            System.out.print("Enter your name: ");
            fop.println("Your name : "+inputString); 
            }  
            fop.close();
            reader.close();
            op.close();
            fout.close();
            }catch(IOException ex){
            System.out.println(ex.toString());
            } 
    }    
}
