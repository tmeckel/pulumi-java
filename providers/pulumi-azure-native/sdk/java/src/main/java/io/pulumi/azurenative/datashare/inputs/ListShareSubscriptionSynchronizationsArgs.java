// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListShareSubscriptionSynchronizationsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListShareSubscriptionSynchronizationsArgs Empty = new ListShareSubscriptionSynchronizationsArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Filters the results using OData syntax.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable String filter;

    public Optional<String> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * Sorts the results using OData syntax.
     * 
     */
    @InputImport(name="orderby")
      private final @Nullable String orderby;

    public Optional<String> getOrderby() {
        return this.orderby == null ? Optional.empty() : Optional.ofNullable(this.orderby);
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription.
     * 
     */
    @InputImport(name="shareSubscriptionName", required=true)
      private final String shareSubscriptionName;

    public String getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Continuation token
     * 
     */
    @InputImport(name="skipToken")
      private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    public ListShareSubscriptionSynchronizationsArgs(
        String accountName,
        @Nullable String filter,
        @Nullable String orderby,
        String resourceGroupName,
        String shareSubscriptionName,
        @Nullable String skipToken) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.filter = filter;
        this.orderby = orderby;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.skipToken = skipToken;
    }

    private ListShareSubscriptionSynchronizationsArgs() {
        this.accountName = null;
        this.filter = null;
        this.orderby = null;
        this.resourceGroupName = null;
        this.shareSubscriptionName = null;
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListShareSubscriptionSynchronizationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private @Nullable String filter;
        private @Nullable String orderby;
        private String resourceGroupName;
        private String shareSubscriptionName;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListShareSubscriptionSynchronizationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.filter = defaults.filter;
    	      this.orderby = defaults.orderby;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder orderby(@Nullable String orderby) {
            this.orderby = orderby;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder shareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder skipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }
        public ListShareSubscriptionSynchronizationsArgs build() {
            return new ListShareSubscriptionSynchronizationsArgs(accountName, filter, orderby, resourceGroupName, shareSubscriptionName, skipToken);
        }
    }
}
