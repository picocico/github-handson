package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

  public static final String MOBILE_PHONE_NUMBER_PATTERN = "^(070|080|090)-\\d{4}-\\d{4}$";
  public static final String FIXED_PHONE_NUMBER_PATTERN = "^(0[1-9]{1,3})-\\d{1,4}-\\d{4}$";
  public static final String INTERNATIONAL_PHONE_NUMBER_PATTERN =
      "^\\+\\d{1,3}-\\d{1,4}-\\d{4,10}-\\d{4,10}$";

  public boolean isMobilePhoneNumber(String phoneNumber) {
    return isValid(phoneNumber, MOBILE_PHONE_NUMBER_PATTERN);
  }

  public boolean isFixedPhoneNumber(String phoneNumber) {
    return isValid(phoneNumber, FIXED_PHONE_NUMBER_PATTERN);
  }

  public boolean isInternationalPhoneNumber(String phoneNumber) {
    return isValid(phoneNumber, INTERNATIONAL_PHONE_NUMBER_PATTERN);
  }

  private boolean isValid(String phoneNumber, String pattern) {
    if (phoneNumber == null || phoneNumber.isEmpty()) {
      return false;
    }

    Pattern compiledPattern = Pattern.compile(pattern);
    Matcher matcher = compiledPattern.matcher(phoneNumber);
    return matcher.matches();
  }
}
