package com.clongoogle.clongoogle.repositories;

import com.clongoogle.clongoogle.entities.WebPage;

import java.util.List;

public interface SearchRepository {

    List<WebPage> search(String textSearch);
}
