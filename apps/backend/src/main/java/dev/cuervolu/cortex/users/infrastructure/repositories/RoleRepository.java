package dev.cuervolu.cortex.users.infrastructure.repositories;

import dev.cuervolu.cortex.users.domain.Role;
import dev.cuervolu.cortex.users.domain.RoleName;
import dev.cuervolu.cortex.users.domain.User;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {

  Optional<Role> findByName(RoleName name);



}
