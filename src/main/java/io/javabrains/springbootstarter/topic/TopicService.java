package io.javabrains.springbootstarter.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Freamework", "Spring Framework Description"),
			new Topic("java", "Java Freamework", "Java Framework Description"),
			new Topic("ruby", "Ruby Freamework", "Ruby Framework Description")
		    );
	
	public List<Topic> getAllTopics() {
		return topics;
	}
}
