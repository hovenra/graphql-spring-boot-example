package nl.programon.graphql.mytest.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import graphql.schema.DataFetchingEnvironment;
import graphql.servlet.GraphQLContext;
import nl.programon.graphql.mytest.domain.Account;

import static nl.programon.graphql.mytest.domain.Account.*;
import  nl.programon.graphql.mytest.domain.Account;

import  nl.programon.graphql.mytest.domain.AccountType;
import nl.programon.graphql.mytest.domain.Status;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {
    public List<Account> getAccounts(DataFetchingEnvironment environment) {

        Optional<HttpServletRequest> optionalRequest = ((GraphQLContext)environment.getContext()).getRequest();
        HttpServletRequest request  = optionalRequest.get();


       Account account =   Account.builder().showAccount(true).accountHolderName("Ramon van den Hoven").accountId("asfdadfqwerwerwfsdfasf")
                .accountType(AccountType.PAYMENT).balance(12.12f).balanceTemporarilyNotAvailable(false).currency("EUR").customProductName("Mijn betaalrekening")
                .iban("NL49INGB0006205155").numberOfDecimals(2).productName("Rekening Courant").status(Status.ACTIVE).spendingLimit(4000.00f).build();

        List<Account> accounts = new ArrayList<>();

        return accounts;
    }
}