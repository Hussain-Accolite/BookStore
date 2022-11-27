package com.library.BookStore.Service;


import com.library.BookStore.Model.wallet;

import java.util.List;

public interface walletService {

    wallet setMoney(wallet w);
    List<wallet> showAll();
    wallet showMoneyId(long Id);
    wallet addMoney(long Id,wallet w);

}
