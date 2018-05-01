package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicContoller {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Freamework", "Spring Framework Description"),
				new Topic("java", "Java Freamework", "Java Framework Description"),
				new Topic("ruby", "Ruby Freamework", "Ruby Framework Description")
			    );
	}
}
