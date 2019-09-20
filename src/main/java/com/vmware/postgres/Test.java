/*
 * Copyright (c) 2016-2019 VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices
 * and license terms. Your use of these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package com.vmware.postgres;

import javax.annotation.PostConstruct;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vmware.postgres.model.VRACredentials;
import com.vmware.postgres.model.VROPSCredentials;
import com.vmware.postgres.repository.CredentialsRepository;

/**
 * Insert your comment for Test here
 *
 * @author kumargautam
 */
@Component
@Log4j2
public class Test {

    @Autowired
    private CredentialsRepository credentialsRepository;

    @PostConstruct
    public void init() {
        VROPSCredentials credentials = new VROPSCredentials();
        credentials.setName("test");
        credentials.setUserName("vropstest");
        credentials.setPassword("test");
        credentialsRepository.save(credentials);

        log.info("VROPSCredentials : " + credentialsRepository.findByName(credentials.getName()));

        VRACredentials vraCredentials = new VRACredentials();

        vraCredentials.setName("test1");
        vraCredentials.setUserName("vratest");
        vraCredentials.setAccesId("Abc26326536351");
        credentialsRepository.save(vraCredentials);

        VRACredentials vraCredentials1 = new VRACredentials();
        vraCredentials1.setName("test2");
        vraCredentials1.setUserName("vratest1");
        vraCredentials1.setAccesId("Abc2424241421");
        credentialsRepository.save(vraCredentials1);

        log.info("VRACredentials : " + credentialsRepository.findByName(vraCredentials1.getName()));

        log.info("All : " + credentialsRepository.findAll());
    }
}
