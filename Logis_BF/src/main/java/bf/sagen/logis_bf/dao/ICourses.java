package bf.sagen.logis_bf.dao;


import bf.sagen.logis_bf.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourses extends JpaRepository<Courses, Long> {
}
