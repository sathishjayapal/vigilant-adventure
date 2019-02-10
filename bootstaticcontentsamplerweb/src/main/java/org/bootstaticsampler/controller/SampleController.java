package org.bootstaticsampler.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
@Controller
public class SampleController {

    static final Log LOG = LogFactory.getLog(SampleController.class);

    @GetMapping(value = {"static/main/allList"})
    public String getGroups(HttpSession session) {
        LOG.debug("The servlet context " + session.getServletContext().getRealPath("/testdata1"));
        return "/main/index.html";

    }

    @GetMapping(value = {"/static/main"})
    public String getTestPath(HttpSession session) {
        LOG.debug("The servlet context " + session.getServletContext().getRealPath("/testdata"));
        return "/main/testdata.html";
    }
}