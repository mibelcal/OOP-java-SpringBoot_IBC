package com.microcompany.accountsservice_IBC.AccountService_IBC.persistence;

import com.microcompany.accountsservice_IBC.AccountService_IBC.model.Account;
import com.microcompany.accountsservice_IBC.AccountService_IBC.model.Customer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@DataJpaTest()
@ComponentScan(basePackages = {"com.microcompany.accountsservice_IBC.AccountService_IBC.persistence"})
@AutoConfigureTestEntityManager
class CustomerRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(CustomerRepositoryTest.class);

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository jpaRepo;

//    @Test
//    void addWithAccounts() throws SQLException {
//        List<Account> cuentas = List.of(
//            new Account(null, "Corriente", 1000, 1, ),
//            new Student(null, "Luisa", "Rosalez", 3)
//        );
//
//        School sch = new School(null, "Mi escuela con estudiantes", estudiantes);
//
//        for (Student estudiante : estudiantes) {
//            estudiante.setMySchool(sch);
//        }
//
//        repo.add(sch);
////        System.out.println(sch);
//        assertNotNull(sch);
//        assertTrue(sch.getId() > 0);
//
//    }
//    @Test
//    void findAll() {
//        // given
//       Account aAccount = new Account(null, "Corriente", 1000, 1,new Customer(null,"Juan","Juan@hotmail",cuentas)) ;
//        entityManager.persist(aProduct);
//        entityManager.flush();
//
//        // when
//        List<Product> prods = jpaRepo.findAll();
//        logger.info("Prods:" + prods);
//
//        // then
//        assertThat(prods.size())
//                .isGreaterThan(0);
//
//        assertNotNull(prods);
//    }
//
//    //    @Test
//    void findById() {
//    }
//
//    //    @Test
//    void findByNameContaining() {
//    }
//
//    //    @Test
//    void findByName() {
//    }
//
//    @Test
//    void save() {
//        // given
//        Product aProduct = new Product(null, "Another Fake Product", "123-123-1234");
//
//        // when
//        jpaRepo.save(aProduct);
//
//        System.out.println(aProduct);
//
//        // then
//        assertThat(aProduct.getId()).isGreaterThan(0);
//    }
//
//    @Test
//    void deleteById() {
//    }
}