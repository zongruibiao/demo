package com.ule.fenxiao.action;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Optional;

/**
 * Created by zongruibiao on 2017/4/1.
 */
public class FxListingConsumerHandler {
    @KafkaListener(topics = {"test01"})
        public void listen(ConsumerRecord<?, ?> record) {
            Optional<?> kafkaMessage = Optional.ofNullable(record.value());
            if (kafkaMessage.isPresent()) {
                Object message = kafkaMessage.get();
                System.out.println("this is the testTopic send message:" + message);
            }
    }
}
