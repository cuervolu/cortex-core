package dev.cuervolu.cortex.users.infrastructure.config;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class ApplicationAuditAware implements AuditorAware<String> {
  private static final Long OAUTH2_REGISTRATION_USER_ID = -1L;
  private static final ThreadLocal<String> CURRENT_AUDITOR = new ThreadLocal<>();

  public static void setCurrentAuditor(String userId) {
    CURRENT_AUDITOR.set(userId);
  }

  public static void clearCurrentAuditor() {
    CURRENT_AUDITOR.remove();
  }

  @Override
  @NonNull
  public Optional<String> getCurrentAuditor() {
    return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
        .filter(Authentication::isAuthenticated)
        .map(Authentication::getPrincipal)
        .map(Object::toString);
  }
}