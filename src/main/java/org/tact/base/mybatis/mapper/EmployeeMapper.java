package org.tact.base.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.tact.base.mybatis.domain.Employee;

@Mapper
public interface EmployeeMapper {
	
	Employee findById(@Param("id") Long id);

	List<Employee> findByEmployerId(@Param("employer_id") Long employerId);

	void addEmployee(Map<String, Object> Params);

	List<Map<String, Object>> byEmployee(Map<String, Object> params);
	
	Integer deleteEmployee(@Param("ID") Long id);
	
	List<Employee> findSkillsByEmployerId(@Param("employer_id") Long employerId);

	
}