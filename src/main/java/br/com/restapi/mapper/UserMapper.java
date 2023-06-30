package br.com.restapi.mapper;

import br.com.restapi.domain.User;
import br.com.restapi.domain.dto.UserDto;

public class UserMapper {

    public static User toEntity(UserDto dto) {
        return User.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .build();
    }

    public static UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
}
