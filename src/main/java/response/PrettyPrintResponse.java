package response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import model.address.Detail;
import model.address.Type;

/**
 * @author  Sipho Ndlovu
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"Type", "Line details", "city", "province/state","postal code", "country"})
public class PrettyPrintResponse  {

    @JsonProperty(value = "Type")
    private Type type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Line details")
    private Detail detail;
    @JsonProperty(value = "city")
    private String city;
    @JsonProperty(value = "province/state")
    private Type provinceOrState;
    @JsonProperty(value = "postal code")
    private String postalCode;
    @JsonProperty(value = "country")
    private Type country;
    @JsonProperty(value = "message")
    private String message;

    /**
     *
     * @return returns the address type
     */
    public Type getType() {
        return type;
    }

    /**
     *
     * @return returns the response message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message the validation response message
     * @return returns this instance
     */
    public PrettyPrintResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     *
     * @param type the address type
     * @return returns this instance
     */
    public PrettyPrintResponse setType(Type type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @return returns line detail
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     *
     * @param detail the line detail
     * @return returns this instance
     */
    public PrettyPrintResponse setDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    /**
     *
     * @return returns a city name
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city the address city
     * @return returns this instance
     */
    public PrettyPrintResponse setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     *
     * @return returns the address province / state
     */
    public Type getProvinceOrState() {
        return provinceOrState;
    }

    /**
     *
     * @param provinceOrState the province / state
     * @return returns this instance
     */
    public PrettyPrintResponse setProvinceOrState(Type provinceOrState) {
        this.provinceOrState = provinceOrState;
        return this;
    }

    /**
     *
     * @return returns the postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     *
     * @param postalCode the postal code
     * @return returns this instance
     */
    public PrettyPrintResponse setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     *
     * @return returns the country object
     */
    public Type getCountry() {
        return country;
    }

    /**
     *
     * @param country the country object
     * @return returns this instance
     */
    public PrettyPrintResponse setCountry(Type country) {
        this.country = country;
        return this;
    }


}
