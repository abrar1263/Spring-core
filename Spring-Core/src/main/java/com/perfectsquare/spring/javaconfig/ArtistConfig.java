package com.perfectsquare.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfig {

	@Bean({ "MyArtist" })
	public Artist artist() {
		return new Artist("Abrar", "Ansari");
	}

}
