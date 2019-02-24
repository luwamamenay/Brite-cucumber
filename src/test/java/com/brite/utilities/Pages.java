package com.brite.utilities;

import com.brite.pages.ReceiptsMyCompanyCreatePage;
import com.brite.pages.ReceiptsMyCompanyImportPage;
import com.brite.pages.ReceiptsMyCompanyPage;

public class Pages {

    private ReceiptsMyCompanyPage receiptsMyCompanyPage;
    private ReceiptsMyCompanyCreatePage createPage;
    private ReceiptsMyCompanyImportPage importPage;

    public ReceiptsMyCompanyPage getReceiptsMyCompanyPage(){
        if(receiptsMyCompanyPage==null){
            receiptsMyCompanyPage=new ReceiptsMyCompanyPage();
        }
        return receiptsMyCompanyPage;
    }

    public ReceiptsMyCompanyCreatePage getCreatePage(){
        if(createPage==null){
            createPage = new ReceiptsMyCompanyCreatePage();
        }
        return createPage;
    }

    public ReceiptsMyCompanyImportPage getImportPage(){
        if(importPage==null){
            importPage=new ReceiptsMyCompanyImportPage();
        }
        return importPage;
    }
}
