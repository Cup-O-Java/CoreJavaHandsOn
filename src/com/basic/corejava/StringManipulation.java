package com.basic.corejava;

public class StringManipulation {

	public static void main(String[] args) {
	
		char ch[] = {'A', 'B', 'C', 'D'};
		String str = new String(ch);		
		System.out.println("Character String - "+str); // ABCD
		
		String str1 = "RockStar";		
		System.out.println("Size of String is : "+ str1.length());// 8
		
		String str2 = "Girl";
		System.out.println("Concatanation of 2 strings : "+str1.concat(str2)); // RockStarGirl
		
		System.out.println("Index of character : "+str1.indexOf('a'));//6
		System.out.println("Char at : "+ str2.charAt(3)); // l
		System.out.println("Compairing Strings : "+ str2.compareTo("Girl"));// o/p = 0 means :  true
		System.out.println("Compairing Strings : "+ str1.compareTo("Star"));// o/p = negative value means  : false
		System.out.println("Contain : "+str1.contains("tar"));//ture
		System.out.println("EndsWith : "+ str2.endsWith("rl")); // true
		System.out.println("Replace whole String : "+ str1.replaceAll(str1, "One"));// One
		System.out.println("Replace some chars : "+ str1.replace("ckS", "oms")); // Roomstar
		System.out.println("To Upper case and to Lower case : "+ str1.toUpperCase()+ " & "+str.toLowerCase()); //ROCKSTAR & abcd
		
		str = "ABCD" + "EFG";
		System.out.println("String : "+ str);
		
		
		String str_Sample = "This is Index of Example";
        //Character at position
        System.out.println("Index of character 'x': " + str_Sample.indexOf('x')); // 12
        
        //Character at position after given index value
        System.out.println("Index of character 's' after 3 index: " + str_Sample.indexOf('s', 3)); //3
        
        //Give index position for the given substring
        System.out.println("Index of substring 'is': " + str_Sample.indexOf("is")); //2
         
        //Give index position for the given substring and start index
        System.out.println("Index of substring 'is' form index:" + str_Sample.indexOf("is", 5)); //5
        
        
        //convert String to Integer using parseInt() and valueOf()
        String s = "100";
        int i = Integer.parseInt(s); // int i = Integer.valueOf(s);
        System.out.println("After conversion and adding 15 : " + (i+15));
	}

}

/* output - 
Character String - ABCD
Size of String is : 8
Concatanation of 2 strings : RockStarGirl
Index of character : 6
Char at : l
Compairing Strings : 0
Compairing Strings : -1
Contain : true
EndsWith : true
Replace whole String : One
Replace some chars : Roomstar
To Upper case and to Lower case : ROCKSTAR & abcd
String : ABCDEFG
Index of character 'x': 12
Index of character 's' after 3 index: 3
Index of substring 'is': 2
Index of substring 'is' form index:5
After conversion and adding 15 : 115
*/