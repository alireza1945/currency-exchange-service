package ir.practice.microservice.service;

import ir.practice.microservice.model.ExchangeValue;

public interface ExchangeValueService {

    ExchangeValue findByFromAndTo(String from, String to);
}
