package com.jaagro.utils;

import java.util.UUID;

/**
 * @author tony
 */
public class UuidUtils {

    public static String getUuid() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString();
        uuidStr = uuidStr.replace("-", "");
        return uuidStr;
    }
}
