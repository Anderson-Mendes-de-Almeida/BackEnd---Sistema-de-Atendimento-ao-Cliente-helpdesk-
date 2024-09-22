package br.com.manualdaprogramacao.helpdesk.service;

import br.com.manualdaprogramacao.helpdesk.domain.User;
import br.com.manualdaprogramacao.helpdesk.entity.UserEntity;
import br.com.manualdaprogramacao.helpdesk.exception.BusinessException;
import br.com.manualdaprogramacao.helpdesk.mapper.UserMapper;
import br.com.manualdaprogramacao.helpdesk.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    public User createUser(User newUser) {

        Optional<UserEntity> existentUser = userRepository.findByUsername((newUser.getUsername()));
           if   (existentUser.isPresent()){
               throw new BusinessException("This username is alredy in use in the suytem");
           }

        UserEntity entity = mapper.toEntity(newUser);
        entity.setCreatedAt(new Date());
        entity = userRepository.save(entity);
        return mapper.toDomain(entity);

        //Todo o processo ta ok, quando chega no save, não salva

    }


}
