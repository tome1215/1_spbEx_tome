package com.example.demo.dao;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.xmlunit.diff.DOMDifferenceEngine;

import com.example.demo.dao.impl.PorderDaoImpl;
import com.example.demo.model.Porder;

@SpringBootTest
public class PorderDaoImplTest {
	@Autowired
	PorderDaoImpl pdi;
	
	//@Test
	public void addTest()
	{
		Porder p = new Porder("n6", 6, 6, 6);
		pdi.add(p);
		System.out.println("add success");
	}
	//@Test
	public void selectAllTest()
	{
		List<Porder> l = pdi.selectAll();
		for(Porder p:l)
		{
			System.out.println("id:"+p.getId()+"\t name:"+p.getName());
		}
	}
	
	//@Test
	public void selectById()
	{
		List<Porder> l = pdi.selectById(1);
		for(Porder p:l)
		{
			System.out.println("id:"+p.getId()+"\t name:"+p.getName());
		}
	}
	
	//@Test
	public void updateTest()
	{
		List<Porder> l = pdi.selectById(5);
		Porder[] p = l.toArray(new Porder[1]);
		p[0].setA(5);
		p[0].setB(5);
		p[0].setC(5);
		pdi.update(p[0]);
		
		System.out.println("update success");
	}
	
	//@Test
	public void deleteTest()
	{
		pdi.delete(6);
		
		System.out.println("delete success");
	}
	
	
}
