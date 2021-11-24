package nl.rob.backend.controller;

import nl.rob.backend.dto.request.AuthenticationRequest;
import nl.rob.backend.dto.response.AuthenticationResponse;
import nl.rob.backend.service.UserAuthenticateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping(value = "/")
public class AuthenticateController {

    UserAuthenticateService userAuthenticateService;

    @Autowired
    public AuthenticateController(UserAuthenticateService userAuthenticateService) {
        this.userAuthenticateService = userAuthenticateService;
    }

    @GetMapping(value = "/authenticated")
    public ResponseEntity<Object> authenticated(Authentication authentication, Principal principal) {
        return ResponseEntity.ok().body(principal);
    }

    @PostMapping(value = "/authenticate")
    public ResponseEntity<Object> authenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        AuthenticationResponse authenticationResponse = userAuthenticateService.authenticateUser(authenticationRequest);
        return ResponseEntity.ok(authenticationResponse);
    }

}
