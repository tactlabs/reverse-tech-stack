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
import org.tact.base.mybatis.mapper.EmployerMapper;

@RestController
@RequestMapping(value = "/employer")
public class EmployerController {
	
	@Autowired
    private EmployerMapper employerMapper;
	
	/**
	 * 
	 * @return
	 * 
	 * Possible urls:
	 * 		http://localhost:1878/employer/
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
	 * 		http://localhost:1878/employer/by/id 
     */
    @GetMapping(value = "/by/id")
    public <T> T getEmployerById(
    		@RequestParam(value = "id")Long id) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("id", id);
        map.put("employer", employerMapper.findById(id));
        
        return (T) map;
    }

    /**
     * 
     * @param name
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/employer/by/name
     */
    @GetMapping(value = "/by/name")
    public <T> T getEmployerByName(
    		@RequestParam(value = "name")String name) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        
        map.put("name", name);
        map.put("employer", employerMapper.findByName(name));
        
        return (T) map;
    }

    /**
     * 
     * @param id
     * @param name
     * @param linkedin
     * @param website
     * @param region
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/employer/add/employer
     */
    @PostMapping(value = {"/add/employer"})
	public  <T> T addEmployer(
		@RequestParam(value = "name")String name,
		@RequestParam(value = "linkedin")String linkedin,
		@RequestParam(value = "website")String website,
		@RequestParam(value = "region")String region
	)
	{
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("NAME", name);
    	params.put("LINKEDIN", linkedin);
    	params.put("WEBSITE", website);
    	params.put("REGION", region);
    	
		employerMapper.addEmployer(params);
		 
	    Map<String, Object> map = new LinkedHashMap<String, Object>();
	    map.put("apiresult", 0);
	    map.put("apimessage", "ok");
	
	    return (T) map;
	}
    
    /**
     * 
     * @param id
     * @param name
     * @param linkedin
     * @param website
     * @param region 
     * @return
     * 
     * Possible urls:
	 * 		http://localhost:1878/employer/get/employer
     */
	@GetMapping(value = {"/get/employer"})
	public  <T> T getEmployer(
		@RequestParam(value = "id") Long id
	)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ID", id);

		List<Map<String, Object>> employerList = employerMapper.getEmployer(params);
		
	    Map<String, Object> map = new LinkedHashMap<String, Object>();
	    map.put("apivalue", employerList);
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
	 * 		http://localhost:1878/employer/delete/employer
	 */
	@GetMapping(value = {"/delete/employer"})
	public  <T> T deleteEmployer(
		@RequestParam(value = "id") Long id
	)
	{
		employerMapper.deleteEmployer(id);
		
	    Map<String, Object> map = new LinkedHashMap<String, Object>();
	    map.put("apiresult", 0);
	    map.put("apimessage", "ok");
	
	    return (T) map;
	}

}