
package hello;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.List;  
import java.util.Map;  
import java.util.Map.Entry;  
import java.util.TreeMap;

  
public class nanshou {  
  
    public static void main(String[] args) throws Exception {  
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
    	            System.out.println("行数 : " + linenumber);
    	            System.out.println("字符："+ zifu);
    	            lnr.close();
    		}else{
    			 System.out.println("File does not exists!");
    		}
    	}catch(IOException e){
    		e.printStackTrace();
    	}          
        BufferedReader br = new BufferedReader(new FileReader("e:\\test.txt"));  
        	List<String> lists = new ArrayList<String>();  //存储过滤后单词的列表  
        	String readLine = null;
        	while((readLine = br.readLine()) != null){  
            String[] wordsArr1 = readLine.split("[^a-zA-Z]");  //过滤出只含有字母的  
            for (String word : wordsArr1) {  
                if(word.length() != 0){  //去除长度为0的行  
                    lists.add(word);  
                }  
            }  
        }  
          
        br.close();  
          
        Map<String, Integer> wordsCount = new TreeMap<String,Integer>();  //存储单词计数信息，key值为单词，value为单词数       
          
        //单词的词频统计  
        for (String li : lists) {  
            if(wordsCount.get(li) != null){  
                wordsCount.put(li,wordsCount.get(li) + 1);  
            }else{  
                wordsCount.put(li,1);  
            }  
  
        }  
          
        SortMap(wordsCount);    //按值进行排序  
      
    }  
      
    //按value的大小进行排序  
    public static void SortMap(Map<String,Integer> oldmap){  
          
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(oldmap.entrySet());  
          
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){  
            @Override  
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {  
                return o2.getValue() - o1.getValue();  //降序  
            }  
        });  
          
        for(int i = 0; i<list.size(); i++){  
            System.out.println(list.get(i).getKey()+ ": " +list.get(i).getValue());  
        } 

        String content = "This is the text content";  
        
    }  
}  
