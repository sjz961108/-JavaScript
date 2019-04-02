import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
 
public class Main
{
    public static void main(String[] args)
    {
    	try{
    		File file =new File("e:\\test.txt");
    		if(file.exists()){
    		    FileReader fr = new FileReader(file);
    		    LineNumberReader lnr = new LineNumberReader(fr);
    		    int linenumber = 0;
    		    int zifu = 0;
    	            while (lnr.readLine() != null){
    	        	linenumber++;
        		    java.util.Scanner sc=new java.util.Scanner(file);
        		    String str=sc.next();
        		    zifu = zifu + str.length();
    	            }
    	            System.out.println("ÐÐÊý : " + linenumber);
    	            System.out.println("×Ö·û£º"+ zifu);
    	            lnr.close();
    		}else{
    			 System.out.println("File does not exists!");
    		}
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
} 
