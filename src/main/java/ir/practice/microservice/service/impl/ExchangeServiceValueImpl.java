package ir.practice.microservice.service.impl;

import ir.practice.microservice.model.ExchangeValue;
import ir.practice.microservice.repository.ExchangeValueRepository;
import ir.practice.microservice.service.ExchangeValueService;
import org.springframework.stereotype.Service;

@Service
public class ExchangeServiceValueImpl implements ExchangeValueService {

    private ExchangeValueRepository exchangeValueRepository;

    public ExchangeServiceValueImpl(ExchangeValueRepository exchangeValueRepository) {
        this.exchangeValueRepository = exchangeValueRepository;
    }

    @Override
    public ExchangeValue findByFromAndTo(String from, String to) {
        return exchangeValueRepository.findByFromAndTo(from, to);
    }
}
