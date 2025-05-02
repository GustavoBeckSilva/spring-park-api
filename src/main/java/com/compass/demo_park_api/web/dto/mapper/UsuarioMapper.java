package com.compass.demo_park_api.web.dto.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

import com.compass.demo_park_api.entity.Usuario;
import com.compass.demo_park_api.web.dto.UsuarioCreateDto;
import com.compass.demo_park_api.web.dto.UsuarioResponseDto;

public class UsuarioMapper {
	
	public static Usuario toUsuario(UsuarioCreateDto createDto) {
		return new ModelMapper().map(createDto, Usuario.class);
	}
	
	public static UsuarioResponseDto toDto(Usuario user) {
		String role = user.getRole().name().substring("ROLE_".length());
		ModelMapper mapperMain = new ModelMapper();
		TypeMap<Usuario, UsuarioResponseDto> propertyMapper =
		mapperMain.createTypeMap(Usuario.class, UsuarioResponseDto.class);
		propertyMapper.addMappings(
		mapper -> mapper.map(src -> role, UsuarioResponseDto::setRole)
		);
		return mapperMain.map(user, UsuarioResponseDto.class);
		}
	
}
