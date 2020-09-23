package com.monster.backend.converter;

import java.util.List;

import org.mapstruct.Mapper;
/***
 * 
 * @author jefersson : jeferssonserrano00@gmail.com
 *
 */
public interface Converter<Entity,DTO> {

	public Entity toEntity(DTO dto);

	public DTO toDTO(Entity entity);

	public List<DTO> toDTOList(Iterable<Entity> entityList);

	public List<Entity> toEntityList(Iterable<DTO> dtoList);

}
