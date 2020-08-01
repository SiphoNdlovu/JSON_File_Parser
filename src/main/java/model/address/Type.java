package model.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author  Sipho Ndlovu
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Type {
    @JsonProperty(value = "code")
    private String code;
    @JsonProperty(value = "name")
    private String name;

    /**
     *
     * @return returns the type code
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code the address type code
     * @return returns this instance
     */
    public Type setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     *
     * @return returns the type name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name the type name
     * @return returns this instance
     */
    public Type setName(String name) {
        this.name = name;
        return this;
    }
}
