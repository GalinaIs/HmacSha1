package com.sbt;

import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0)
            throw new IllegalArgumentException("It is must be at least one one args");

        String key = "PRIE7$oG2uS-Yf17kEnUEpi5hvW/#AFo";
        System.out.println(new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key).hmacHex(args[0]));
    }
}
