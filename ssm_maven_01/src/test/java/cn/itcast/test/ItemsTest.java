package cn.itcast.test;


import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    @Test
    public void findById(){
        ClassPathXmlApplicationContext sc = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ItemsDao bean = sc.getBean(ItemsDao.class);
//        Items items = bean.findById(1);
//        System.out.println(items);
        ItemsService service = sc.getBean(ItemsService.class);
        System.out.println(service.findById(1));
    }
}
