package examples.Bank

class Customer {

}

class Account {

  balance : Int
  pendingAmount : Int
  
  req Positive: balance >= 0

  -- the forall makes it unsatisfiable
  req PendingTransactions:
    --forall pending : Int . balance - pending >= 0
      balance - pending >= 0
      
  req pendingAmount <= balance
}

class Bank {

  accounts : Set[Account]
  customers : Set[Customer]
  
  customerAccount : Set[Customer * Account]
  
  --req CustomerHasAccount:
    --forall c : customers . c isin customerAccount
    
  -- we do not currently support dot expressions...
  -- req Counts: customers.length() >= accounts.length()
  req Counts: customers >= accounts
  
  
}