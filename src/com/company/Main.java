package com.company;

public class Main {
    private static NumberPhoneExample numberPhoneExample;
    public static final String[] validnumberPhoneExample = new String[] {"082 967 3833"};
    public static final String[] invalidnumberPhoneExample = new String[] { "8482 967 3833, A02 4183 4123" };

    public static void main(String[] args) {
        numberPhoneExample = new NumberPhoneExample();
        for (String name : validnumberPhoneExample) {
            boolean isvalid = numberPhoneExample.validate(name);
            System.out.println("name is " + name +" is valid: "+ isvalid);
        }
        for (String phone : invalidnumberPhoneExample) {
            boolean isvalid = numberPhoneExample.validate(phone);
            System.out.println("phone is " + phone +" is valid: "+ isvalid);
        }
    }
}
