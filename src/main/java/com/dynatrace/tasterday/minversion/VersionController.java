package com.dynatrace.tasterday.minversion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	@GetMapping(params = "/minSupported")
	public String getMinSupportedVersion() {
		return "The minimal supported version";
	}
}
