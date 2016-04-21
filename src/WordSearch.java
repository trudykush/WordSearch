import java.awt.Component;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
		String[] words=new String[500];  // string creation to store file contents
		ArrayList<String> list=new ArrayList<String>(); 
		String search = null;
		// String myFileName = "myNovel.txt";
		int wordCount = 0;
		String name;
		  name=JOptionPane.showInputDialog(null, "Enter the file name ");
	     	
		     FileReader myFile = new FileReader(name);
		     String searchWord;
		     Scanner scanFile = new Scanner(myFile);

		     searchWord = JOptionPane.showInputDialog("Please enter a word to be Searched").trim();
		         					      
		    int i=0;
			while(scanFile.hasNext()) //Copy contents of the file into array
			{
				String start = scanFile.next();
				words[i]=start;
				i++;
			}
			
			int count=0;
			for(int j=0;j<words.length;j++) //Iterate loop till file length
			{
				
				if(searchWord.equals(words[j]))	//Search for the number of times word exist
				{
					
					String a= " "+words[j-1]+" "+words[j]+" "+words[j+1]+"\n";
					list.add(count, a);
					count++;
				}
			}
				
		
	     	JOptionPane.showMessageDialog(null,list);//Print occurrences
	     	System.exit(0);
	}
	   	  
}

