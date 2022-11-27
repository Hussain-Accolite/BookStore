package com.library.BookStore.Service;

import com.library.BookStore.Model.issuedBooks;

import java.util.List;

public interface issuedService {
    issuedBooks issueAbook(issuedBooks b);

    issuedBooks returnAbook(issuedBooks books);

    List<issuedBooks> showAllIssued();

    List<issuedBooks> returnUserHistory(long userId);
}
