package w2Assignment3;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I have sloved this according to my understanding of question";
		int count=0;
		for(int i=0;i<s.length(); i++) {
			char ch=s.charAt(i);
			
			try {
				if(ch=='a'||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch=='A'||ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					throw new Exception();
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				count++;
			}
		}
		System.out.println("count of vowels are :- "+count);
	}

}
