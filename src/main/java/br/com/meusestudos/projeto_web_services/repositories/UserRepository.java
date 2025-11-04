package br.com.meusestudos.projeto_web_services.repositories;

import br.com.meusestudos.projeto_web_services.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
