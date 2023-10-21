package med.voll.api.medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AlergiasRepository extends JpaRepository<Alergias, Long> {
    Optional<Alergias> findById(Long id);
}
