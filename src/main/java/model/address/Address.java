package model.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author  Sipho Ndlovu
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("addressLineDetail")
    private Detail detail;
    @JsonProperty("provinceOrState")
    private ProvinceOrState provinceOrState;
    @JsonProperty("cityOrTown")
    private String cityOrTown;
    @JsonProperty("country")
    private Country country;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("suburbOrDistrict")
    private  String suburbOrDistrict;


    /**
     *
     * @return returns the suburbOrDistrict
     */
    public String getSuburbOrDistrict() {
        return suburbOrDistrict;
    }

    /**
     *
     * @param suburbOrDistrict the suburb or district
     * @return returns this instance
     */
    public Address setSuburbOrDistrict(String suburbOrDistrict) {
        this.suburbOrDistrict = suburbOrDistrict;
        return this;
    }

    /**
     *
     * @return returns the address id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id the address id
     * @return returns this instance
     */
    public Address setId(String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return returns the address stype
     */
    public Type getType() {
        return type;
    }

    /**
     *
     * @param type the address type
     * @return returns this instance
     */
    public Address setType(Type type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return returns this instance
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     *
     * @param detail the line detail object
     * @return returns this instance
     */
    public Address setDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    /**
     *
     * @return returns the province or state
     */
    public ProvinceOrState getProvinceOrState() {
        return provinceOrState;
    }

    /**
     *
     * @param provinceOrState the province or state object
     * @return returns this instance
     */
    public Address setProvinceOrState(ProvinceOrState provinceOrState) {
        this.provinceOrState = provinceOrState;
        return this;
    }

    /**
     *
     * @return returns the city or town
     */
    public String getCityOrTown() {
        return cityOrTown;
    }

    /**
     *
     * @param cityOrTown city or town
     * @return returns this instance
     */
    public Address setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
        return this;
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
     * @param country country object
     * @return returns this instance
     */
    public Address setCountry(Country country) {
        this.country = country;
        return this;
    }

    /**
     *
     * @return returns this instance
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     *
     * @param postalCode the postal code
     * @return returns this instance
     */
    public Address setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     *
     * @return returns this instance
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     *
     * @param lastUpdated last updatedTimestamp
     * @return returns this instance
     */
    public Address setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }
}
