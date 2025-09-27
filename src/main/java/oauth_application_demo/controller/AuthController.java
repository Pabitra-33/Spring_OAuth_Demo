package oauth_application_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

	
	// REST end-points, for this end-point we will provide
	// the configuration in the OAuth application we needs to provide
	@GetMapping("/")
	public String doAuthentication() {
		return "Oauth authentication achieved";
	}
}