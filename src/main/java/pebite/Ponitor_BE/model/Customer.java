package pebite.Ponitor_BE.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter// 클래스내 getter 메소드 자동생성
@NoArgsConstructor //기본 생성자 자동추가
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //고객 id = auto increment
    private Long customerId;

//    @Column(length = 500, nullable = false) //거래시작시간 = timestamp, not NULL
//    private String startTime;

 //   @CreationTimestamp //insert문 실행시 현재시간 적용
    @Column(nullable = false)
    private Timestamp startTime;

//    @UpdateTimestamp update쿼리 실행시 자동 업데이트
    @Column(length = 500) //거래완료시간 = timestamp, 추후 update로 값을 채움
    private Timestamp endTime;

    @Column(length = 500, nullable = false)  //atm 번호, not NULL
    private String atmId;

    @Builder
    public Customer(Timestamp startTime, Timestamp endTime, String atmId){
        this.startTime = startTime;
        this.endTime = endTime;
        this.atmId = atmId;
    }

}
