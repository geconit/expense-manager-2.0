package pl.presz.expenseManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.presz.expenseManager.model.Transaction;
import pl.presz.expenseManager.repositorie.TransactionRepository;

import java.time.LocalDate;
import java.util.List;

import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TransactionController {

    @Autowired
    private TransactionRepository repository;

    @RequestMapping("transactions/current")
    public List<Transaction> getAllByCurrentMonth(){
        LocalDate now = LocalDate.now();
        LocalDate start = now.with(firstDayOfMonth());
        LocalDate end = now.with(lastDayOfMonth());
        return repository.findByTransactionDateBetween(start, end);
    }

    @RequestMapping("transactions/year/{year}/month/{month}")
    public List<Transaction> getAllByMonth(@PathVariable int year, @PathVariable int month){
        LocalDate start = LocalDate.of(year, month, 1);
        LocalDate end = start.with(lastDayOfMonth());
        return repository.findByTransactionDateBetween(start, end);
    }
}
