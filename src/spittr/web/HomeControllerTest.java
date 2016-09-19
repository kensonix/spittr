package spittr.web;

//import static org.junit.Assert.assertEquals;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static  org.springframework.test.web.servlet.setup.AbstractMockMvcBuilder.*;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception{
		
		HomeController controller =  new HomeController();
//		assertEquals("home",controller.home());
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(get("/"))
		.andExpect(view().name("home"));
		
	}

}
