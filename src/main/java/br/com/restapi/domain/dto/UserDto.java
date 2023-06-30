package br.com.restapi.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String password;
}
