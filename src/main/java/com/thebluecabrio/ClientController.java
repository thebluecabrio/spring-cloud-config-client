package com.thebluecabrio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stevenrowney on 22/03/2017.
 */
@RestController
public class ClientController {

    @Value("${epl-team}")
    private String eplTeam;

    @RequestMapping("/team")
    public String showEplTeam() {
        return "The EPL team is: " + eplTeam;
    }


}
