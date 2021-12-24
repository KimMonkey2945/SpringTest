package com.totti.test.spring.lesson01;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/test02")
@RestController
public class Test02Controller {

	
	@RequestMapping("/1")
	public List<Map<String,Object>> movie(){
		
		List<Map<String,Object>> list = new ArrayList<>();
		
		Map<String,Object> map1 = new HashMap<>();
		//이름을 그냥 쓰고 싶다면 밑에 것들은 map1 = new HashMap<>();이렇게 사용하고
//		쭉쭉 데이터를 넣어주면 된다
		
		map1.put("rate", 15);
		map1.put("director", "봉준호");
		map1.put("time", 111);
		map1.put("title", "기생충");
		
		list.add(map1);
		
		Map<String,Object> map2 = new HashMap<>();
		
		map2.put("rate", 0 );
		map2.put("director", "로베르토 베니니");
		map2.put("time", 116);
		map2.put("title", "인생은 아름다워");
		
		list.add(map2);
		
		Map<String,Object> map3 = new HashMap<>();
		
		map3.put("rate", 12);
		map3.put("director", "크리스토퍼 놀란");
		map3.put("time", 147);
		map3.put("title", "인셉션");
		
		list.add(map3);
		
		Map<String,Object> map4 = new HashMap<>();
		
		map4.put("rate", 19);
		map4.put("director", "윤종빈");
		map4.put("time", 133);
		map4.put("title", "범죄와의 전쟁: 나쁜놈들 전성시대");
		
		list.add(map4);
		
		Map<String,Object> map5 = new HashMap<>();
		
		map5.put("rate", 15);
		map5.put("director", "프란시스 로렌스");
		map5.put("time", 137);
		map5.put("title", "헝거게임");
	
		list.add(map5);
		
		return list;
	}
	
	
	
	@RequestMapping("/2")
	public List<Data> bulletinBoard(){
		
		List<Data> list = new ArrayList<>();
		
		Data data = new Data();
		data.setTitle("안녕하세요 가입인사 드립니다.");
		data.setUser("hagulu");
		data.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		
		list.add(data);
		
		data = new Data();
		data.setTitle("헐 대박");
		data.setUser("bada");
		data.setContent("오늘 목요일이 었어... 금요일인줄");
		
		list.add(data);
		
		data = new Data();
		data.setTitle("오늘 데이트 한 이야기 해드릴게요.");
		data.setUser("dulumary");
		data.setContent("...");
		
		list.add(data);
		
		return list;
		
	}
	
	
	@RequestMapping("/3")
	public ResponseEntity<Data> entity(){
		
		Data data = new Data();
		data.setTitle("안녕하세요 가입인사 드립니다.");
		data.setUser("hagulu");
		data.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
		
		ResponseEntity<Data> entity = new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
