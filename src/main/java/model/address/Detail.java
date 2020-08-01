package model.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author  Sipho Ndlovu
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Detail {

    @JsonProperty(value = "line1")
    private String line1;
    @JsonProperty(value = "line2")
    private String line2;

    /**
     *
     * @return returns an address line
     */
    public String getLine1() {
        return line1;
    }

    /**
     *
     * @param line1 the address line
     * @return returns this instance
     */
    public Detail setLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    /**
     *
     * @return returns the address line
     */
    public String getLine2() {
        return line2;
    }

    /**
     *
     * @param line2 the address line
     * @return returns the current instance
     */
    public Detail setLine2(String line2) {
        this.line2 = line2;
        return this;
    }
}
