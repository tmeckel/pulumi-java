// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BuildStorageLocationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildStorageLocationGetArgs Empty = new BuildStorageLocationGetArgs();

    /**
     * Name of your S3 bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Name of your S3 bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Name of the zip file containing your build files.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Name of the zip file containing your build files.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * ARN of the access role that allows Amazon GameLift to access your S3 bucket.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return ARN of the access role that allows Amazon GameLift to access your S3 bucket.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private BuildStorageLocationGetArgs() {}

    private BuildStorageLocationGetArgs(BuildStorageLocationGetArgs $) {
        this.bucket = $.bucket;
        this.key = $.key;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildStorageLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildStorageLocationGetArgs $;

        public Builder() {
            $ = new BuildStorageLocationGetArgs();
        }

        public Builder(BuildStorageLocationGetArgs defaults) {
            $ = new BuildStorageLocationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Name of your S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Name of your S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param key Name of the zip file containing your build files.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Name of the zip file containing your build files.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param roleArn ARN of the access role that allows Amazon GameLift to access your S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn ARN of the access role that allows Amazon GameLift to access your S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public BuildStorageLocationGetArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
