package bf.sagen.logis_bf.dao;

import bf.sagen.logis_bf.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsers extends JpaRepository<Users, Long> {
}
