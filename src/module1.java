import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class BankAccount {

String name;
int accountNumber;
double balance;

double totalDeposit = 0;
double totalWithdraw = 0;

void deposit(double amount) {
balance = balance + amount;
totalDeposit = totalDeposit + amount;
}

boolean withdraw(double amount) {

if (amount <= balance) {
balance = balance - amount;
totalWithdraw = totalWithdraw + amount;
return true;
}

return false;
}

void displayBalance() {
System.out.println("Current Balance: " + balance);
}
}
