package model;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Sender {

    private static final String EXCHANGE_NAME = "test_exchange_directs";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("root");
        factory.setPassword("12345");
        factory.setPort(3306);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "" );
        String sql = "SELECT * FROM sklad";
        String routingKey = "error";

        channel.basicPublish(EXCHANGE_NAME, routingKey, null, sql.getBytes());
        System.out.println("vivod：" + sql);

        channel.close();
        connection.close();
    }
}