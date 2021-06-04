package kr.jeje.shopmall.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Generator {
    private String result;

    public MD5Generator(String input) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        MessageDigest mdMD5 = MessageDigest.getInstance("MD5");
        mdMD5.update(input.getBytes("UTF-8"));
        byte[] md5Hash = mdMD5.digest();
        StringBuilder hexMDhash = new StringBuilder();
        for(byte b : md5Hash){
            String hexString = String.format("%02x", b);
            hexMDhash.append(hexString);
        }
        result = hexMDhash.toString();
    }
    public String toString(){
        return result;
    }
}
