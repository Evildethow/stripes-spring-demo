package org.evildethow.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public String getOsName() {
        return System.getProperty("os.name");
    }
}
