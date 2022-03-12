package com.techelevator.tenmo.model;

public class Transfer {
    // TODO possibly change transferType from String to TransferType enum
    // TODO possibly change transferStatus from String to TransferStatus enum
    private int transferId;
    private int transferTypeId;
    private int transferStatusId;
    private String transferType;
    private String transferStatus;
    private int accountFromId;
    private int accountToId;
    private String accountFromUsername;
    private String accountToUsername;

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    private double amount;


    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public int getTransferTypeId() {
        return transferTypeId;
    }

    public void setTransferTypeId(int transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public int getTransferStatusId() {
        return transferStatusId;
    }

    public void setTransferStatusId(int transferStatusId) {
        this.transferStatusId = transferStatusId;
    }

    public int getAccountFromId() {
        return accountFromId;
    }

    public void setAccountFromId(int accountFromId) {
        this.accountFromId = accountFromId;
    }

    public int getAccountToId() {
        return accountToId;
    }

    public void setAccountToId(int accountToID) {
        this.accountToId = accountToID;
    }

    public String getAccountFromUsername() {
        return accountFromUsername;
    }

    public void setAccountFromUsername(String accountFromUsername) {
        this.accountFromUsername = accountFromUsername;
    }

    public String getAccountToUsername() {
        return accountToUsername;
    }

    public void setAccountToUsername(String accountToUsername) {
        this.accountToUsername = accountToUsername;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Id: " + getTransferId() + "\n" +
                "From: " + getAccountFromUsername() + "\n" +
                "To: " + getAccountToUsername() + "\n" +
                "Type: " + getTransferTypeId() + "\n" +
                "Status: " + getTransferStatusId()+ "\n" +
                "Amount: " + getAmount() + "\n";
    }
}
