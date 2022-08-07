package com.springboot.test1.data.dao;

import com.springboot.test1.data.entity.DM;
import com.springboot.test1.data.entity.Product;
import com.springboot.test1.data.repository.AccountRepository;
import com.springboot.test1.data.repository.ChatRepository;
import com.springboot.test1.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import java.time.LocalDateTime;
import java.util.Optional;

public class ChatDAO {
    private final ChatRepository chatRepository;
    @Autowired
    public ChatDAO(ChatRepository chatRepository)
    {
        this.chatRepository = chatRepository;
    }

    public DM insertChat(DM dm){
        dm.setCreatedAt(LocalDateTime.now());
        DM saveDM = chatRepository.save(dm);
        return saveDM;
    }

    public DM selectChat(Long chatID){
        DM selectDM = chatRepository.getReferenceById(chatID);
        return selectDM;
    }


    public DM updateChat(Long chatID, int accountID, int targetaccountID, String DM) throws Exception{
        Optional<DM> selectChat = chatRepository.findById(chatID);

        DM updatedDM;
        if(selectChat.isPresent()){
            DM dm = selectChat.get();
            dm.setAccountID(accountID);
            dm.setTargetaccountID(targetaccountID);
            dm.setDM(DM);
            dm.setUpdatedAt(LocalDateTime.now());


            updatedDM = chatRepository.save(dm);
        }else{
            throw new Exception();
        }

        return updatedDM;
    }

    public void deleteChat(Long chatID) throws Exception{
        Optional<DM> selectChat = chatRepository.findById(chatID);
        if(selectChat.isPresent()){
            DM dm = selectChat.get();
            chatRepository.delete(dm);
        }else{
            throw new Exception();
        }

    }

}
