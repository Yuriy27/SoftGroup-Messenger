import com.softgroup.common.dao.config.CommonDaoAppCfg;
import com.softgroup.common.dao.entities.ContactEntity;
import com.softgroup.common.dao.entities.NumberEntity;
import com.softgroup.common.dao.service.ContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yuriy27 on 25.04.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonDaoAppCfg.class})
public class Test1 {

    @Autowired
    private ContactService service;

    @Test
    public void testContactService() {
        ContactEntity con = new ContactEntity();
        con.setName("contact1");
        Set<NumberEntity> numbers = new HashSet<>();
        NumberEntity n1 = new NumberEntity();
        NumberEntity n2 = new NumberEntity();
        n1.setNumber("numb1");
        n2.setNumber("numb2");
        numbers.add(n1);
        numbers.add(n2);
        con.setPhoneNumbers(numbers);
        service.save(con);
    }

    @Test
    public void testContactService2() {
        ContactEntity c = service.findByName("contact1");
        System.out.println(c);
    }

}
