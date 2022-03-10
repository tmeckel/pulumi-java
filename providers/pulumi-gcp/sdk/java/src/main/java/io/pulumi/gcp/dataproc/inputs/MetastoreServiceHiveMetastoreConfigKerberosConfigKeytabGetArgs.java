// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs Empty = new MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs();

    /**
     * The relative resource name of a Secret Manager secret version, in the following form:
     * "projects/{projectNumber}/secrets/{secret_id}/versions/{version_id}".
     * 
     */
    @InputImport(name="cloudSecret", required=true)
      private final Input<String> cloudSecret;

    public Input<String> getCloudSecret() {
        return this.cloudSecret;
    }

    public MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs(Input<String> cloudSecret) {
        this.cloudSecret = Objects.requireNonNull(cloudSecret, "expected parameter 'cloudSecret' to be non-null");
    }

    private MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs() {
        this.cloudSecret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cloudSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSecret = defaults.cloudSecret;
        }

        public Builder cloudSecret(Input<String> cloudSecret) {
            this.cloudSecret = Objects.requireNonNull(cloudSecret);
            return this;
        }

        public Builder cloudSecret(String cloudSecret) {
            this.cloudSecret = Input.of(Objects.requireNonNull(cloudSecret));
            return this;
        }
        public MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs build() {
            return new MetastoreServiceHiveMetastoreConfigKerberosConfigKeytabGetArgs(cloudSecret);
        }
    }
}
