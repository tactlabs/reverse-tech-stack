package org.tact.base.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.tact.base.mybatis.domain.Employee;

@Mapper
public interface EmployeeMapper {
	
	Employee findById(@Param("id") Long id);

	Employee findByEmployer_id(@Param("employer_id") Long employer_id);

	void addEmployee(Map<String, Object> learningParms);

	List<Map<String, Object>> getEmployee(Map<String, Object> params);
	
	Integer deleteEmployee(@Param("ID") Long id);
	
}