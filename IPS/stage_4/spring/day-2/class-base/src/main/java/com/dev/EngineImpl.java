package com.dev;

import org.springframework.stereotype.Component;

@Component
public class EngineImpl implements Engine{
    @Override
    public String showCapacity() {
        return "1000cc";
    }
}
