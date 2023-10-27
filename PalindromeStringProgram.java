String Original= "abcba";
		String Reverse="";
		
		for (int i= Original.length()-1; i>=0;i--) {
			Reverse=Reverse+Original.charAt(i);
		}
		System.out.println(Reverse);
	
		//System.out.println(Original.equals(Reverse)); // true // false
		
		if(Original.equals(Reverse)) {
			System.out.println("The entered String is Palindrome");
		}else {
			System.out.println("The entered String is not Palindrome");
		}
