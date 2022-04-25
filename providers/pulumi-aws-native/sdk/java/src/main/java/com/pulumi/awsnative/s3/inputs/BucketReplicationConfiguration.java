// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.inputs.BucketReplicationRule;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A container for replication rules. You can add up to 1,000 rules. The maximum size of a replication configuration is 2 MB.
 * 
 */
public final class BucketReplicationConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final BucketReplicationConfiguration Empty = new BucketReplicationConfiguration();

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 assumes when replicating objects.
     * 
     */
    @Import(name="role", required=true)
    private String role;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 assumes when replicating objects.
     * 
     */
    public String role() {
        return this.role;
    }

    /**
     * A container for one or more replication rules.
     * 
     */
    @Import(name="rules", required=true)
    private List<BucketReplicationRule> rules;

    /**
     * @return A container for one or more replication rules.
     * 
     */
    public List<BucketReplicationRule> rules() {
        return this.rules;
    }

    private BucketReplicationConfiguration() {}

    private BucketReplicationConfiguration(BucketReplicationConfiguration $) {
        this.role = $.role;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfiguration $;

        public Builder() {
            $ = new BucketReplicationConfiguration();
        }

        public Builder(BucketReplicationConfiguration defaults) {
            $ = new BucketReplicationConfiguration(Objects.requireNonNull(defaults));
        }

        /**
         * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 assumes when replicating objects.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            $.role = role;
            return this;
        }

        /**
         * @param rules A container for one or more replication rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<BucketReplicationRule> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules A container for one or more replication rules.
         * 
         * @return builder
         * 
         */
        public Builder rules(BucketReplicationRule... rules) {
            return rules(List.of(rules));
        }

        public BucketReplicationConfiguration build() {
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}
