package com.apex.topicServicePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepositary topicRepositary;
	
	public List<Topic_VO> getAllTopics() {
		List<Topic_VO> topic = new ArrayList<>();
		topicRepositary.findAll().forEach(topic::add);
		return topic;
	}
	

	public Topic_VO getTopic(int id) {
		return topicRepositary.findOne(id);
	}

	public void addTopic(Topic_VO topic_VO) {
		topicRepositary.save(topic_VO);
		
	}

	/* (non-Javadoc)
	 * @see service.InterfaceTopicService#updateTopic(java.lang.String, vo.Topic_VO)
	 */
	public void updateTopic( Topic_VO vo) {
		topicRepositary.save(vo);
	}

	public void deleteTopic(int id) {
		topicRepositary.delete(id);
		
	}
}
