package webservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import enums.AddressType;
import model.address.*;
import response.AddressResponse;
import response.PrettyPrintResponse;
import validation.ValidateAddress;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author  Sipho Ndlovu
 */
@WebServlet( name = "ParseAddressType", urlPatterns = {"/parseAddressType"})
public class ParseAddressType  extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        List<Address> addresses =  new ObjectMapper().readValue(new File("addresses.json"),
                new TypeReference<List<Address>>(){});

        writer.println(new ObjectMapper().writeValueAsString(parseAddressType(addresses)));
        writer.flush();

    }


    /**
     * This function is used to parse a type of address objects
     * @param addresses the list of addresses from file
     * @return returns the list of addresses to parse from file
     */
    public List<PrettyPrintResponse> parseAddressType(List<Address> addresses) {

        AddressResponse addressResponse = new AddressResponse();
        ValidateAddress validateAddress = new ValidateAddress();
        for (Address address : addresses) {
            //this method is used to validate the address parameters / properties

            if (validateAddress.validateAdressObject(address)) {
                if (address.getType().getName().equalsIgnoreCase(AddressType.BUSINESS.getStrVal())
                        || address.getType().getName().equalsIgnoreCase(AddressType.PHYSICAL.getStrVal())
                        || address.getType().getName().equalsIgnoreCase(AddressType.POSTAL.getStrVal())) {


                    //set the required pretty print parameters
                    addressResponse.getAddresses().add(new PrettyPrintResponse()
                            .setType(new Type().setCode(address.getType().getCode()))
                            .setCity(address.getCityOrTown())
                            .setDetail(new Detail()
                                    .setLine1(address.getDetail().getLine1())
                                    .setLine2(address.getDetail().getLine2()))
                            .setCountry(new Country()
                                    .setCode(address.getCountry().getCode())
                                    .setName(address.getCountry().getName()))
                            .setPostalCode(address.getPostalCode())
                            .setProvinceOrState(new ProvinceOrState()
                                    .setCode(address.getProvinceOrState().getCode())
                                    .setName(address.getProvinceOrState().getName())));
                }
            }
        }
        return  addressResponse.getAddresses();
    }
}
