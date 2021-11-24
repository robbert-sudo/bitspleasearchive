package nl.rob.backend.controller;

import nl.rob.backend.service.LoggedInService;
import nl.rob.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin//(origins = "http://localhost:3000")
// you can add (origins = "http://localhost:4200") to set only one source
@RequestMapping("/loggedIn")

public class LoggedInController {

    @Autowired
    private UserService userService;


    @CrossOrigin
    // you can add (origins = "http://localhost:4200") to set only one source
    @RequestMapping(method = RequestMethod.GET, path = "/{username}")
    //@GetMapping(value = "/{username}")
    public ResponseEntity<Object> getUser(@PathVariable("username") String username) {
        return ResponseEntity.ok().body(LoggedInService.getUser(username));
    }

}
