package seven11.reward.calc.rewardRest.service;

import seven11.reward.calc.rewardRest.entity.Transaction;


import java.math.BigDecimal;

import java.util.List;

public interface RewardService {
    int calculateRewardPoints(BigDecimal purchase);
    void addTransaction(Transaction transaction);
    List<Transaction> listTransactions();
    List<Transaction> listLimitedTransactions(int limit);


}