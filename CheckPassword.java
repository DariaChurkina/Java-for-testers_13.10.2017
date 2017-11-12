package com.daria.train;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword {

    public static boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile("(\\w{8,})");
        Matcher matcher = pattern.matcher(password);
        boolean isPasswordOk = matcher.matches();
        return isPasswordOk;
    }
}
