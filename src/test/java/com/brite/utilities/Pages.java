package com.brite.utilities;

import com.brite.pages.ReceiptsMyCompanyPage;

public class Pages {

    ReceiptsMyCompanyPage receiptsMyCompanyPage;

    public ReceiptsMyCompanyPage getReceiptsMyCompanyPage(){
        if(receiptsMyCompanyPage==null){
            receiptsMyCompanyPage=new ReceiptsMyCompanyPage();
        }
        return receiptsMyCompanyPage;
    }
}
