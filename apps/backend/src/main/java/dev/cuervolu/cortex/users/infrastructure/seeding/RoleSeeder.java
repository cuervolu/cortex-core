package dev.cuervolu.cortex.users.infrastructure.seeding;

import dev.cuervolu.cortex.users.domain.Role;
import dev.cuervolu.cortex.users.domain.RoleName;
import dev.cuervolu.cortex.users.infrastructure.repositories.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleSeeder implements CommandLineRunner {

  private static final Logger log = LoggerFactory.getLogger(RoleSeeder.class);
  private final RoleRepository roleRepository;

  public RoleSeeder(RoleRepository roleRepository) {
    this.roleRepository = roleRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    seedRole(RoleName.ROLE_USER);
    seedRole(RoleName.ROLE_ADMIN);
    seedRole(RoleName.ROLE_CONTENT_CREATOR);
  }

  private void seedRole(RoleName roleName) {
    if (roleRepository.findByName(roleName).isEmpty()) {
      roleRepository.save(new Role(roleName));
      log.info("Seeding role: {}", roleName);
    }
  }
}