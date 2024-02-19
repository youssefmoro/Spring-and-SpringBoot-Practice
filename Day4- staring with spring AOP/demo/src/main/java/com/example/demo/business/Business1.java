package com.example.demo.business;

import com.example.demo.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Dao1 dao1;
    public String calculateSomethingFromRetrievedDataFromDataBase()
    {
        //business logic is supposed to be here
        return dao1.retrieveSomethingFromDataBase();
    }
}
