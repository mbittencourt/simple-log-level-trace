package br.com.messiasbittencourt.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("TestResource")
public class TestResource {

    private static final Logger log = LoggerFactory.getLogger(TestResource.class);

    /**
     * Sequence of logs:
     * OFF << FATAL << ERROR << WARN << INFO << DEBUG << TRACE
     * @return
     */
    @GetMapping(value = "/test")
    public String doSomething(){
        log.trace("TRACE log");
        log.debug("DEBUG log");
        log.info("INFO log");
        log.error("ERROR log");
        return "Check logfile!";
    }

}
