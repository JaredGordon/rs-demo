package com.pivotal.rs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by jgordon on 2/19/16.
 */

@RestController
public class Bounce {

    private static final Logger LOG = Logger.getLogger(Bounce.class);

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String ping(@RequestHeader HttpHeaders headers) throws IOException {
        LOG.info("request received.");
        return toJson(headers);
    }

    private String toJson(Object o) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(o);
    }
}
