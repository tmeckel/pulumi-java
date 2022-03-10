// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Job output definition container information on where to find job output/logs.
 * 
 */
public final class JobOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobOutputResponse Empty = new JobOutputResponse();

    /**
     * ARM ID of the datastore where the job logs and artifacts are stored, or null for the default container ("azureml") in the workspace's storage account.
     * 
     */
    @InputImport(name="datastoreId", required=true)
      private final String datastoreId;

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * Path within the datastore to the job logs and artifacts.
     * 
     */
    @InputImport(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    public JobOutputResponse(
        String datastoreId,
        String path) {
        this.datastoreId = Objects.requireNonNull(datastoreId, "expected parameter 'datastoreId' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private JobOutputResponse() {
        this.datastoreId = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datastoreId;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.path = defaults.path;
        }

        public Builder datastoreId(String datastoreId) {
            this.datastoreId = Objects.requireNonNull(datastoreId);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public JobOutputResponse build() {
            return new JobOutputResponse(datastoreId, path);
        }
    }
}
