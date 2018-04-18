import { Injectable } from '@angular/core';
import { Transaction } from "./transaction";
import { Http, Response } from "@angular/http";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch';
import { Observable } from "rxjs/Observable";

@Injectable()
export class TransactionService {

  private apiUrl = 'http://localhost:8080/transactions/current';

  constructor(private http: Http) {
  }

  findAll(): Observable<Transaction[]>  {
    return this.http.get(this.apiUrl)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  findById(id: number): Observable<Transaction> {
    return null;
  }

  Transaction(transaction: Transaction): Observable<Transaction> {
    return null;
  }

  deleteTransactionById(id: number): Observable<boolean> {
    return null;
  }

  updateTransaction(user: Transaction): Observable<Transaction> {
    return null;
  }

}
