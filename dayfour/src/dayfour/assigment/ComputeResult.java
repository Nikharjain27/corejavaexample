package dayfour.assigment;

public class ComputeResult { 
			    public static void main(String[] args) {
			        String original = "software";
			        StringBuffer result = new StringBuffer("hi");
			        int index = original.indexOf('a');
			
			       
			       result.setCharAt(0, original.charAt(0));
			       System.out.println(result);
			       
			       result.setCharAt(1, original.charAt(original.length()-1));
			       System.out.println(result);
			       
			       System.out.println(result.insert(1, original.charAt(4)));
			        
			       System.out.println(result.append(original.substring(1,4)));
					
			       System.out.println(result.insert(3, (original.substring(index, index+2) + " ")));
		
			    }
			}
