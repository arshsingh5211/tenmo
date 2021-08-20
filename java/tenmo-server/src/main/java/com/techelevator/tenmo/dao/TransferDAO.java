package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfers;
import com.techelevator.tenmo.model.User;

import java.math.BigDecimal;
import java.util.List;

public interface TransferDAO {
    Transfers getTransferById(long transferId);
    Transfers createTransfer(Transfers transfers, int typeId);
    String sendTransfer(int accountFrom, int accountTo, BigDecimal amount, Transfers transfers);
    List<Transfers> getTransferList();
    String getTransferStatus();
    String getTransferDetails();
    List<Transfers> searchAllTransfersById(); // current user plus whatever id we pass in (interactions)
    List<Transfers> listAllMyTransfers();
    void createTransferStatus(long id, String status);
}
