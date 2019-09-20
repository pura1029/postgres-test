package com.vmware.postgres;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vmware.postgres.model.VRACredentials;
import com.vmware.postgres.model.VROPSCredentials;
import com.vmware.postgres.repository.CredentialsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class PostgresTestApplicationTests {

    @Autowired
    private CredentialsRepository credentialsRepository;

    @Test
    public void contextLoads() {
        VROPSCredentials credentials = new VROPSCredentials();
        credentials.setName("test");
        credentials.setUserName("vropstest");
        credentials.setPassword("test");
        credentialsRepository.save(credentials);

        log.info("VROPSCredentials : " + credentialsRepository.findByName(credentials.getName()));

        VRACredentials vraCredentials = new VRACredentials();

        vraCredentials.setName("test");
        vraCredentials.setUserName("vratest");
        vraCredentials.setAccesId("Abc26326536351");
        credentialsRepository.save(vraCredentials);

        VRACredentials vraCredentials1 = new VRACredentials();
        vraCredentials1.setName("test2");
        vraCredentials1.setUserName("vratest1");
        vraCredentials1.setAccesId("Abc2424241421");
        credentialsRepository.save(vraCredentials1);

        log.info("VRACredentials : " + credentialsRepository.findByName(vraCredentials1.getName()));
    }

}
