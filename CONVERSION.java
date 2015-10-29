package java_encrypt;

/**
 * created by:      Tony Ranieri
 * creation date:   Oct 2015
 */

import java.math.BigInteger; 	

public class CONVERSION	{

	/**
	* takes a string and converts it to an array of strings
	* ex "hello!" goes to ["h","e","l","l","o","!"]
	*/
	public static String[] SPLITTERSTRING(String phrase)	{
		return phrase.split(""); 
	}
	
	/**
	* takes a string and converts it to an array of chars
	* ex "hello!" goes to ['h','e','l','l','o','!']
	*/
	public static char[] SPLITTERCHAR(String phrase)	{
		return phrase.toCharArray(); 
	}
	
	/**
	* takes a bigint and converts it to an array of ints
	* ex "321654" goes to [3,2,1,6,5,4]
	*/
	public static int[] SPLITTERBIG(BigInteger a)	{
		String sa = a.toString();
		String converted[];
		converted = new String[sa.length()];
		converted = sa.split("");
		int qwerty[];
		qwerty = new int[sa.length()];
		for (int i=0; i < sa.length(); i++)	{
			qwerty[i] = Integer.parseInt(converted[i]);
		}
		return qwerty;
	}
	
        /**
	* takes an int and converts it to an array of ints
	* ex "321654" goes to [3,2,1,6,5,4]
	*/
	public static int[] SPLITTERBIG2(int b)	{
            int[] array = new int[4];
            if (b < 1000)	{
                array[0] = 0;
		array[3] = b%10;
		b = b/10;	
		array[2] = b%10;
		b = b/10;
		array[1] = b%10;
		b = b/10;
		return array;	}
            else	{
		array[3] = b%10;
		b = b/10;
		array[2] = b%10;
		b = b/10;
		array[1] = b%10;
		b = b/10;
		array[0] = b%10;
		b = b/10;
		return array;	}
	}
	
	/**
	* takes a string and converts it to an array of ints
	* ex "hello!" goes to "104" "101" "108" "108" "111" "33"
	*/
	public static int[] CONVERT(String[] phrase)	{
		int converted[];
		converted = new int[phrase.length];
		for (int i=0; i < phrase.length; i++)	{
			converted[i] = Integer.parseInt(phrase[i]);
		}
		return converted;
	}
	
	/**
	* takes a two ints and makes an int composed of those two
	* ex 42 and 13 form 4213
        * ex 2 and 13 form 213
        * ex 42 and 3 form 4203
	*/
	public static int COMBINE(int a, int b)	{
		String aa = Integer.toString(a);
		String bb = Integer.toString(b);
		/** set individual cases of single digit int values to double digits ints **/
		if (b == 0)	{
			bb = "00";
			}
		if (b == 1)	{
			bb = "01";
			}
		if (b == 2)	{
			bb = "02";
			}
		if (b == 3)	{
			bb = "03";
			}
		if (b == 4)	{
			bb = "04";
			}
		if (b == 5)	{
			bb = "05";
			}
		if (b == 6)	{
			bb = "06";
			}
		if (b == 7)	{
			bb = "07";
			}
		if (b == 8)	{
			bb = "08";
			}
		if (b == 9)	{
			bb = "09";
			}
		StringBuilder builder = new StringBuilder();
		builder.append(aa);
		builder.append(bb);
		String result = builder.toString();
		int value = Integer.parseInt(result);
		return value;
	}
	
	public static int COMBINE2(int a, int b)	{
		String aa = Integer.toString(a);
		String bb = Integer.toString(b);
		StringBuilder builder = new StringBuilder();
		builder.append(aa);
		builder.append(bb);
		String result = builder.toString();
		int value = Integer.parseInt(result);
		return value;
	}
	
	/** converts int to bigint**/
	public static BigInteger INTTOBIG(int a)	{
		BigInteger b = BigInteger.valueOf(a);
		return b;
	}
	
	/** converts bigint to int **/
	public static int BIGTOINT(BigInteger a)	{
		int b = a.intValue();
		return b;
	}
}
