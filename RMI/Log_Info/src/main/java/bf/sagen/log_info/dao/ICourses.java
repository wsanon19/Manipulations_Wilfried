package bf.sagen.log_info.dao;

import bf.sagen.log_info.entities.CamionsImpl;
import bf.sagen.log_info.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourses extends JpaRepository<Courses, Long> {
}
