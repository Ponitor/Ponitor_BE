package pebite.Ponitor_BE.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pebite.Ponitor_BE.model.Customer;

@Getter
@NoArgsConstructor
public class CustomerSaveRequestDto {
    private String startTime;
    private String endTime;
    private String atmId;

    @Builder
    public CustomerSaveRequestDto(String startTime, String endTime, String atmId){
        this.startTime = startTime;
        this.endTime = endTime;
        this.atmId = atmId;
    }
    public Customer toEntity(){
        return Customer.builder()
                .startTime(startTime)
                .endTime(endTime)
                .atmId(atmId).
                build();
    }
}
