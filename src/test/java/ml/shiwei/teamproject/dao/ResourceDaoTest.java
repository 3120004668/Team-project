package ml.shiwei.teamproject.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ResourceDaoTest {
    @Autowired
    ResourceDao resourceDao;

    @Test
    void searchResource() {
        //System.out.println(resourceDao.findById(2));
    }
}