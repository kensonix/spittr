package spittr.web;

import java.util.List;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.web.servlet.view.InternalResourceView;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import spittr.Spittle;
import spittr.data.SpittleRepository;

public class SpittleControllerTest {

	@Test
	public void shouldShowRecentSpittles() throws Exception{
		List<Spittle> expectedSpittles =  createPsittleList(20);
		SpittleRepository mockRepository = mock(SpittleRepository.class);
		when(mockRepository.findSpittles(Long.MAX_VALUE, 20))
		.thenReturn(expectedSpittles);
		
		SpittleController controller = new SpittleController(mockRepository);
		
		MockMvc mockMvc =  MockMvcBuilders.standaloneSetup(controller).setSingleView(
				new InternalResourceView("/WEB-INF/views/spittles.jsp"))
				.build();
//		mockMvc.perform(get("/spittles"))
		mockMvc.perform(get("/spittles?max=238900&count=20"))
		.andExpect(view().name("spittles"))
		.andExpect(model().attributeExists("spittleList"))
		.andExpect(model().attribute("spittleList",
				hasItems(expectedSpittles.toArray())));
		
	}

	private List<Spittle> createPsittleList(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
