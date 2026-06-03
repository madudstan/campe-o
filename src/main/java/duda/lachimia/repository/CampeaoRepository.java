package duda.lachimia.repository;

import duda.lachimia.model.Campeao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CampeaoRepository extends JpaRepository<Campeao, UUID> {

    List<Campeao> findByNome(String nome);

}