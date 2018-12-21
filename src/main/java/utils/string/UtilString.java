package utils.string;

import org.apache.commons.lang3.StringUtils;

public class UtilString {

    private static final String MINUS = "-";

    public boolean naturalNumber(String number) {
        String trimmedStr = number.trim();
        if (StringUtils.isEmpty(number) || isNegativeNumber(trimmedStr) || !StringUtils.isNumeric(trimmedStr)
                || StringUtils.containsOnly(trimmedStr, "0")) {
            throw new IllegalArgumentException("Bad string.");
        }
        return true;
    }

    private boolean isNegativeNumber(String trim) {
        return trim.substring(0, 1).equals(MINUS);
    }

}
