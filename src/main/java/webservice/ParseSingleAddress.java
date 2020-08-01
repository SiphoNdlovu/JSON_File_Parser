package webservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.address.*;
import response.PrettyPrintResponse;
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
 * This servlet parses a single address in the given file
 */
@WebServlet( name = "ParseSingleAddress", urlPatterns = {"/parseSingleAddress"})
public class ParseSingleAddress extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json");

        PrintWriter writer = resp.getWriter();
        List<Address> addresses =  new ObjectMapper().readValue(new File("addresses.json"),
                new TypeReference<List<Address>>(){});

        writer.println(prettyPrintAddress(addresses.get(0)));
        writer.flush();

    }


    /**
     * Pretty Prints a single address
     * @param address the address to parse
     * @return returns the pretty print format of the address
     * @throws IOException
     */
    public String prettyPrintAddress(Address address) throws IOException {

        //set the parameters needed for the pretty print and return that
        PrettyPrintResponse  prettyPrintResponse =   new PrettyPrintResponse()
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
                       .setName(address.getProvinceOrState().getName()));

        return  new ObjectMapper().writeValueAsString(prettyPrintResponse);
    }



}
