import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class LearnJedis {
    private Jedis jedis;

    @BeforeEach
    public void setup() {
        jedis = new Jedis();
        jedis.select(0);
    }

    @Test
    public void test() {
        jedis.set("name2", "zlf");
        System.out.println("name=" + jedis.get("name"));
        System.out.println("name2=" + jedis.get("name2"));

    }

    @AfterEach
    public void close() {
        if (jedis != null) {
            jedis.close();
        }
    }

}
