package com.exercicios.refazendoExercicio.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.exercicios.refazendoExercicio.model.Usuario;
import com.exercicios.refazendoExercicio.repository.UsuarioRepository;

@Service
public class UserDetailsSerivceImpl implements UserDetailsService {


	@Autowired

	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName)throws UsernameNotFoundException {
		Optional<Usuario> user = userRepository.findByUsuario(userName);
		user.orElseThrow(()-> new UsernameNotFoundException(userName+ "not found."));
	
		return user.map(UserDetailsImpl::new).get();
	}			
}
