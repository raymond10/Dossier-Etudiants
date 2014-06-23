/**
 * 
 */
package etudiants.utt.fr.util;

import java.io.UnsupportedEncodingException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/**
 * @author Raymond NANEON <raymond.naneon at utt.fr>
 * 
 */
public class PwdDecrypter {
	Cipher ecipher;
	Cipher dcipher;

	// 8-byte Salt
	byte[] salt = { (byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32,
			(byte) 0x56, (byte) 0x35, (byte) 0xE3, (byte) 0x03 };

	// Iteration count
	int iterationCount = 19;

	public PwdDecrypter() {
		// TODO Auto-generated constructor stub
	}

	public PwdDecrypter (String passPhrase) {
		// TODO Auto-generated constructor stub
		try {
			// Create the key
			KeySpec keySpecHost = new PBEKeySpec(passPhrase.toCharArray(), salt,
					iterationCount);
			SecretKey keyHostName = SecretKeyFactory.getInstance("PBEWithMD5AndDES")
					.generateSecret(keySpecHost);
			ecipher = Cipher.getInstance(keyHostName.getAlgorithm());
			dcipher = Cipher.getInstance(keyHostName.getAlgorithm());

			// Prepare the parameter to the ciphers
			AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt,iterationCount);

			// Create the ciphers
			ecipher.init(Cipher.ENCRYPT_MODE, keyHostName, paramSpec);
			dcipher.init(Cipher.DECRYPT_MODE, keyHostName, paramSpec);
		} catch (java.security.InvalidAlgorithmParameterException e) {
		} catch (java.security.spec.InvalidKeySpecException e) {
		} catch (javax.crypto.NoSuchPaddingException e) {
		} catch (java.security.NoSuchAlgorithmException e) {
		} catch (java.security.InvalidKeyException e) {
		}
	}

	public String encrypt(String str) {
		try {
			//DesEncrypter(str);
			// Encode the string into bytes using utf-8
			byte[] utf8 = str.getBytes("UTF8");

			// Encrypt
			byte[] enc = ecipher.doFinal(utf8);

			// Encode bytes to base64 to get a string
			return new sun.misc.BASE64Encoder().encode(enc);
		} catch (javax.crypto.BadPaddingException e) {
		} catch (IllegalBlockSizeException e) {
		} catch (UnsupportedEncodingException e) {
		} 
		return null;
	}
	
	public String decrypt(String str) {
		try {
			//DesEncrypter(str);
			// Decode base64 to get bytes
			byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);

			// Decrypt
			byte[] utf8 = dcipher.doFinal(dec);

			// Decode using utf-8
			return new String(utf8, "UTF8");
		} catch (javax.crypto.BadPaddingException e) {
		} catch (IllegalBlockSizeException e) {
		} catch (UnsupportedEncodingException e) {
		} catch (java.io.IOException e) {
		}
		return null;
	}
}
