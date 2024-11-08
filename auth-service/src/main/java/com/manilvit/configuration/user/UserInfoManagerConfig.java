package com.manilvit.configuration.user;

import com.manilvit.configuration.user.UserInfoConfiguration;
import com.manilvit.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoManagerConfig implements UserDetailsService {

    private final UserInfoRepository userInfoRepository;
    @Override
    public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
        return userInfoRepository
                .findByEmailId(emailId)
                .map(UserInfoConfiguration::new)
                .orElseThrow(()-> new UsernameNotFoundException("UserEmail: " + emailId + " does not exist"));
    }


}