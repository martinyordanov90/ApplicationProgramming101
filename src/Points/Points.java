package Points;

import java.util.Scanner;

public class Points {

	public static void main(String[] args) {
		
		int polarity = 1;
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		String data = scanner.next();
		
		for (int i = 0; i < data.length(); i++) {
			
			if(data.charAt(i) == '>'){
				x = x + polarity;
			}
			else if(data.charAt(i) == '<'){
				x = x - polarity;
			}
			else if(data.charAt(i) == '^'){
				y = y - polarity;
			}
			else if(data.charAt(i) == 'v'){
				y = y + polarity;
			}
			if(data.charAt(i) == '~'){
				polarity *= -1;
			}
		
			System.out.println(x + "," + y);
		}

	}

}

