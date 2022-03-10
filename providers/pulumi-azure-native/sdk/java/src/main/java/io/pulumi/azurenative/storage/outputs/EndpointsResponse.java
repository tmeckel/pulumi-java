// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.StorageAccountInternetEndpointsResponse;
import io.pulumi.azurenative.storage.outputs.StorageAccountMicrosoftEndpointsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointsResponse {
    /**
     * Gets the blob endpoint.
     * 
     */
    private final String blob;
    /**
     * Gets the dfs endpoint.
     * 
     */
    private final String dfs;
    /**
     * Gets the file endpoint.
     * 
     */
    private final String file;
    /**
     * Gets the internet routing storage endpoints
     * 
     */
    private final @Nullable StorageAccountInternetEndpointsResponse internetEndpoints;
    /**
     * Gets the microsoft routing storage endpoints.
     * 
     */
    private final @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints;
    /**
     * Gets the queue endpoint.
     * 
     */
    private final String queue;
    /**
     * Gets the table endpoint.
     * 
     */
    private final String table;
    /**
     * Gets the web endpoint.
     * 
     */
    private final String web;

    @OutputCustomType.Constructor
    private EndpointsResponse(
        @OutputCustomType.Parameter("blob") String blob,
        @OutputCustomType.Parameter("dfs") String dfs,
        @OutputCustomType.Parameter("file") String file,
        @OutputCustomType.Parameter("internetEndpoints") @Nullable StorageAccountInternetEndpointsResponse internetEndpoints,
        @OutputCustomType.Parameter("microsoftEndpoints") @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints,
        @OutputCustomType.Parameter("queue") String queue,
        @OutputCustomType.Parameter("table") String table,
        @OutputCustomType.Parameter("web") String web) {
        this.blob = blob;
        this.dfs = dfs;
        this.file = file;
        this.internetEndpoints = internetEndpoints;
        this.microsoftEndpoints = microsoftEndpoints;
        this.queue = queue;
        this.table = table;
        this.web = web;
    }

    /**
     * Gets the blob endpoint.
     * 
    */
    public String getBlob() {
        return this.blob;
    }
    /**
     * Gets the dfs endpoint.
     * 
    */
    public String getDfs() {
        return this.dfs;
    }
    /**
     * Gets the file endpoint.
     * 
    */
    public String getFile() {
        return this.file;
    }
    /**
     * Gets the internet routing storage endpoints
     * 
    */
    public Optional<StorageAccountInternetEndpointsResponse> getInternetEndpoints() {
        return Optional.ofNullable(this.internetEndpoints);
    }
    /**
     * Gets the microsoft routing storage endpoints.
     * 
    */
    public Optional<StorageAccountMicrosoftEndpointsResponse> getMicrosoftEndpoints() {
        return Optional.ofNullable(this.microsoftEndpoints);
    }
    /**
     * Gets the queue endpoint.
     * 
    */
    public String getQueue() {
        return this.queue;
    }
    /**
     * Gets the table endpoint.
     * 
    */
    public String getTable() {
        return this.table;
    }
    /**
     * Gets the web endpoint.
     * 
    */
    public String getWeb() {
        return this.web;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blob;
        private String dfs;
        private String file;
        private @Nullable StorageAccountInternetEndpointsResponse internetEndpoints;
        private @Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints;
        private String queue;
        private String table;
        private String web;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.dfs = defaults.dfs;
    	      this.file = defaults.file;
    	      this.internetEndpoints = defaults.internetEndpoints;
    	      this.microsoftEndpoints = defaults.microsoftEndpoints;
    	      this.queue = defaults.queue;
    	      this.table = defaults.table;
    	      this.web = defaults.web;
        }

        public Builder blob(String blob) {
            this.blob = Objects.requireNonNull(blob);
            return this;
        }

        public Builder dfs(String dfs) {
            this.dfs = Objects.requireNonNull(dfs);
            return this;
        }

        public Builder file(String file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder internetEndpoints(@Nullable StorageAccountInternetEndpointsResponse internetEndpoints) {
            this.internetEndpoints = internetEndpoints;
            return this;
        }

        public Builder microsoftEndpoints(@Nullable StorageAccountMicrosoftEndpointsResponse microsoftEndpoints) {
            this.microsoftEndpoints = microsoftEndpoints;
            return this;
        }

        public Builder queue(String queue) {
            this.queue = Objects.requireNonNull(queue);
            return this;
        }

        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder web(String web) {
            this.web = Objects.requireNonNull(web);
            return this;
        }
        public EndpointsResponse build() {
            return new EndpointsResponse(blob, dfs, file, internetEndpoints, microsoftEndpoints, queue, table, web);
        }
    }
}
