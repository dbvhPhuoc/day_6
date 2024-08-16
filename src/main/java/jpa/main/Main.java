package jpa.main;

import jpa.config.SpringConfig;
import jpa.entity.AccountEntity;
import jpa.repository.AccountRepository;
import jpa.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class Main {
    static ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    static AccountService accountService = (AccountService) context.getBean("accountService");
    static AccountRepository accountRepository = (AccountRepository )context.getBean("accountRepository");
    public static void main (String[] args) {
        createNewOwner();
//        accountService.transferMoney(1,2,50);
//        accountService.transferMoney(1,2,10);
//        accountService.transferMoney(1,2,50);
    }

    private static void createNewOwner(){
        ArrayList<AccountEntity> listowner = new ArrayList<>();

        AccountEntity owner1 = new AccountEntity();
        owner1.setBalance(50);
        owner1.setOwnerName("owner-1");


        listowner.add(owner1);

        AccountEntity owner2 = new AccountEntity();
        owner2.setBalance(50);
        owner2.setOwnerName("owner-2");


        listowner.add(owner2);


        for (AccountEntity objowner: listowner) {
            accountRepository.save(objowner);
            System.out.println(objowner.toString());
        }
    }
}
