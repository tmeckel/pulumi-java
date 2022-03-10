// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The URIs that are used to perform a retrieval of a public blob, file, web or dfs object via a internet routing endpoint.
 * 
 */
public final class StorageAccountInternetEndpointsResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountInternetEndpointsResponse Empty = new StorageAccountInternetEndpointsResponse();

    /**
     * Gets the blob endpoint.
     * 
     */
    @InputImport(name="blob", required=true)
      private final String blob;

    public String getBlob() {
        return this.blob;
    }

    /**
     * Gets the dfs endpoint.
     * 
     */
    @InputImport(name="dfs", required=true)
      private final String dfs;

    public String getDfs() {
        return this.dfs;
    }

    /**
     * Gets the file endpoint.
     * 
     */
    @InputImport(name="file", required=true)
      private final String file;

    public String getFile() {
        return this.file;
    }

    /**
     * Gets the web endpoint.
     * 
     */
    @InputImport(name="web", required=true)
      private final String web;

    public String getWeb() {
        return this.web;
    }

    public StorageAccountInternetEndpointsResponse(
        String blob,
        String dfs,
        String file,
        String web) {
        this.blob = Objects.requireNonNull(blob, "expected parameter 'blob' to be non-null");
        this.dfs = Objects.requireNonNull(dfs, "expected parameter 'dfs' to be non-null");
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.web = Objects.requireNonNull(web, "expected parameter 'web' to be non-null");
    }

    private StorageAccountInternetEndpointsResponse() {
        this.blob = null;
        this.dfs = null;
        this.file = null;
        this.web = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountInternetEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blob;
        private String dfs;
        private String file;
        private String web;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountInternetEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blob = defaults.blob;
    	      this.dfs = defaults.dfs;
    	      this.file = defaults.file;
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

        public Builder web(String web) {
            this.web = Objects.requireNonNull(web);
            return this;
        }
        public StorageAccountInternetEndpointsResponse build() {
            return new StorageAccountInternetEndpointsResponse(blob, dfs, file, web);
        }
    }
}
