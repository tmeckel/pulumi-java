// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.outputs;

import com.pulumi.azurenative.search.outputs.QueryKeyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListQueryKeyBySearchServiceResult {
    /**
     * @return Request URL that can be used to query next page of query keys. Returned when the total number of requested query keys exceed maximum page size.
     * 
     */
    private final String nextLink;
    /**
     * @return The query keys for the Azure Cognitive Search service.
     * 
     */
    private final List<QueryKeyResponse> value;

    @CustomType.Constructor
    private ListQueryKeyBySearchServiceResult(
        @CustomType.Parameter("nextLink") String nextLink,
        @CustomType.Parameter("value") List<QueryKeyResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * @return Request URL that can be used to query next page of query keys. Returned when the total number of requested query keys exceed maximum page size.
     * 
     */
    public String nextLink() {
        return this.nextLink;
    }
    /**
     * @return The query keys for the Azure Cognitive Search service.
     * 
     */
    public List<QueryKeyResponse> value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListQueryKeyBySearchServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<QueryKeyResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListQueryKeyBySearchServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }
        public Builder value(List<QueryKeyResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(QueryKeyResponse... value) {
            return value(List.of(value));
        }        public ListQueryKeyBySearchServiceResult build() {
            return new ListQueryKeyBySearchServiceResult(nextLink, value);
        }
    }
}
