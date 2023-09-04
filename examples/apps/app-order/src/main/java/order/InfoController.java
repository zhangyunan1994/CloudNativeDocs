package order;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

  @Autowired
  private OrderServerProperties orderServerProperties;

  @GetMapping
  public Map<String, String> getOrderServerProperties() {
    HashMap<String, String> info = new HashMap<>();
    info.put("ServerName", orderServerProperties.getServerName());
    info.put("Profile", orderServerProperties.getProfile());
    info.put("currentTime", LocalDateTime.now().toString());
    return info;
  }

}
