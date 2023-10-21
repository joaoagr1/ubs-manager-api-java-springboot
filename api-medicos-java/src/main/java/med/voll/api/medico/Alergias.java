package med.voll.api.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alergias")
public class Alergias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String alergias;

    // Construtores, getters e setters

    public Alergias() {
        // Construtor vazio
    }

    public Alergias(Long id, String alergia) {
        this.id = id;
        this.alergias = alergia;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getAlergia() {
        return alergias;
    }

    public void setAlergia(String alergia) {
        this.alergias = alergia;
    }
}
