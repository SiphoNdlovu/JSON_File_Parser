package validation;

import enums.CountryCode;
import model.address.Address;
import model.address.Country;
import model.address.Detail;
import model.address.ProvinceOrState;

/**
 * @author  Sipho Ndlovu
 * This class is used to validate the address  properties
 */
public class ValidateAddress {

    private  int postalCode;
    private Country country;
    private Detail detail;
    private  boolean valid;
    private String message;
    private ProvinceOrState provinceOrState;


    /**
     * This methods validates each of the important parameters
     * @param address the address object
     * @return the validation status
     */
    public  boolean validateAdressObject(Address address) {
        setPostalCode(address);
        setCountry(address);
        setDetail(address);
        setProvinceOrState(address);
        return isValid();
    }

    /**
     *
     * @return returns the province / state
     */
    public ProvinceOrState getProvinceOrState() {
        return provinceOrState;
    }

    /**
     *
     * @param address the address object
     */
    public void setProvinceOrState(Address address) {

        try {
            //check validation conditions
            if ((null != address.getProvinceOrState())) {
                this.provinceOrState = address.getProvinceOrState();
                setValid(true);
            } else {
               setValid(false);
                setMessage("Invalid province or state details");
            }

        } catch (NullPointerException e) {
            setValid(false);
            address.setProvinceOrState(null);
            setMessage("Invalid province or state details");
        }


    }

    /**
     *
     * @return returns the postal code
     */
    public int getPostalCode() {
        return postalCode;
    }

    /**
     *
     * @param address the address object
     */
    public void setPostalCode(Address address) {

        try {
            //check the validation conditions
           if(null != address.getPostalCode()){
               this.postalCode = Integer.parseInt(address.getPostalCode());
               setValid(true);

           } else {
               setMessage("The postal code is not numeric");
               setValid(false);
           }
        } catch (NumberFormatException nfe) {

            setMessage("The postal code is not numeric");

        }

    }

    /**
     *
     * @return returns the message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message the validation response message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return returns the validation success flag
     */
    public boolean isValid() {
        return valid;
    }

    /**
     *
     * @param valid success state of the validation
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    /**
     *
     * @return returns the country object
     */
    public Country getCountry() {
        return country;
    }

    /**
     *
     * @param address the address object
     */
    public void setCountry(Address address) {

        try {
            if ( null != address.getCountry()) {

                //get the country
                if (address.getCountry().getCode().equals(CountryCode.SOUTH_AFRICA.getStrVal()) ) {
                    // must have province
                    setProvinceOrState(address);

                } else {
                    setValid(false);
                    setMessage(CountryCode.SOUTH_AFRICA.getStrVal() + " is missing a province parameter");
                }


            } else {
                setValid(false);
                setMessage("Address is missing country parameter");
            }
        } catch (Exception exception) {
           setValid(false);
            setMessage("Address is missing country parameter");
        }


    }

    /**
     *
     * @return returns the line detail
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     *
     * @param address the address object
     */
    public void setDetail(Address address) {

        try {
            //at least one line detail must be given
            if (null != address.getDetail()) {

                if ((null != address.getDetail().getLine1())
                        && (null != address.getDetail().getLine2())) {
                    this.detail = address.getDetail();
                    setValid(true);
                } else {
                    setValid(false);
                    setMessage("There must be at least one address line");
                }

            } else {
                setValid(false);
                setMessage("There must be at least one address line");
            }


        } catch (NullPointerException e) {
           setValid(false);
           setMessage("Line details error");
        }

    }
}
