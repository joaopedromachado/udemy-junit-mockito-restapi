package br.com.restapi.service;

import br.com.restapi.domain.User;
import br.com.restapi.domain.dto.UserDto;
import br.com.restapi.mapper.UserMapper;
import br.com.restapi.repository.UserRepository;
import br.com.restapi.service.expcetion.DataIntegratyViolationException;
import br.com.restapi.service.expcetion.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(ObjectNotFoundException::new);

        return UserMapper.toDto(user);
    }

    public UserDto saveUser(UserDto userDto) {
        findByEmail(userDto);
        User user = UserMapper.toEntity(userDto);

        return UserMapper.toDto(userRepository.save(user));
    }

    public void deleteUserById(Long id) {
        userRepository.findById(id)
                .orElseThrow(ObjectNotFoundException::new);
        userRepository.deleteById(id);
    }

    public void findByEmail(UserDto dto) {
        Optional<User> user = userRepository.findByEmail(dto.getEmail());
        if(user.isPresent()) {
            throw new DataIntegratyViolationException();
        }
    }

}
