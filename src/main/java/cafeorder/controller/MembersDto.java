package cafeorder.controller;

import cafeorder.domain.Member;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * author {yhh1056}
 * Create by {2020/10/13}
 */
@Getter
@Setter
public class MembersDto {
    private List<Member> members;

    public MembersDto(List<Member> members) {
        this.members = members;
    }

}