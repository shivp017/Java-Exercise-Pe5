package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class ReplaceList {


    public ArrayList<String> replaceElement(ArrayList<String> inputList){

      if (inputList!=null){
          inputList.set(0,"Kiwi");
          inputList.set(2,"Mango");

    } return  inputList;
    }

    public ArrayList<String> nullListElement(ArrayList<String> inputList1){

        inputList1.clear();
        return inputList1;

    }
}
