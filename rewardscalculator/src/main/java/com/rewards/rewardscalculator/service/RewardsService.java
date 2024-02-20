package com.rewards.rewardscalculator.service;

import com.rewards.rewardscalculator.model.Rewards;

public interface RewardsService {
    Rewards getRewardsByCustomerId(Long customerId);
}
