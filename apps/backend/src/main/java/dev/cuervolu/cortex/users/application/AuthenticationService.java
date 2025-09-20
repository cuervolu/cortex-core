package dev.cuervolu.cortex.users.application;

import dev.cuervolu.cortex.users.api.dto.AuthenticationRequest;
import dev.cuervolu.cortex.users.api.dto.AuthenticationResponse;
import dev.cuervolu.cortex.users.api.dto.RegistrationRequest;

public interface AuthenticationService {

  void register(RegistrationRequest request);

  AuthenticationResponse authenticate(AuthenticationRequest request);

  void activateAccount(String token);
}