package com.bankpackage;

class EmailFormatException extends Exception 
{
    public EmailFormatException(String message)
    {
        super(message);
    }
}

class PhoneNumberLengthException extends Exception
{
    public PhoneNumberLengthException(String message)
    {
        super(message);
    }
}


class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message) 
    {
        super(message);
    }
}

class InvalidTransactionAmountException extends Exception 
{
    public InvalidTransactionAmountException(String message)
    {
        super(message);
    }
}
