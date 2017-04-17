package com.apex.topicServicePackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TopicRestController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(value = "/topics", method = RequestMethod.GET)
	private List<Topic_VO> getAllTopic() {
		return topicService.getAllTopics();
	}

	@RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
	private Topic_VO getTopic(@PathVariable int id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	private void addTopic(@RequestBody Topic_VO topic_VO) {
		topicService.addTopic(topic_VO);
	}
	
	@RequestMapping(value = "/topics", method = RequestMethod.PUT)
	private void updateTopic( @RequestBody Topic_VO topic_VO) {
		 topicService.updateTopic(topic_VO);
	}
	
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
	private void deleteTopic(@PathVariable int id) {
		 topicService.deleteTopic(id);
	}
	
	

}
