package med.voll.api.medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface MucRepository extends JpaRepository<Muc, Long> {
    Optional<Muc> findById(Long id);

    List<Muc> findByIdentificador(Long id);

    List<Muc> findByIdentificadorAndMuc(Long identificador, String muc);


}
