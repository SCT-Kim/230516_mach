package mach.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import mach.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/specs")
@Transactional
public class SpecController {

    @Autowired
    SpecRepository specRepository;

    @PutMapping("/specs/search/findBySpecCdOrSpecNm")
    public Object findBySpecCdOrSpecNm(@RequestBody SepcViewQuery query) {
        return specRepository.findBySpecCdOrSpecNm(
            query.getSpecCd(),
            query.getSpecNm()
        );
    }
}
