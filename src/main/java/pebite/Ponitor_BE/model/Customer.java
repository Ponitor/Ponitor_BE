package pebite.Ponitor_BE.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter// 클래스내 getter 메소드 자동생성
@NoArgsConstructor //기본 생성자 자동추가
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //고객 id = auto increment
    private Long customerId;

    @Column(length = 500, nullable = false) //거래시작시간 = timestamp, not NULL
    private String startTime;

    @Column(length = 500) //거래완료시간 = timestamp, 추후 update로 값을 채움
    private String endTime;

    @Column(length = 500, nullable = false)  //atm 번호, not NULL
    private String atmId;

    @Builder
    public Customer(String startTime, String endTime, String atmId){
        this.startTime = startTime;
        this.endTime = endTime;
        this.atmId = atmId;
    }

}
