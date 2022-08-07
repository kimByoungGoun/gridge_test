package com.springboot.test1.data.dao;

import com.springboot.test1.data.entity.Account;
import com.springboot.test1.data.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class AccountDAO {
    private final AccountRepository accountRepository;
    @Autowired
    public AccountDAO(AccountRepository accountRepository)
    {
        this.accountRepository = accountRepository;
    }

    public Account insertAccount(Account account){
        account.setCreatedAt(LocalDateTime.now());
        Account insertAccount = accountRepository.save(account);
        return insertAccount;
    }

    public Account selectAccount(Long accountID){
        Account selectAccount = accountRepository.getReferenceById(accountID);
        return selectAccount;
    }

    public Account updateAccount(Long accountID, String name, String username, String phoneNmber, String password
            , String birthday, String website, String introduce, char status, boolean isPrivate
                                 ) throws Exception{
        Optional<Account> selectAccount = accountRepository.findById(accountID);

        Account updatedAccount;
        if(selectAccount.isPresent()){
            Account account = selectAccount.get();
            account.setName(name);
            account.setUsername(username);
            account.setPhoneNumber(phoneNmber);
            account.setPassword(password);
            account.setBirthday(birthday);
            account.setWebsite(website);
            account.setIntroduce(introduce);
            account.setLastNameChange(LocalDateTime.now());
            account.setLastUsernameChange(LocalDateTime.now());
            account.setUpdatedAt(LocalDateTime.now());
            account.setStatus(status);
            account.setPrivate(isPrivate);

            updatedAccount = accountRepository.save(account);
        }else{
            throw new Exception();
        }

        return updatedAccount;
    }

    public void deleteAccount(Long accountID) throws Exception{
        Optional<Account> selectAccount = accountRepository.findById(accountID);
        if(selectAccount.isPresent()){
            Account account = selectAccount.get();
            accountRepository.delete(account);
        }else{
            throw new Exception();
        }

    }
}
