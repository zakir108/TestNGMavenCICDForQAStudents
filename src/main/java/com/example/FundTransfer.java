package com.example;
public class FundTransfer {
    

    int SourceAcc = 100;
    int destAcc = 5000;

    public void FundTransfer(int transferAmount)
    {
        DeductFund(SourceAcc,transferAmount);// A - x

        AddFund(destAcc,transferAmount); // B = B + x 
    }

    private void DeductFund(int source, int transferAmount) {

        source = source-transferAmount;
        // TODO Auto-generated method stub
        //
    }

    private void AddFund(int destAcc, int transferAmount) {

       try
       {
         destAcc = destAcc+transferAmount;// Network Fail, Visa Service was Down, Database Error
       }
       catch(Throwable ex)       
       {
        //int A = 10-x;
       }
       
    }


}
