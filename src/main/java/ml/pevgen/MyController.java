package ml.pevgen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Polyak on 13.02.2017.
 */
@Controller
@RequestMapping("/m1")
public class MyController {

    @RequestMapping("/**")
    public @ResponseBody String request(){
        return "My response";
    }


}
