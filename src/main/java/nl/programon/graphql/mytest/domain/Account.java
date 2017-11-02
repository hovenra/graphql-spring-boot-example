package nl.programon.graphql.mytest.domain;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@Builder
public class Account {
    private String iban;

    private String currency;
    private int numberOfDecimals;
    private AccountType accountType;
    private String accountId;
    private String productName;

    private String accountHolderName;
    private String customProductName;
    private float spendingLimit;
    private boolean showAccount;
   // private Date endDate;
    //private Date startDate;
    private float balance;
    private boolean balanceTemporarilyNotAvailable;
    private Status status;
}
