package pl.presz.expenseManager.service;

import com.sun.security.auth.UserPrincipal;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.presz.expenseManager.model.User;
import pl.presz.expenseManager.repositorie.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String nick) {
        User user = userRepository.findByNick(nick);
        if (user == null){
            throw new UsernameNotFoundException(nick);
        }
        return new MyUserPrincipal(user);
    }
}
