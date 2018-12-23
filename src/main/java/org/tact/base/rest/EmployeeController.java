package org.tact.base.rest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tact.base.mybatis.domain.Employee;
import org.tact.base.mybatis.mapper.EmployeeMapper;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
    private EmployeeMapper employeeMapper;
	
	/**
	 * 
	 * @return
	 * 
	 * Possible urls:
	 * 		http://localhost:1878/employee/
	 */
    @GetMapping(value = "")
    public <T> T testBase() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("one", "two");
        map.put("three", "four");
        map.put("five", "six");
        map.put("seven", "eight");
        
        return (T) map;
    }
    
    /**
     * 
     * @param id
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/employee/by/id
     */
    @GetMapping(value = "/by/id")
    public <T> T getEmployeeById(
    		@RequestParam(value = "id")Long id) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("id", id);
        map.put("employee", employeeMapper.findById(id));
        
        return (T) map;
    }

    
    /**
     * 
     * @param employerId
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/employee/by/employer_id
     * 
     */
    @GetMapping(value = "/by/employer_id")
    public <T> T getEmployeeByEmployerId(
    		@RequestParam(value = "employer_id")Long employerId) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("employer_id", employerId);
        map.put("employee", employeeMapper.findByEmployerId(employerId));
        
        return (T) map;
    }

    /**
     * 
     * @param id
     * @param employer_id
     * @param linkedin
     * @param skills
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/employee/add/employee
     */
    @PostMapping(value = {"/add/employee"})
	public  <T> T addEmployee(
		@RequestParam(value = "employer_id")Long employerId,
		@RequestParam(value = "linkedin") String linkedin,
		@RequestParam(value = "skills") String skills
	)
	{
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("EMPLOYER_ID", employerId);
    	params.put("LINKEDIN", linkedin);
    	params.put("SKILLS", skills);
    	
		employeeMapper.addEmployee(params);
		 
	    Map<String, Object> map = new LinkedHashMap<String, Object>();
	    map.put("apiresult", 0);
	    map.put("apimessage", "ok");
	
	    return (T) map;
	}
    
	/**
	 * 
	 * @param id
	 * @return
	 * 
	 * Possible urls:
	 * 		http://localhost:1878/employee/delete/employee
	 */
	@GetMapping(value = {"/delete/employee"})
	public  <T> T deleteEmployee(
		@RequestParam(value = "id") Long id
	)
	{
		employeeMapper.deleteEmployee(id);
		
	    Map<String, Object> map = new LinkedHashMap<String, Object>();
	    map.put("apiresult", 0);
	    map.put("apimessage", "ok");
	
	    return (T) map;
	}
	/**
	 * 
	 * @param employer_id
	 * @return
	 * 
	 *Possible urls:
	 * 		http://localhost:1878/employee/skills/by/employer_id
	 * 
	 */
	@GetMapping(value = "/skills/by/employer_id")
    public <T> T getSkillsByEmployerId(
    		@RequestParam(value = "employer_id")Long employer_id) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("employer_id", employer_id);
        map.put("employee", employeeMapper.findSkillsByEmployerId(employer_id));
        
        return (T) map;
    }

	/**
	 * 
	 * @param region
	 * @return
	 * 
	 * Possible urls:
	 * 		http://localhost:1878/employee/skills/by/region
	 */
    @GetMapping(value = "skills/by/region")
    public <T> T getEmployeeSkillsByRegion(
    		@RequestParam(value = "region")String region) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("region", region);
        
        List<Employee> employeeList = employeeMapper.findSkillsByRegion(region);
        
        Map<String, Integer> skillMap = new LinkedHashMap<String, Integer>();
        
        for (Employee employee : employeeList) {
			String skills = employee.getSkills();
			
			String[] skillsArray = skills.split(",");
			
			for (int i = 0; i < skillsArray.length; i++) {
				String skill = skillsArray[i].trim().toLowerCase();
						
				if(skillMap.containsKey(skill)) {
					int counter = skillMap.get(skill);
					
					skillMap.put(skill, counter+1);
				} else {
					skillMap.put(skill, 1);
				}
			}
 		}       
        
        map.put("skills", skillMap);
        
        return (T) map;
    }

}