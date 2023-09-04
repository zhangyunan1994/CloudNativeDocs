package order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 不要修改这里类里面的变量名，除非你知道你能改干净
 */
@ToString
@Setter
@Getter
@ConfigurationProperties("orders")
@Configuration
public class OrderServerProperties {
  private String serverName;
  private String profile;
}
