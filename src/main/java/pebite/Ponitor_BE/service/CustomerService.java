package pebite.Ponitor_BE.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pebite.Ponitor_BE.dto.CustomerSaveRequestDto;
import pebite.Ponitor_BE.repository.CustomerRepository;

@RequiredArgsConstructor
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Transactional
    public Long save(CustomerSaveRequestDto requestDto) {
        return customerRepository.save(requestDto.toEntity()).getCustomerId();
    }
}
