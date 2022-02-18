// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Execution using the default Cloud Build pool.
 * 
 */
public final class DefaultPoolResponse extends io.pulumi.resources.InvokeArgs {

    public static final DefaultPoolResponse Empty = new DefaultPoolResponse();

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket ("gs://my-bucket") or a path within a bucket ("gs://my-bucket/my-dir"). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    @InputImport(name="artifactStorage", required=true)
    private final String artifactStorage;

    public String getArtifactStorage() {
        return this.artifactStorage;
    }

    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    @InputImport(name="serviceAccount", required=true)
    private final String serviceAccount;

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    public DefaultPoolResponse(
        String artifactStorage,
        String serviceAccount) {
        this.artifactStorage = Objects.requireNonNull(artifactStorage, "expected parameter 'artifactStorage' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
    }

    private DefaultPoolResponse() {
        this.artifactStorage = null;
        this.serviceAccount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactStorage;
        private String serviceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultPoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        public Builder setArtifactStorage(String artifactStorage) {
            this.artifactStorage = Objects.requireNonNull(artifactStorage);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public DefaultPoolResponse build() {
            return new DefaultPoolResponse(artifactStorage, serviceAccount);
        }
    }
}
