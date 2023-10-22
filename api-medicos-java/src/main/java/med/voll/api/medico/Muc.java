package med.voll.api.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "muc")
public class Muc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long identificador;
    private String muc;

    // Construtores, getters e setters

    public Muc() {
        // Construtor vazio
    }

    public Muc(Long id, String muc) {
        this.identificador = id;
        this.muc = muc;
    }


    public void setIdentificador(Long id) {
        this.identificador = id;
    }

    public String getMuc() {
        return muc;
    }

    public void setMuc(String muc) {
        this.muc = muc;
    }
}
