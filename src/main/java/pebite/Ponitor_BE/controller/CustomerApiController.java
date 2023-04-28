package pebite.Ponitor_BE.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pebite.Ponitor_BE.dto.CustomerSaveRequestDto;
import pebite.Ponitor_BE.service.CustomerService;

@RequiredArgsConstructor
@RestController
public class CustomerApiController {

    private final CustomerService customerService;

    @PostMapping("/users/{customer}/lists")
    public Long save(@RequestBody CustomerSaveRequestDto requestDto){
        return customerService.save(requestDto);
    }
}
