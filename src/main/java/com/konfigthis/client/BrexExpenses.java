package com.konfigthis.client;

import com.konfigthis.client.api.CardExpensesApi;
import com.konfigthis.client.api.ReceiptMatchApi;
import com.konfigthis.client.api.ReceiptUploadApi;

public class BrexExpenses {
    private ApiClient apiClient;
    public final CardExpensesApi cardExpenses;
    public final ReceiptMatchApi receiptMatch;
    public final ReceiptUploadApi receiptUpload;

    public BrexExpenses() {
        this(null);
    }

    public BrexExpenses(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.cardExpenses = new CardExpensesApi(this.apiClient);
        this.receiptMatch = new ReceiptMatchApi(this.apiClient);
        this.receiptUpload = new ReceiptUploadApi(this.apiClient);
    }

}
