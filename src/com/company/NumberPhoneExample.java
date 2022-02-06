package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_REGEX =   "^(\\d{3}[- .]?){2}\\d{4}";

    public NumberPhoneExample() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
