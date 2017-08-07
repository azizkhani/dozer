package mapper;

import static org.junit.Assert.assertEquals;

import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.junit.Test;

import model.Personel;
import model.User;
import viewmodel.PersonelViewModel;
import viewmodel.UserViewModel;

public class ModelMapper {

	
	@Test
    public void annotationMapping() {

        // assert statements

		Mapper mapper = DozerBeanMapperBuilder.create().build();
		
		User u = new User(12,"admi","pass",122121);
		
		Personel personel = new Personel(u);
		
		PersonelViewModel pvm = mapper.map(personel, PersonelViewModel.class);
		
		
		Personel p = mapper.map(pvm, Personel.class);
		System.out.println(u.toString());
		System.out.println(pvm.toString());
		
		
		assertEquals("type after mape", Integer.class, p.getCreatedBy().getId().getClass());
		
	}
}
