package springbootquickstart.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	//Provide the functionality of find without implementation yourself
	//Format: findBy
	public List<Course> findByTopicId(String topicId);
}
