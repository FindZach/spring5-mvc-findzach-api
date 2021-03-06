package com.findzach.api.v1.mapper;

import com.findzach.api.domain.User;
import com.findzach.api.v1.model.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Zach S <zach@findzach.com>
 * @since 5/7/2021
 */
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    User UserDtoToUser(UserDTO userDTO);

}
