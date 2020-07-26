/* NAME: SHIVANGI RAWAT
   SECTION: DS 
   ROLL NO: 2013504
 */
	import java.io.*;
                
public class wordfreqcount2 {

	    public static void main(String[] args)throws IOException
	    {   
	    	FileReader fr=new FileReader("C:\\Users\\admin\\Desktop\\abc.txt"); //Here,set path of the txt file of your choice.
	        BufferedReader br = new BufferedReader(fr);
	        String text = br.readLine();
	        String keys[] = text.split(" ");
	        String unique[];
	        int count = 0;
	        
	        unique = getUniqueKeys(keys);

	        for(String k: unique)
	        {
	            if(null == k)
	            {
	                break;
	            }           
	            for(String s : keys)
	            {
	                if(k.equals(s))
	                {
	                    count++;
	                }               
	            }
	            System.out.println(k+ "  "+count+" times");
	            count=0;
	        }
	    }

	    private static String[] getUniqueKeys(String[] keys)
	    {
	        String[] uniqueKeys = new String[keys.length];

	        uniqueKeys[0] = keys[0];
	        int uniqueKeyIndex = 1;
	        boolean keyAlreadyExists = false;

	        for(int i=1; i<keys.length ; i++)
	        {
	            for(int j=0; j<=uniqueKeyIndex; j++)
	            {
	                if(keys[i].equals(uniqueKeys[j]))
	                {
	                    keyAlreadyExists = true;
	                }
	            }           

	            if(!keyAlreadyExists)
	            {
	                uniqueKeys[uniqueKeyIndex] = keys[i];
	                uniqueKeyIndex++;               
	            }
	            keyAlreadyExists = false;
	        }       
	        return uniqueKeys;
	    }
	}

