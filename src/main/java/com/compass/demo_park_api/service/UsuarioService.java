package com.compass.demo_park_api.service;

import org.springframework.stereotype.Service;

import com.compass.demo_park_api.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UsuarioService {
	
	private final UsuarioRepository usuarioRepository;
	
}
