package com.utils.sign;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tp on 2016/12/22.
 */

public class RegularUtil {

    public static boolean isPhoneNumberValid(String phoneNumber) {
        boolean isValid = false;
        String expression = "^[1](([3-9])[0-9])[0-9]{8}$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }

}
