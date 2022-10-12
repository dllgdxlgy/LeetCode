package com.lgy.company.qunawang;

import java.math.BigInteger;

/**
 * @author LGY
 * @create 2022-10-12 19:06
 */
public class T2 {

    public int Decrypt (int encryptedNumber, int decryption, int number) {
        BigInteger E = new BigInteger(String.valueOf(encryptedNumber));
        BigInteger N = new BigInteger(String.valueOf(number));

        BigInteger value = E.pow(decryption);

        BigInteger res = value.mod(N);

        return res.intValue();
    }

    public static void main(String[] args) {
        T2 t2 = new T2();
        int decrypt = t2.Decrypt(4296, 1601, 4757);
        System.out.println(decrypt);
    }
}
