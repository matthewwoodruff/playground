package com.thouhtworks.api;

import com.rabbitmq.client.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class RabbitQueueTest {

    private static Logger logger = LoggerFactory.getLogger(RabbitQueueTest.class);

    private static final String MY_QUEUE = "my-queue";

    private Channel channel;
    private Connection connection;
    private Consumer consumer;
    private CountDownLatch latch;

    @Before
    public void setUp() throws Exception {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        connection = connectionFactory.newConnection();
        channel = connection.createChannel();

        latch = new CountDownLatch(1);

        consumer = new DefaultConsumer(channel) {

            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                logger.info("Received:  '" + new String(body) + "'");
                latch.countDown();
                getChannel().basicNack(1l, true, true);
            }
        };
        channel.queueDeclare(MY_QUEUE, false, true, true, null);
        channel.basicConsume(MY_QUEUE, consumer);
    }

    @Test
    public void shouldAdd() throws Exception {
        String message = "Hello World!";
        channel.basicPublish("", MY_QUEUE, null, message.getBytes());
        logger.info("Sent:  '" + message + "'");
        latch.await();
    }

    @After
    public void tearDown() throws Exception {
        channel.close();
        connection.close();
    }
}
