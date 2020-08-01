package enums;

/**
 * Country code enum
 */
public enum CountryCode {

    /**
     * south africa
     */
    SOUTH_AFRICA("ZA"),
    /**
     * Lebanon
     */
    LEBANON("LB");

    /**
     * String value of the enum
     */
    private final String strVal;

    /**
     * Initialisation
     *
     * @param sVal replacement string
     */
    CountryCode(String sVal) {
        strVal = sVal;
    }

    /**
     * DBSettingsEnum String representation
     *
     * @return String
     */

    public String getStrVal() {
        return strVal;
    }
}
