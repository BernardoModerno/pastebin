package net.purocodigo.backendcursojava.services;

import net.purocodigo.backendcursojava.shared.dto.UserDto;

public interface UserServiceInterface {
    
    public UserDto createUser(UserDto user);
}
