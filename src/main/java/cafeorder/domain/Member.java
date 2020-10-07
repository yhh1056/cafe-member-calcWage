package cafeorder.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * author {yhh1056}
 * Create by {2020/09/29}
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "member_name")
    private String name;

    private int time1;
    private int time2;
    private int time3;
    private int time4;
    private int time5;
    private int hourlyWage;

    public Member(String name) {
        this.name = name;
    }

    public int week1Wage() {
        return hourlyWage * time1;
    }

    public int week2Wage() {
        return hourlyWage * time2;
    }

    public int week3Wage() {
        return hourlyWage * time3;
    }

    public int week4Wage() {
        return hourlyWage * time4;
    }

    public int week5Wage() {
        return hourlyWage * time5;
    }

    public int totalWage() {
        int total = time1 + time2 + time3 + time4 + time5;
        return total * hourlyWage;
    }
    public boolean equals(String name) {
        return this.name.equals(name);
    }

    public void addTime(List<Integer> times, int hourlyWage) {
        this.time1 = times.get(0);
        this.time2 = times.get(1);
        this.time3 = times.get(2);
        this.time4 = times.get(3);
        this.time5 = times.get(4);
        this.hourlyWage = hourlyWage;
    }
}