

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		String betterE = new String(e.substring(0, 1) + e.substring(2));
		int prime = 0;
		int index = 0;
  	while (prime == 0) {
    		if (isPrime(Double.parseDouble(betterE.substring(index, index + 10)))) {
      			prime = index;
    		}
    		index++;
  	}
		System.out.println(String.valueOf(Double.parseDouble(betterE.substring(prime, prime + 10))));
	}
	

	//Finish this function
	public static boolean isPrime(double d){
		if (d < 2) { return false;}
  		for (int i = 2; i <= Math.sqrt(d); i++) {
    			if (d % i == 0 ) { return false;}
		}
  	return true;
	}
}

