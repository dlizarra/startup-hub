package com.dlizarra.startuphub.support;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dlizarra.startuphub.AppConfig;
import com.dlizarra.startuphub.DatabaseConfig;
import com.dlizarra.startuphub.SecurityConfig;
import com.dlizarra.startuphub.StartupHubProfiles;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { AppConfig.class, DatabaseConfig.class, SecurityConfig.class })
@WebIntegrationTest
@ActiveProfiles(StartupHubProfiles.TEST)
public abstract class AbstractWebIntegrationTest {

}
