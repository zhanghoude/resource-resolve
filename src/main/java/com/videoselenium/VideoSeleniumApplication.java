package com.videoselenium;

import com.videoselenium.constant.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author kirito
 * @version 1.0
 * @date 2024/5/14
 * @since 1.0
 */
@SpringBootApplication
public class VideoSeleniumApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoSeleniumApplication.class, args);
        // 替换为你的chromedriver路径
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
    }

}
