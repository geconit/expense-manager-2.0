export class Transaction {

  transactionId: number;
  amount: number;
  transactionDate: Date;
  paymentMethod: String;

  constructor(transactionId: number, amount: number, transactionDate: Date, paymentMethod: String ){
    this.transactionId = transactionId;
    this.amount = amount;
    this.transactionDate = transactionDate;
    this.paymentMethod = paymentMethod;
  }

}
