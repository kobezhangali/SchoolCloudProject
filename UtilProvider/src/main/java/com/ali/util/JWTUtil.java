package com.ali.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Map;

public class JWTUtil {
    private static final String SIGN="z@c@#bm^n";
//    生成token
    public static String getToken(Map<String,String> map) throws UnsupportedEncodingException {
        Calendar instance=Calendar.getInstance();
        instance.add(Calendar.SECOND,100);
        JWTCreator.Builder builder = JWT.create();
        map.forEach();
        String token= JWT.create()
                .withClaim("userid",12)
                .withClaim("username","wukong")
                .withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256(SIGN));
        return token;
    }
}
