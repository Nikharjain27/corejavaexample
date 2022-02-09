package dayfour.assigment;

public class Count {
	
		public static void main(String[] args) {
			String str =  "Nikhar Jain";
			int vowels = 0,consonants =0;
			
			str=str.toLowerCase();
			for(int i=0;i< str.length();i++) {
				
				if(str.charAt(i)=='a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) =='u') {
					vowels++;
				}else if(str.charAt(i) >= 'a' && str.charAt(i) <='z') {
					consonants++;
				}
			}
			System.out.println("Number of vowels: " + vowels);
			System.out.println("Number of consonants: " + consonants);
		}

	}
