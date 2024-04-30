package ashokit.config;

import java.util.HashMap;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import ashokit.consants.AppConstants;
import ashokit.entity.Order;

@Configuration
public class KafkaConsumerConfig {
public ConsumerFactory<String, Object>consumerFactory(){
	HashMap<Object, Object> configprops = new HashMap<>();
	configprops.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, AppConstants.HOST);
	configprops.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	configprops.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
	return  new DefaultKafkaConsumerFactory(configprops, new StringDeserializer(), new JsonDeserializer<>());

}
public ConcurrentKafkaListenerContainerFactory<String, Order> kafkaListnerFactory(){
	ConcurrentKafkaListenerContainerFactory<String, Order> factory = 
			new ConcurrentKafkaListenerContainerFactory<>();

	factory.setConsumerFactory(consumerFactory());

	
	return factory;
	
}
}
