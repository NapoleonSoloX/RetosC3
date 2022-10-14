package com.example.masterclass3.masterclass3.entidades.DTOs;

import com.example.masterclass3.masterclass3.entidades.Client;

public class CountClient {

    private Long total;
    private Long client;

    public CountClient(Long total, Long client) {
        this.total = total;
        this.client = client;
    }

    public CountClient(Long total, Client client) {

    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getClient() {
        return client;
    }

    public void setClient(Long client) {
        this.client = client;
    }
}
