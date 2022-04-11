// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class GlobalTableReplicaSSESpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalTableReplicaSSESpecificationArgs Empty = new GlobalTableReplicaSSESpecificationArgs();

    @Import(name="kMSMasterKeyId", required=true)
      private final Output<String> kMSMasterKeyId;

    public Output<String> getKMSMasterKeyId() {
        return this.kMSMasterKeyId;
    }

    public GlobalTableReplicaSSESpecificationArgs(Output<String> kMSMasterKeyId) {
        this.kMSMasterKeyId = Objects.requireNonNull(kMSMasterKeyId, "expected parameter 'kMSMasterKeyId' to be non-null");
    }

    private GlobalTableReplicaSSESpecificationArgs() {
        this.kMSMasterKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaSSESpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kMSMasterKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaSSESpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kMSMasterKeyId = defaults.kMSMasterKeyId;
        }

        public Builder kMSMasterKeyId(Output<String> kMSMasterKeyId) {
            this.kMSMasterKeyId = Objects.requireNonNull(kMSMasterKeyId);
            return this;
        }
        public Builder kMSMasterKeyId(String kMSMasterKeyId) {
            this.kMSMasterKeyId = Output.of(Objects.requireNonNull(kMSMasterKeyId));
            return this;
        }        public GlobalTableReplicaSSESpecificationArgs build() {
            return new GlobalTableReplicaSSESpecificationArgs(kMSMasterKeyId);
        }
    }
}
