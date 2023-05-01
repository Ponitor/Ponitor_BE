package pebite.Ponitor_BE.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pebite.Ponitor_BE.model.Customer;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
public class CustomerSaveRequestDto {
    private Timestamp startTime;
    private Timestamp endTime;
    private String atmId;

    @Builder
    public CustomerSaveRequestDto(Timestamp startTime,Timestamp endTime, String atmId){
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
