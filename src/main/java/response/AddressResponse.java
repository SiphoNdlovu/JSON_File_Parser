package response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  Sipho Ndlovu
 */
@JsonRootName(value = "root")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressResponse {

    private List<PrettyPrintResponse> addresses;

    public AddressResponse() {
        addresses = new ArrayList<>();
    }

    /**
     *
     * @return returns the list of addresses parsed
     */
    public List<PrettyPrintResponse> getAddresses() {
        return addresses;
    }

    /**
     *
     * @param addresses the list of parsed addresses
     * @return returns this instance
     */
    public AddressResponse setAddresses(List<PrettyPrintResponse> addresses) {
        this.addresses = addresses;
        return this;
    }
}
