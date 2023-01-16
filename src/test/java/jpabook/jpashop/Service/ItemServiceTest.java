package jpabook.jpashop.Service;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest{
        @Autowired ItemService itemService;
        @Autowired ItemRepository itemRepository;
        @Autowired EntityManager em;
    @Test
    public void save() throws Exception{

        //given
        Book book = new Book();
        book.setName("JPA");
        //when

        //then

    }
}
