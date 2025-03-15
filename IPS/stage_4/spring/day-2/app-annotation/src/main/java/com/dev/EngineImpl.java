package com.dev;

import org.springframework.stereotype.Component;

@Component
public class EngineImpl implements Engine {
    @Override
    public String getCapacity() {
        return "1000CC";
    }
}
