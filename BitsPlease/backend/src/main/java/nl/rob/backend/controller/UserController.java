package nl.rob.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping(value = "")
    public ResponseEntity<Object> getMessage () {
            return new ResponseEntity<>("users only endpoint.", HttpStatus.OK);
        }
}
