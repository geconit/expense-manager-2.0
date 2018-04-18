import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TransactionListComponent } from './transaction-list/transaction-list.component';
import { TransactionCreateComponent } from './transaction-create/transaction-create.component';

const routes: Routes = [
  {path: 'transaction', component: TransactionListComponent},
  {path: 'transaction/create', component: TransactionCreateComponent},
  {path: 'transaction/edit/:id', component: TransactionCreateComponent}
];


@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TransactionRoutingModule { }
