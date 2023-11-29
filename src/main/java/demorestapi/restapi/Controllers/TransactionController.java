package demorestapi.restapi.Controllers;

import demorestapi.restapi.Models.Transaction;
import demorestapi.restapi.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*") //Allowed headers will  be restricted

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value = "/createtransaction", method = RequestMethod.POST)
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

}
