package hello;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.stream.Stream;

@RestController
public class Controller {

    @RequestMapping(value = "/relations/db/**", method = RequestMethod.POST)
    public void redirectRequestPOST(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        String uri = request.getRequestURI();
        String ok_uri = uri.substring(uri.indexOf("relations") + "relations".length());

        response.setStatus(HttpServletResponse.SC_TEMPORARY_REDIRECT);
        response.setHeader("Location", "http://localhost:7474" + ok_uri);
    }


    @RequestMapping(value = "/relations/db/**", method = {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.PUT})
    public void redirectRequest(
            HttpServletRequest request,
            HttpServletResponse httpServletResponse
    ) throws IOException {
        String uri = request.getRequestURI();
        String ok_uri = uri.substring(uri.indexOf("relations") + "relations".length());
        httpServletResponse.sendRedirect("http://localhost:7474" + ok_uri);
    }
}
