package com.om.improvement.algos;

public class CurrencyDigitToWordConvertor 
{
	public static final String[] NUMNAMES = {"","ONE","TWO","THREE", "FOUR", "FIVE", "SIX", "SEVEN", 
		"EIGHT", "NINE", "TEN", "ELEVEN","TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", 
		"SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN",};
	public static final String[] TENSNAMES = {"", "TEN",
		"TWENTY","THIRTY", "FORTHY", "FIFTY", "SIXTY", "SEVENTY", 
		"EIGHTY", "NINTY"};
	public static final String[] SPECIALNAMES = {"","THOUAND","LAKH", "CRORE"};

	public static String convert(int number)
	{
		if(number == 0)
			return "ZERO";
		String current = "";
        int place = 0;
        
        do 
        {
            int n = number % 1000;
            if (n != 0)
            {
                String s = convertLessThanOneThousand(n);
                current = s + " " + SPECIALNAMES[place] + " "+ current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
		return current.trim();
	}

	private static String convertLessThanOneThousand(int number) 
	{
		String current;

		if (number % 100 < 20){
			current = NUMNAMES[number % 100];
			number /= 100;
		}
		else 
		{
			current = NUMNAMES[number % 10];
			number /= 10;

			current = TENSNAMES[number % 10] + " " +current;
			number /= 10;
		}
		if (number == 0) 
			return current;
		return NUMNAMES[number] + " HUNDRED " + current;
	}

	public static void main(String[] args) 
	{
		System.out.println("0="+convert(0));
		System.out.println("7="+convert(7));
		System.out.println("11="+convert(11));
		System.out.println("20="+convert(20));
		System.out.println("31="+convert(31));
		System.out.println("99="+convert(99));
		System.out.println("100="+convert(100));
		System.out.println("123="+convert(123));
		System.out.println("999="+convert(999));
		System.out.println("1000="+convert(1000));
		System.out.println("1123="+convert(1123));
		System.out.println("9999="+convert(9999));
		System.out.println("10000="+convert(10000));
		System.out.println("10589="+convert(10589));
		System.out.println("102578="+convert(102578));
	}
}
