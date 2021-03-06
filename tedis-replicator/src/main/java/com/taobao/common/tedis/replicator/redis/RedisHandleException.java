/**
 * (C) 2011-2012 Alibaba Group Holding Limited.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 */
package com.taobao.common.tedis.replicator.redis;

public class RedisHandleException extends Exception {

    private static final long serialVersionUID = -9101596261821235497L;

    public RedisHandleException() {
        super();
    }

    public RedisHandleException(String message, Throwable cause) {
        super(message, cause);
    }

    public RedisHandleException(String message) {
        super(message);
    }

    public RedisHandleException(Throwable cause) {
        super(cause);
    }

}
