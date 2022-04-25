// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationConfigState extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigState Empty = new BucketReplicationConfigState();

    /**
     * The name of the source S3 bucket you want Amazon S3 to monitor.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the source S3 bucket you want Amazon S3 to monitor.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Set of configuration blocks describing the rules managing the replication documented below.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<BucketReplicationConfigRuleGetArgs>> rules;

    /**
     * @return Set of configuration blocks describing the rules managing the replication documented below.
     * 
     */
    public Optional<Output<List<BucketReplicationConfigRuleGetArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private BucketReplicationConfigState() {}

    private BucketReplicationConfigState(BucketReplicationConfigState $) {
        this.bucket = $.bucket;
        this.role = $.role;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigState $;

        public Builder() {
            $ = new BucketReplicationConfigState();
        }

        public Builder(BucketReplicationConfigState defaults) {
            $ = new BucketReplicationConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the source S3 bucket you want Amazon S3 to monitor.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the source S3 bucket you want Amazon S3 to monitor.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param role The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param rules Set of configuration blocks describing the rules managing the replication documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<BucketReplicationConfigRuleGetArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Set of configuration blocks describing the rules managing the replication documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<BucketReplicationConfigRuleGetArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Set of configuration blocks describing the rules managing the replication documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(BucketReplicationConfigRuleGetArgs... rules) {
            return rules(List.of(rules));
        }

        public BucketReplicationConfigState build() {
            return $;
        }
    }

}
