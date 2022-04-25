// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TransactionInfoResponse {
    /**
     * @return // [Alpha] Id of the transaction.
     * 
     */
    private final String transactionId;

    @CustomType.Constructor
    private TransactionInfoResponse(@CustomType.Parameter("transactionId") String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * @return // [Alpha] Id of the transaction.
     * 
     */
    public String transactionId() {
        return this.transactionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransactionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String transactionId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransactionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transactionId = defaults.transactionId;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = Objects.requireNonNull(transactionId);
            return this;
        }        public TransactionInfoResponse build() {
            return new TransactionInfoResponse(transactionId);
        }
    }
}
