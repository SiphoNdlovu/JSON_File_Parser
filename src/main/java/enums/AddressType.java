package enums;

public enum AddressType {

    /**
     * postal address
     */
    POSTAL("Postal Address"),
    /**
     * physical address
     */
    PHYSICAL("Physical Address"),
    /**
     * business address
     */
    BUSINESS("Business Address");

    /**
     * String value of the enum
     */
    private final String strVal;

    /**
     * Initialisation
     *
     * @param sVal replacement string
     */
    AddressType(String sVal) {
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
