package CICDTEST.domain;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class MemberDTO {
    private Integer mem_num;
    private String mem_id;
    private int mem_auth;
    private String mem_token;

    public static MemberDTO toDTO(Member entity){
        return MemberDTO.builder()
                .mem_num(entity.getMem_num())
                .mem_id(entity.getMem_id())
                .mem_auth(entity.getMem_auth())
                .mem_token(entity.getMem_token())
                .build();
    }

    public MemberDTO() {
    }

    public MemberDTO(String mem_id, int mem_auth, String mem_token) {
        this.mem_id = mem_id;
        this.mem_auth = mem_auth;
        this.mem_token = mem_token;
    }

    public MemberDTO(Integer mem_num, String mem_id, int mem_auth, String mem_token) {
        this.mem_num = mem_num;
        this.mem_id = mem_id;
        this.mem_auth = mem_auth;
        this.mem_token = mem_token;
    }
}

