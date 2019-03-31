package springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	//simply using Arrays.asList will create an immutable list 
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring framework","d1"),
			new Topic("java","Core java","d2"),
			new Topic("javascript","JavaScript","d3")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(id)) {
				topics.set(i,topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(id)) {
				topics.remove(i);
				return;
			}
		}
	}
	
}
