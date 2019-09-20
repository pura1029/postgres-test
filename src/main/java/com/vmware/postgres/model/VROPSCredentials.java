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

package com.vmware.postgres.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Insert your comment for VROPSCredentials here
 *
 * @author kumargautam
 */
@Entity
@Table(name = "VROPSCredentials")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class VROPSCredentials extends Credentials implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;

}
