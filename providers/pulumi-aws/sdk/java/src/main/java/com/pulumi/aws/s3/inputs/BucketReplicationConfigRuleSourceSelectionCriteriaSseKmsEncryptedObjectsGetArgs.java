// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs Empty = new BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs();

    /**
     * Whether the existing objects should be replicated. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return Whether the existing objects should be replicated. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    private BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs() {}

    private BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs(BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs $) {
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs $;

        public Builder() {
            $ = new BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs();
        }

        public Builder(BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs defaults) {
            $ = new BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param status Whether the existing objects should be replicated. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Whether the existing objects should be replicated. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BucketReplicationConfigRuleSourceSelectionCriteriaSseKmsEncryptedObjectsGetArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
