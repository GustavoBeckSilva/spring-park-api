package com.compass.demo_park_api.service;

import org.springframework.stereotype.Service;

import com.compass.demo_park_api.entity.Usuario;
import com.compass.demo_park_api.repository.UsuarioRepository;

import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
	@Transactional
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@Transactional(readOnly = true)
	public Usuario buscarPorId(Long id){
		return usuarioRepository.findById(id).orElseThrow(
				() -> new RuntimeException("Usuário não encontrado."));
	}
	
	@Transactional
	public Usuario editarSenha(Long id, String password) {
		Usuario user = buscarPorId(id);
		user.setPassword(password);
		return user;
	}
	
}
