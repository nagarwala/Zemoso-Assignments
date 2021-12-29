package com.springboot.myProject;

import com.springboot.myProject.dao.TrainRepository;
import com.springboot.myProject.entity.Train;
import com.springboot.myProject.service.TrainService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
class MyProjectApplicationTests {

	@Autowired
	private TrainService trainService;

	@MockBean
	private TrainRepository trainRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void toFindAllTest(){

		when(trainRepository.findAll()).thenReturn(Stream.of(new Train(2,"Brahmaputra","Guwahati","12:30:00")).collect(toList()));
		assertEquals(1,trainService.findAll().size());
	}
	@Test
	void toTestSave()
	{
		Train theTrain = new Train(20,"Tejas","Prayagraj","04:25:30");
		trainService.save(theTrain);
		verify(trainRepository).save(theTrain);

	}


	@Test
	void toTestDeleteById()
	{
		int id =20;
		trainService.deleteById(id) ;
		verify(trainRepository).deleteById(id);
	}

}
