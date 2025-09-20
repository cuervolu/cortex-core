package dev.cuervolu.cortex.users.infrastructure.repositories;

import dev.cuervolu.cortex.users.domain.Token;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends CrudRepository<Token, Integer> {

  Optional<Token> findByToken(String token);
}