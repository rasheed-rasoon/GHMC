package rough;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StringExamples { 
	
	public static void duplicatedWordsOfString(String inputString )
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string to find duplicated words ");

	 inputString=sc.nextLine();
//	
	String[] words=inputString.split(" ");
	
	HashMap<String,Integer> wordCount=new HashMap<String, Integer>();
	
	for (String word : words) {
		if(wordCount.containsKey(word.toLowerCase()))
				{
			
			wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
			
				}
		else
		{
			wordCount.put(word.toLowerCase(),1);
		}
		
	}

	Set<String> words2=wordCount.keySet();
	
		for(String word2:words2)
		{
		if(wordCount.get(word2)>1)
		{
			
			System.out.println(word2 +" "+wordCount.get(word2));
		}
			
			
		}
		
		
	}
	public static void getNoOfWordsInAString1()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	
	String inputString=sc.nextLine();
	
	String[] words=inputString.trim().split(" ");
	
	System.out.println("number of words are "+ words.length);
	
	
	}
	
	
	public static void getNoOfWordsInAString2()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	
	String inputString=sc.nextLine();
	System.out.println("String length is "+inputString.length());
	int count=1;
	
	for(int i=0;i<=inputString.length()-1;i++)
	{
		
		if((inputString.charAt(i)==' ') && (inputString.charAt(i+1)!=' '))
		{
			count++;
			
		}
		
	}
	
System.out.println("count is "+count);
	
	
	}
	
	public static void countTheTotalNumberOccurrencesOfAGivenCharacterInAString()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		String inputString=sc.nextLine().trim();

		System.out.println("enter a character to count the occurance");
		
		String c=sc.next();
		String inputString2=inputString.replace(c,"");
		
		int totalOccur=inputString.length()-inputString2.length();
		System.out.println("count the total number of occurrences of a given character in a string "+totalOccur);
		
		
		
		
		
		
	}
	
	public static void reverseAString()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string to reverse");
		String inputString=sc.nextLine();
//		for(int i=inputString.length()-1;i>=0;i--)
//		{
//			
//			System.out.print(inputString.charAt(i));
//		}
		char[] c=inputString.toCharArray();
		for(int i=c.length-1;i>=0;i--)
			{
				
				System.out.print(c[i]);
			}
		
	}
	
	
	
	public static void countTheNumberOfOccurrencesOfEachCharacterInAString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to count the number of occurrences of each character in a string");
		String inputString=sc.nextLine();
		
		char [] words=inputString.toCharArray();
		
		HashMap<Character, Integer> charCount=new HashMap<Character,Integer>();
		
		for(char charac:words)
		{
			
		if(charCount.containsKey(charac))
		{
			
		charCount.put(charac,(charCount.get(charac))+1);
		}
		charCount.put(charac,1);	
		}
		
		System.out.println(charCount);
		
		
		
	}
	
	
	public static void removeSpaces()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string to remove spaces");
	
	String inputString=sc.nextLine().trim();
		
	StringBuffer sb=new StringBuffer();
	
	char []letters=inputString.toCharArray();
	
	for (int i = 0; i < letters.length; i++) {
		
		if(letters[i] !=' ' && letters[i] !='\t')
		{
			sb.append(letters[i]);
		}
	}
	System.out.println(sb);
	}
	
	
	public static void countTheDuplicatedNumberOfOccurrencesOfEachCharacterInAString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to count the number of occurrences of each character in a string");
		String inputString=sc.nextLine();
		
		char [] words=inputString.toCharArray();
		
		HashMap<Character, Integer> charCount=new HashMap<Character,Integer>();
		
		for(char charac:words)
		{
			
		if(charCount.containsKey(charac))
		{
			
		charCount.put(charac,charCount.get(charac)+1);
		}
		else
		{
			charCount.put(charac,1);	
		
			}
		}
		
		System.out.println("duplicated characters count with key and key names");
		
		
		Set<Character> letters=charCount.keySet();
		for (Character letter : letters) {
			if(charCount.get(letter)>1)
			{
				System.out.println(letter +":"+charCount.get(letter));
			}
			
		}
	}
	
	public static void anagram(String str1,String str2)
	{
		boolean status = true;
		String copyOfstr1=str1.replaceAll("\\s","");
		String copyOfstr2=str2.replaceAll("\\s","");
		
		if(copyOfstr1.length()!=copyOfstr2.length())
		{
	status=false;	
			
		}
		
		else
		{
			char[] s1array=copyOfstr1.toLowerCase().toCharArray();
			char[] s2array=copyOfstr2.toLowerCase().toCharArray();
			
		Arrays.sort(s1array);
		Arrays.sort(s2array);

		Arrays.equals(s1array,s2array);
		}
		if(status)
		{
			System.out.println("two strings are anagrams");
			
		}
		else {
			System.out.println("Two strings are not anagrams");
		}
		
	}
	
	
		public static void reverseEachWordOfAString()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		
		String inputString=sc.nextLine().trim();
		String reverseString="";
		
		String[] words=inputString.split(" ");
				
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseWord="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				
				reverseWord=reverseWord+word.charAt(j);
				
			}
			
			
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(inputString);
		
		System.out.println(reverseString);
			
		}
		
		public static void stringToIntegerAndIntegerToString()
		{
		int i=1;
		
		String val=Integer.toString(i);
		
				System.out.println(val);
		
				String str="123";
				int k=Integer.parseInt(str);
				System.out.println(k);
				int l=Integer.valueOf(str);
			
		}
		
		
		public static void reverseEachWordOfAString2()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string");
			
		String inputString=sc.nextLine().trim();
		
		String []words=inputString.split(" ");
		
	String reverseString="";

	
	
	for(int i=0;i<words.length;i++)
	{
	
		String word=words[i];
		String reverseWord="";
		for(int j=word.length()-1;j>=0;j--)
		{
			reverseWord=reverseWord+word.charAt(j);
			
		}
		reverseString=reverseString+reverseWord+" ";
	}
	System.out.println(reverseString);
		}
		
			
			
		public static void stringAreImmutable()
		{
		String str="rasheed";
		System.out.println("String is "+str);
		str=str+"ahmed";
		
		System.out.println("String after concatenation"+str);
		
			
			
		}
			
			
		public static void longestSubstringWithoutRepeatingCharacters()
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a string");
			String inputString=sc.nextLine().trim();
			String longestSubString=null;
			int longestSubStringLength=0;
			
			String inputStringWithoutSPaces=inputString.replaceAll(" ","");
			//System.out.println(inputStringWithoutSPaces);
			
			char []word=inputStringWithoutSPaces.toCharArray();
			HashMap<Character,Integer> letterMap=new HashMap<Character,Integer>();
			
			for (int i=0;i<=word.length;i++) {
				char letter=word[i];
				if(!letterMap.containsKey(letter))
				{
					letterMap.put(letter,i);
				}
				else
				{
					i=letterMap.get(letter);
					letterMap.clear();
					}	
			}
			if(letterMap.size()>longestSubStringLength)
			{
				longestSubStringLength=letterMap.size();
				longestSubString=letterMap.keySet().toString();
			}
			
			System.out.println("given string is"+inputString);
			System.out.println("Longest substring without repeating the characters"+longestSubString);
			
		}
		
		public static void fileWriter() throws IOException
		{
			
			FileWriter fileWrite=new FileWriter("D:\\Java programs\\writeFilex.txt");
					BufferedWriter bufferedWriter=new BufferedWriter(fileWrite);
					PrintWriter printWriter=new PrintWriter(bufferedWriter);
					
					printWriter.println();
					printWriter.println("Rasheed : 9491023820");
					printWriter.println("ahmed: 9491023820");
					printWriter.println("sheik:9491023820");
					
					printWriter.close();
					bufferedWriter.close();
					printWriter.close();
					
					
	
		
			
		}
		
		
		public static void numberOfCharactersWordsAndLinesInString() throws IOException
		{
			FileReader fileReader=null;
			BufferedReader bufferdReader=null;
			int charCount=0;
			int wordsCount=0;
			int linescount=0;
			
			try{
				fileReader=new FileReader("D:\\Java programs\\writeFilex.txt");
				bufferdReader=new BufferedReader(fileReader);
			
		
		// BufferedReader(fileReader);
		
		String currentLine=bufferdReader.readLine();
		
		while(currentLine!=null)
		{
			linescount++;
			
			String []words=currentLine.split(" ");
			wordsCount=wordsCount+words.length;
			
			for(String c:words)
			{
				charCount=charCount+c.length();
				
			}
			currentLine=bufferdReader.readLine();	
		}
			
			System.out.println("No of lines are"+linescount);
			System.out.println("words count are"+wordsCount);
			System.out.println("character count are"+charCount);
			}
			catch(IOException ie)
			{
				ie.getStackTrace();
			}
			
			finally{
				try{
			//fileReader.close();
			bufferdReader.close();

				}
				catch(IOException ie)
				{
					
					ie.getStackTrace();
				}
			
			
			
			}
		}
			
	public static void mostRepeatedWordInATextFIle()
	{
		FileReader fileReder=null;
		BufferedReader bufferedReader=null;
		HashMap<String,Integer> wordsCount=new HashMap<String, Integer>();
		
		
		try{
		fileReder=new FileReader("D:\\Java programs\\writeFilex.txt");
		bufferedReader=new BufferedReader(fileReder);
		
		String currentLine=bufferedReader.readLine();
		
		while(currentLine!=null)
		{
			String []words=currentLine.toLowerCase().split(" ");
		for(String word:words)
		{
			if(wordsCount.containsKey(word))
			{
				wordsCount.put(word,wordsCount.get(word)+1);
				
			}
			
			else{
				wordsCount.put(word,1);
			}
		}
		currentLine=bufferedReader.readLine();
		}
		int count=0;
		String MostRepeatedWord=null;
			Set<Entry<String,Integer>> words1=wordsCount.entrySet();	
			
			for(Entry<String,Integer> entry:words1)
			{
				if(entry.getValue()>count)
				{
					MostRepeatedWord=entry.getKey();
					count=entry.getValue();
				
				}
			}
		System.out.println("most repeatd word is  "+MostRepeatedWord);
		System.out.println("Number of occurances  "+count);
		
		}
		
		
		catch(IOException e)
		{
			e.getStackTrace();
		}
		finally {
			try{
				
				fileReder.close();
				bufferedReader.close();
			}
			catch(IOException e)
			{
				e.getStackTrace();
				
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		//StringExamples.duplicatedWordsOfString("rasheed is a tester is a tester");
		//StringExamples.getNoOfWordsInAString1();
		//StringExamples.duplicatedWordsOfString("rasheed is a tester is a tester");
		//StringExamples.getNoOfWordsInAString2();
		//StringExamples.countTheTotalNumberOccurrencesOfAGivenCharacterInAString();
//		/StringExamples.reverseAString();
		//StringExamples.countTheNumberOfOccurrencesOfEachCharacterInAString();
	//	StringExamples.removeSpaces();
		//StringExamples.countTheDuplicatedNumberOfOccurrencesOfEachCharacterInAString();
		
	//StringExamples.anagram("keep","peek");
	//StringExamples.reverseEachWordOfAString();
	
	//StringExamples.reverseEachWordOfAString2();
		//StringExamples.stringAreImmutable();
		//StringExamples.longestSubstringWithoutRepeatingCharacters();
		//StringExamples.fileWriter();
		//StringExamples.numberOfCharactersWordsAndLinesInString();
		
		//StringExamples.textClass();
		StringExamples.mostRepeatedWordInATextFIle();
	}

}
