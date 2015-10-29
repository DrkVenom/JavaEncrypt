package java_encrypt;

/**
 * created by:      Tony Ranieri
 * creation date:   Oct 2015
 */

import static java.lang.Math.pow;	/** use to raise powers **/
import java.math.BigInteger;


class COMPUTATIONS	{

    /**
    * returns the computed value n=pq 
    * where p,q are doubles
    */
    public static BigInteger MULTIPLY(double p, double q) {
	return BigInteger.valueOf((int)(p*q));	
    }

    /**
    * returns the computed value phi(n)=(p-1)(q-1)
    * where p,q are doubles
    * assumes here that p and q are prime
    */
    public static BigInteger EULER(double p, double q) {
	return BigInteger.valueOf((int)((p-1)*(q-1)));	
    }

    /**
    * returns the computed value of a block of ciphertext
    * for use in main, blocks should be less than 10000
    * accepts a block of plaintext, the public key "e" and the composite number n
    */
    public static BigInteger ENCIPHER(double block, double key, BigInteger composite) {	
	BigInteger temp = BigInteger.valueOf((int)pow(block,key));
	BigInteger ciphertext = temp.mod(composite);
	return ciphertext;	
    }

    /**
    * returns the computed value or a block of plaintext
    * for use in main, blocks should be less than 10000
    * accepts a block of ciphertext, the private key "d" and the composite number n
    */
    public static BigInteger DECIPHER(double message, double key, BigInteger composite) {
	BigInteger temp = BigInteger.valueOf((int)pow(message,key));
	BigInteger plaintext = temp.mod(composite);
	return plaintext;	
    }

    /**
    * test to see if a given value is prime, uses brute force
    * input is a double
    */
    public static boolean ISPRIME(double n) {
        if(n < 2) {
            return false;
        }
        if(n == 2 || n == 3) {
            return true;
        }
        if(n%2 == 0 || n%3 == 0) {
            return false;
        }
        long sqrtN = (long)Math.sqrt(n)+1;  /** set the limit of iterations as sqrt(n)+1 **/
        for(long i = 6L; i <= sqrtN; i += 6) {
        if(n%(i-1) == 0 || n%(i+1) == 0) 
		return false;
        }
        return true;
    }
    
    /**
    * test to see if a given value is prime, uses a probabilistic approach
    * input is a bigint
    * int c is the certainty, 1 - (1/2)^c, speed or result is proportional to c
    */
    public static boolean ISPRIME2(BigInteger n, int c) {
        return n.isProbablePrime(c);
    }

}
