import { Component, OnInit } from '@angular/core';
import { Transaction } from "../transaction";
import { TransactionService } from "../transaction.service";

@Component({
  selector: 'app-transaction-list',
  templateUrl: './transaction-list.component.html',
  styleUrls: ['./transaction-list.component.css'],
  providers: [TransactionService]
})
export class TransactionListComponent implements OnInit {

  private transactions: Transaction[];

  constructor(private transactionService: TransactionService) { }

  ngOnInit() { //when component loading get all transactions and set the transactions[]
    this.getAllTransactions();
  }

  getAllTransactions() {
    this.transactionService.findAll().subscribe(
      transactions => {
        this.transactions = transactions;
      },
      err => {
        console.log(err);
      }

    );
  }
}
