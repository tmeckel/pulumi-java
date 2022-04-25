// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.inputs;

import com.pulumi.aws.datasync.inputs.S3LocationS3ConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class S3LocationState extends com.pulumi.resources.ResourceArgs {

    public static final S3LocationState Empty = new S3LocationState();

    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @Import(name="agentArns")
    private @Nullable Output<List<String>> agentArns;

    /**
     * @return A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    public Optional<Output<List<String>>> agentArns() {
        return Optional.ofNullable(this.agentArns);
    }

    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Amazon Resource Name (ARN) of the S3 Bucket.
     * 
     */
    @Import(name="s3BucketArn")
    private @Nullable Output<String> s3BucketArn;

    /**
     * @return Amazon Resource Name (ARN) of the S3 Bucket.
     * 
     */
    public Optional<Output<String>> s3BucketArn() {
        return Optional.ofNullable(this.s3BucketArn);
    }

    /**
     * Configuration block containing information for connecting to S3.
     * 
     */
    @Import(name="s3Config")
    private @Nullable Output<S3LocationS3ConfigGetArgs> s3Config;

    /**
     * @return Configuration block containing information for connecting to S3.
     * 
     */
    public Optional<Output<S3LocationS3ConfigGetArgs>> s3Config() {
        return Optional.ofNullable(this.s3Config);
    }

    /**
     * The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * 
     */
    @Import(name="s3StorageClass")
    private @Nullable Output<String> s3StorageClass;

    /**
     * @return The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * 
     */
    public Optional<Output<String>> s3StorageClass() {
        return Optional.ofNullable(this.s3StorageClass);
    }

    /**
     * Prefix to perform actions as source or destination.
     * 
     */
    @Import(name="subdirectory")
    private @Nullable Output<String> subdirectory;

    /**
     * @return Prefix to perform actions as source or destination.
     * 
     */
    public Optional<Output<String>> subdirectory() {
        return Optional.ofNullable(this.subdirectory);
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    @Import(name="uri")
    private @Nullable Output<String> uri;

    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private S3LocationState() {}

    private S3LocationState(S3LocationState $) {
        this.agentArns = $.agentArns;
        this.arn = $.arn;
        this.s3BucketArn = $.s3BucketArn;
        this.s3Config = $.s3Config;
        this.s3StorageClass = $.s3StorageClass;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(S3LocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private S3LocationState $;

        public Builder() {
            $ = new S3LocationState();
        }

        public Builder(S3LocationState defaults) {
            $ = new S3LocationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentArns A list of DataSync Agent ARNs with which this location will be associated.
         * 
         * @return builder
         * 
         */
        public Builder agentArns(@Nullable Output<List<String>> agentArns) {
            $.agentArns = agentArns;
            return this;
        }

        /**
         * @param agentArns A list of DataSync Agent ARNs with which this location will be associated.
         * 
         * @return builder
         * 
         */
        public Builder agentArns(List<String> agentArns) {
            return agentArns(Output.of(agentArns));
        }

        /**
         * @param agentArns A list of DataSync Agent ARNs with which this location will be associated.
         * 
         * @return builder
         * 
         */
        public Builder agentArns(String... agentArns) {
            return agentArns(List.of(agentArns));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the DataSync Location.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the DataSync Location.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param s3BucketArn Amazon Resource Name (ARN) of the S3 Bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketArn(@Nullable Output<String> s3BucketArn) {
            $.s3BucketArn = s3BucketArn;
            return this;
        }

        /**
         * @param s3BucketArn Amazon Resource Name (ARN) of the S3 Bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketArn(String s3BucketArn) {
            return s3BucketArn(Output.of(s3BucketArn));
        }

        /**
         * @param s3Config Configuration block containing information for connecting to S3.
         * 
         * @return builder
         * 
         */
        public Builder s3Config(@Nullable Output<S3LocationS3ConfigGetArgs> s3Config) {
            $.s3Config = s3Config;
            return this;
        }

        /**
         * @param s3Config Configuration block containing information for connecting to S3.
         * 
         * @return builder
         * 
         */
        public Builder s3Config(S3LocationS3ConfigGetArgs s3Config) {
            return s3Config(Output.of(s3Config));
        }

        /**
         * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
         * 
         * @return builder
         * 
         */
        public Builder s3StorageClass(@Nullable Output<String> s3StorageClass) {
            $.s3StorageClass = s3StorageClass;
            return this;
        }

        /**
         * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
         * 
         * @return builder
         * 
         */
        public Builder s3StorageClass(String s3StorageClass) {
            return s3StorageClass(Output.of(s3StorageClass));
        }

        /**
         * @param subdirectory Prefix to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        /**
         * @param subdirectory Prefix to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public S3LocationState build() {
            return $;
        }
    }

}
