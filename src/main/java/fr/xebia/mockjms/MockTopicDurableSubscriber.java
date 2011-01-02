package fr.xebia.mockjms;

import javax.jms.JMSException;
import javax.jms.Topic;
import javax.jms.TopicSubscriber;

public class MockTopicDurableSubscriber extends MockMessageConsumer implements
		TopicSubscriber {

	private final String clientID;
	private final Topic topic;

	public MockTopicDurableSubscriber(MockSession session, Topic topic,
			String clientID) {
		super(session, topic);
		this.clientID = clientID;
		this.topic = topic;
	}

	@Override
	public Topic getTopic() throws JMSException {
		return topic;
	}

	@Override
	public boolean getNoLocal() throws JMSException {
		// TODO Manage no local cases
		return false;
	}

	public String getClientID() {
		return clientID;
	}

}
