package org.tact.base.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.tact.base.mybatis.domain.Employer;

@Mapper
public interface EmployerMapper {
	
	Employer findById(@Param("id") Long id);

	Employer findByName(@Param("name") String name);

	void addEmployer(Map<String, Object> params);

	List<Map<String, Object>> getEmployer(Map<String, Object> params);
	
	Integer deleteEmployer(@Param("ID") Long id);
	
}